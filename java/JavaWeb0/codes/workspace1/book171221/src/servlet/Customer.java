package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBmanager.DBManager;
import bean.*;
import dao.*;

/**
 * Customer类负责处理登陆用户相关事务
 *
 */
public class Customer extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public Customer() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, 

HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * 
	 * 处理用户请求,先判断是否为合法用户,若为合法用户则处理

用户请求
	 * 
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, 

HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		if (session.getAttribute("userInfo") == null) {

			request.getRequestDispatcher

("../userView/userLogin.jsp").forward(request, response);
		} else {
			toRequest(request, response);
		}

	}

	/**
	 * 根据用户不同的请求进行不同的回应
	 */
	public void toRequest(HttpServletRequest request, 

HttpServletResponse response) {
		try {

			if (request.getParameter

("requestType").equals("addCart")) {

				addCart(request, response);
			} else if (request.getParameter

("requestType").equals("changeCart")) {

				changeCart(request, response);
			} else if (request.getParameter

("requestType").equals("payBook")) {

				payBook(request, response);
			} else if (request.getParameter

("requestType").equals("showCart")) {

				showCart(request, response);
			} else if (request.getParameter

("requestType").equals("deleteBook")) {

				deleteBook(request, response);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	/**
	 * 在购物车中删除一本书.
	 * 
	 * @param request
	 * @param response
	 */
	public void deleteBook(HttpServletRequest request, 

HttpServletResponse response) {

		String id = request.getParameter("bookId");
		BookCartDAO bDAO = new BookCartDAO();
		try {
			bDAO.deleteCart(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		showCart(request, response);

	}

	/**
	 * 用户结帐时对数据库进行相应的操作
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	public void payBook(HttpServletRequest request, 

HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
		String userName = ((User) session.getAttribute

("userInfo")).getName();
		
		DBManager dbm = new DBManager();
		Connection conn = dbm.getConnection();
		try{
			dbm.startTransaction(conn);
			
			BookCartDAO bookCartDAO=new 

BookCartDAO(dbm,conn);
			BookDAO bookDAO = new BookDAO

(dbm,conn);
			TradeRecordDAO tradeRecordDAO = new 

TradeRecordDAO(dbm,conn);
			
			List<BookCart> al = 

bookCartDAO.querryCart(userName);
			
			int userId = ((User) (session.getAttribute

("userInfo"))).getId();
			int bookId;
			int tradeNum;
			double sum;
			for(BookCart cart:al){
	
				bookId = cart.getBookId();
				tradeNum = cart.getNumber();
				sum = cart.getTotalPrice();
				TradeRecord td = new 

TradeRecord(); 
				td.setBookId(bookId);
				td.setUserId(userId);
				td.setSum(sum);
				td.setTradeNum(tradeNum);
				
				tradeRecordDAO.insertRecord

(td);
				bookDAO.updateNum(bookId, 

tradeNum);
			}
			bookCartDAO.deleteUserCart(userName);
			
			dbm.commitTransaction(conn);
		}catch(SQLException e){
			System.out.println("error ! dB");
			dbm.rollbackTransaction(conn);
		}
		PrintWriter out=response.getWriter();

//		out.print("<script>");
//		out.print("alert('congratulations,books purchase successed!');");
//		out.print("</script>");
		response.sendRedirect(request.getContextPath()

+"/userView/userPage.jsp");

	}

	/**
	 * 显示用户购物车中的内容
	 * 
	 * @param request
	 * @param response
	 */
	public void showCart(HttpServletRequest request, 

HttpServletResponse response) {

		BookCartDAO bDAO = new BookCartDAO();
		HttpSession session = request.getSession();
		String userName = ((User) session.getAttribute

("userInfo")).getName();
		List<BookCart> al = bDAO.querryCart(userName);
		try {

			request.setAttribute("cart", al);
			request.getRequestDispatcher

("../userView/cart.jsp").forward(request, response);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	/**
	 * 用户加入购物车后对数据库的操作
	 * 
	 * @param request
	 * @param response
	 */
	public void changeCart(HttpServletRequest request, 

HttpServletResponse response) {

		try {
			String sqlType =(String)

request.getParameter("sqlType");
			if(sqlType!=null&&sqlType.equals

("insert")){
				insertCart(request,response);
				
			}else{
				
				updateCart(request,response);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	/**
	 * 用户加入购物车后对数据库的操作
	 * 
	 * @param request
	 * @param response
	 */
	public void insertCart(HttpServletRequest request, 

HttpServletResponse response) {

		try {
			int num = Integer.parseInt

(request.getParameter("number"));
			float unitPrice = Float.parseFloat

(request.getParameter("unitPrice"));
			HttpSession session = request.getSession();
			String userName = ((User) 

session.getAttribute("userInfo")).getName();
			BookCart cart = new BookCart();
			cart.setBookId(Integer.parseInt

(request.getParameter("bookId")));
			cart.setUserName(userName);
			cart.setName(request.getParameter

("bookName"));
			cart.setNumber(num);
			cart.setUnitPrice(unitPrice);
			cart.setTotalPrice(num * unitPrice);
			Calendar calendar = Calendar.getInstance

();
			java.util.Date utilDate = calendar.getTime

();
			Date date = new Date(utilDate.getTime());
			// Date date = new
			// Date(calendar.get(Calendar.YEAR)-1900,calendar.get(Calendar.MONTH),calendar.get(Calendar.DATE));
			cart.setAddDate(date);
			BookCartDAO bDAO = new 

BookCartDAO();
			bDAO.insertCart(cart);
			showCart(request, response);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	/**
	 * 用户加入购物车后对数据库的操作
	 * 
	 * @param request
	 * @param response
	 */
	public void updateCart(HttpServletRequest request, 

HttpServletResponse response) {

		try {
			
			float num = Integer.parseInt

(request.getParameter("number"));
			float unitPrice = Float.parseFloat

(request.getParameter("unitPrice"));
			BookCart cart = new BookCart();
			cart.setBookId(Integer.parseInt

(request.getParameter("bookId")));
			cart.setNumber(Integer.parseInt

(request.getParameter("number")));
			cart.setUnitPrice(unitPrice);
			cart.setTotalPrice(num * unitPrice);
			Calendar calendar = Calendar.getInstance

();
			java.util.Date utilDate = calendar.getTime

();
			Date date = new Date(utilDate.getTime());
			cart.setAddDate(date);
			BookCartDAO bDAO = new 

BookCartDAO();
			bDAO.updateCart(cart);
			showCart(request, response);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}


	/**
	 * 响应用户加入购物车请求,并到相应的页面接受购买参数
	 * 
	 * @param request
	 * @param response
	 */
	public void addCart(HttpServletRequest request, 

HttpServletResponse response) {

		try {
			int bookId = Integer.parseInt

(request.getParameter("bookId"));
			BookDAO bookdao = new BookDAO();
			Book book = bookdao.querryBookbyId

(bookId);
			BookCartDAO cartDao = new 

BookCartDAO();
			
			User user = (User) request.getSession

().getAttribute("userInfo");
			request.setAttribute("addBook", book);
			
			BookCart cart = cartDao.querryCartById

(user.getName(), bookId);
			
			if (cart!=null) {
				request.setAttribute

("cartBookNum", cart.getNumber());
				request.setAttribute

("sqlType","update" );
				
			}else{
				request.setAttribute

("cartBookNum", 1);
				request.setAttribute

("sqlType","insert" );
			}
			request.getRequestDispatcher

("../userView/addCart.jsp").forward(request, response);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException
	 *             if an error occure
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
