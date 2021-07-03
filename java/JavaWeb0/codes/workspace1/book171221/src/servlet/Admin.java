package servlet;

import java.io.File;
import java.io.IOException;

import java.sql.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//
//import org.apache.commons.fileupload.FileItem;
//import org.apache.commons.fileupload.disk.DiskFileItemFactory;
//import org.apache.commons.fileupload.servlet.ServletFileUpload;

import bean.*;
import dao.*;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

/**
 * Admin类负责处理管理员相关事务
 *
 */
public class Admin extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public Admin() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		doPost(request,response);
	}
	
	/**
	 * 
	 *处理用户请求,先判断是否为合法用户,若为合法用户则处理用户请求
	 * 
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		if(session.getAttribute("admin")==null){
			
			request.getRequestDispatcher("../userView/adminLogin.jsp").forward(request,response);
		}else{
			toRequest(request,response);
		}
			
	}
	
	/**
	 * 用来处理不同的业务请求
	 */
	public void toRequest(HttpServletRequest request, HttpServletResponse response) {

		if (request.getParameter("requestType").equals("deleteBook")) {
			System.out.println(request.getParameter("requestType"));
			System.out.println(request.getParameter("ID"));
			this.deleteBook(request, response);
		}

		if (request.getParameter("requestType").equals("sales")) {
			this.setAttribute(request, response);
		}

		if (request.getParameter("requestType").equals("addCategory")) {
			this.addCategory(request, response);
		}
		if (request.getParameter("requestType").equals("modifyCategory")) {
			this.modifyCategory(request, response);
		}

		if (request.getParameter("requestType").equals("addBook")) {
			this.addBook(request, response);
		}
		if (request.getParameter("requestType").equals("modifyBook")) {
			this.modifyBook(request, response);
		}
		if (request.getParameter("requestType").equals("logout")) {

			this.logout(request, response);
		}
		if (request.getParameter("requestType").equals("query")) {
			this.query(request, response);
		}
		if (request.getParameter("requestType").equals("delete")) {

			deleteCategory(request, response);

		}
	}

	/**
	 * 管理员退出时清空记录
	 * 
	 * @param request
	 * @param response
	 */
	public void logout(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession();
		session.invalidate();
		try {
			String path=request.getServletContext().getContextPath();
			response.sendRedirect(path+"/index.jsp");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	/**
	 * 用于修改一本书的基本信息
	 * 
	 * @param request
	 * @param response
	 */
	public void modifyBook(HttpServletRequest request, HttpServletResponse response) {

		String name = request.getParameter("name");
		int categoryId = Integer.parseInt(request.getParameter("categoryId"));
		float price = Float.parseFloat(request.getParameter("price"));
		String author = request.getParameter("author");
		String publishing = request.getParameter("publishing");
		int onSaleNum = Integer.parseInt(request.getParameter("onSaleNum"));
		int remainNum = Integer.parseInt(request.getParameter("remainNum"));
		Date onSaleDate = Date.valueOf(request.getParameter("onSaleDate"));
		String introduction = request.getParameter("introduction");

		int bookId = Integer.parseInt(request.getParameter("bookId"));
		BookDAO bookdao = new BookDAO();
		Book book = bookdao.querryBookbyId(bookId);

		book.setName(name);
		book.setAuthor(author);
		book.setPublishing(publishing);
		book.setOnSaleNum(onSaleNum);
		book.setRemainNum(remainNum);
		book.setPrice(price);
		book.setCategoryId(categoryId);
		book.setIntroduction(introduction);
		book.setOnSaleDate(onSaleDate);

		bookdao.update(book);

		try {
			response.sendRedirect("../managerView/bookInfoManage.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 用于增加一本书
	 * 
	 * @param request
	 * @param response
	 */
	public void addBook(HttpServletRequest request, HttpServletResponse response) {

		// 从jsp输入获得照片
		response.setContentType("text/html");

		// 图片上传路径
		String uploadPath = request.getSession().getServletContext().getRealPath("/") + "upload/images/";
		//String uploadPath = request.getContextPath() + "upload/images/";
		//String uploadPath = "/upload/images/";
		System.out.println(uploadPath);
		// 图片临时上传路径
		String tempPath = request.getSession().getServletContext().getRealPath("/") + "upload/images/temp/";
		//String tempPath = "/upload/images/temp/";
		System.out.println(tempPath);
		// 图片网络相对路径
		String imagePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
				+ request.getContextPath() + "/";

		HashMap<String, String> map = new HashMap<String, String>();
		
		String isbn = null;
		String image = null;
		
		File fileUpload;
		File fileTempUpload=null;
		// 文件夹不存在就自动创建：
		if (!new File(uploadPath).isDirectory()) {
			fileUpload=new File(uploadPath);
			fileUpload.mkdirs();
		}
		if (!new File(tempPath).isDirectory()) {
			fileTempUpload=new File(tempPath);
			fileTempUpload.mkdirs();
		}

		try {

			DiskFileItemFactory factory = new DiskFileItemFactory();// 磁盘对象
			factory.setRepository(fileTempUpload); // 设置临时目录
			factory.setSizeThreshold(1024 * 8); // 8k的缓冲区,文件大于8K则保存到临时目录
			ServletFileUpload upload = new ServletFileUpload(factory);// 声明解析request的对象
			upload.setHeaderEncoding("UTF-8"); // 处理文件名中文
			upload.setFileSizeMax(1024 * 1024 * 5);// 设置每个文件最大为5M
			upload.setSizeMax(1024 * 1024 * 10);// 一共最多能上传10M
			String[] allowTypes = new String[] { ".jpg", ".jpeg", ".png" };
			// String ISBN=request.getParameter("ISBN");

			// 得到所有的文件：
			List<FileItem> fileItems = upload.parseRequest((RequestContext) request);

			Iterator<FileItem> i = fileItems.iterator();

			// 依次处理每一个文件：
			while (i.hasNext()) {
				FileItem item = (FileItem) i.next();
				if (!item.isFormField()) {

					// 获得文件名，这个文件名是用户上传时用户的绝对路径：
					String sourcefileName = item.getName();

					if (sourcefileName != null) {

						boolean allowUpload = false;

						for (String allowType : allowTypes) {
							if (sourcefileName.endsWith(allowType)) {
								allowUpload = true;
								isbn =map.get("isbn");
								String finalImageName = isbn + allowType;
								image=finalImageName;
								// 在这里可以记录用户和文件信息,生成上传后的文件名
								File f1 = new File(uploadPath + finalImageName);
								item.write(f1);
								System.out.println(sourcefileName + "成功上传！");
								System.out.println("<img src="+imagePath+"upload/images/"+finalImageName+">");
							}

						}
						if (!allowUpload) {
							System.out.println("上传文件出错，只能上传 *.jpg , *.jpeg,*.png");
						}
					}

				} else {
					String name = item.getFieldName();// 控件名
					String value = item.getString("UTF-8");
					map.put(name, value);

				}
			}

			// 从map中获得文本信息
			String name = map.get("name");
			
			int categoryId = Integer.parseInt(map.get("categoryId"));
			float price = Float.parseFloat(map.get("price"));
			String author = map.get("author");
			String publishing = map.get("publishing");
			int onSaleNum = Integer.parseInt(map.get("onSaleNum"));
			int remainNum = Integer.parseInt(map.get("remainNum"));
			Date onSaleDate = Date.valueOf(map.get("onSaleDate"));
			Date onPublishDate = Date.valueOf(map.get("onPublishDate"));
			String introduction = map.get("introduction");
			//image
			
			BookDAO bookdao = new BookDAO();
			Book book = new Book();
			book.setId(0);
			book.setName(name);
			book.setIsbn(isbn);
			book.setAuthor(author);
			book.setPublishing(publishing);
			book.setOnSaleNum(onSaleNum);
			book.setRemainNum(remainNum);
			book.setPrice(price);
			book.setCategoryId(categoryId);
			book.setIntroduction(introduction);
			book.setOnSaleDate(onSaleDate);
			book.setOnPublishDate(onPublishDate);
			book.setImage(image);
			
			bookdao.insert(book);

			response.sendRedirect("/BookStore/managerView/bookInfoManage.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	/**
	 * 到数据库中取得销售记录
	 * 
	 * @param request
	 * @param response
	 */
	public void setAttribute(HttpServletRequest request, HttpServletResponse response) {
		List<TradeRecord> records;
		TradeRecordDAO trdao = new TradeRecordDAO();
		records = trdao.querryRecord();
		request.setAttribute("records", records);

		try {
			request.getRequestDispatcher("../managerView/salesInfo.jsp").forward(request, response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 用于修改一个图书类别信息
	 * 
	 * @param request
	 * @param response
	 */
	public void modifyCategory(HttpServletRequest request, HttpServletResponse response) {
		String categoryName = request.getParameter("categoryName");
		int categoryId = Integer.parseInt(request.getParameter("categoryId"));

		BookCategoryDAO bcdao = new BookCategoryDAO();
		BookCategory bcNew = bcdao.querry(categoryId);
		bcNew.setName(categoryName);
		
		bcdao.update(bcNew);
		try {
			response.sendRedirect("../managerView/categoryManage.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 用于增加一个图书类别信息
	 * 
	 * @param request
	 * @param response
	 */
	public void addCategory(HttpServletRequest request, HttpServletResponse response) {
		String categoryName = request.getParameter("categoryName");

		BookCategoryDAO bcdao = new BookCategoryDAO();
		BookCategory bc = bcdao.querryUseName(categoryName);

		if (bc.getName() == null) {
			bc = new BookCategory();
			bc.setName(categoryName);
			bcdao.insert(bc);
		}
		try {
			response.sendRedirect("../managerView/categoryManage.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 用于向数据库中增加一种书
	 * 
	 * @param request
	 * @param response
	 */
	public void setBook(HttpServletRequest request, HttpServletResponse response) {

		// 从JSP输入中获得信息
		String name = request.getParameter("name");

		int categoryId = Integer.parseInt("categoryId");
		float price = Float.parseFloat(request.getParameter("price"));

		String author = request.getParameter("author");
		String publishing = request.getParameter("publishing");
		int onSaleNum = Integer.parseInt(request.getParameter("onSaleNum"));
		int remainNum = Integer.parseInt(request.getParameter("remainNum"));
		Date onSaleDate = Date.valueOf(request.getParameter("onSaleDate"));
		String introduction = request.getParameter("introduction");
		//
		Book book = new Book();
		//
		book.setName(name);
		book.setAuthor(author);
		book.setPublishing(publishing);
		book.setOnSaleNum(onSaleNum);
		book.setRemainNum(remainNum);
		book.setPrice(price);
		book.setCategoryId(categoryId);
		book.setIntroduction(introduction);
		book.setOnSaleDate(onSaleDate);

		//
		BookDAO bookdao = new BookDAO();
		try {
			bookdao.insert(book);
			response.sendRedirect("/BookStore/managerView/bookInfoManage.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 用于删除数据库中一种书
	 * 
	 * @param request
	 * @param response
	 */
	public void deleteBook(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.valueOf((String) request.getParameter("ID")).intValue();
		BookDAO bdao = new BookDAO();
		bdao.delete(id);
		try {
			request.getRequestDispatcher("../managerView/bookInfoManage.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 用于查询一种书的详细信息
	 * 
	 * @param request
	 * @param response
	 */
	private void query(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			int id = Integer.valueOf(request.getParameter("ID")).intValue();

			BookDAO bookDAO = new BookDAO();
			Book book = (Book) bookDAO.querryBookbyId(id);
			BookCategoryDAO bcdao = new BookCategoryDAO();
			BookCategory bc = bcdao.querry(book.getCategoryId());

			request.setAttribute("categoryName", bc.getName());
			request.setAttribute("book", book);

			request.getRequestDispatcher("../userView/bookInfo.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 用于删除一种图书类别
	 * 
	 * @param request
	 * @param response
	 */
	public void deleteCategory(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("categoryId");
		BookCategoryDAO bcdao = new BookCategoryDAO();
		bcdao.delete(Integer.valueOf(id).intValue());
		try {
			response.sendRedirect("/BookStore/managerView/categoryManage.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
