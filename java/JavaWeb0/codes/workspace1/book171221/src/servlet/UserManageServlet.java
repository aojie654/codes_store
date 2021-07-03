package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import service.UserService;

/**
 * Servlet implementation class UserManageServlet
 */
public class UserManageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserManageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Admin doPost方法
		HttpSession session = request.getSession();
		if(session.getAttribute("admin")==null){
			request.getRequestDispatcher("../userView/adminLogin.jsp").forward(request,response);
		}else{
			doWork(request,response);
		}
	}
	public void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		String doType=(String)request.getParameter("doType");
		try {
			if(doType.equals("userDisplay")){
				doUserDisplay(request,response);}
			if(doType.equals("multiDelete")){
				doMultiDelete(request,response);}
			if(doType.equals("deleteUser")){
				doDeleteUser(request,response);}
			if(doType.equals("addUser")){
				doAddUser(request,response);}
			if(doType.equals("modifyUser")){
				doModifyUser(request,response);}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//user display
	public void doUserDisplay(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		UserService userService = new UserService();
		List<User> userList = userService.getUserList();
		request.setAttribute("userList", userList);
		request.getRequestDispatcher("managerView/user/userManage.jsp").forward(request,response);
	}
	//doMultiDelete.jsp
	public void doMultiDelete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String[] ids=request.getParameterValues("delete");//把所有的被选上的id取过来！
		UserService userService = new UserService();
		userService.deleteUsers(ids);   
		doUserDisplay(request,response);
		//response.sendRedirect("managerView/user/userManage.jsp");
	}	
	//delete user by id 
	public void doDeleteUser(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String id =request.getParameter("userId");
		UserService userService = new UserService();
		userService.deleteUser(id); 
		doUserDisplay(request,response);
		//response.sendRedirect("managerView/user/userManage.jsp");	
	}
	//add user  doAddUser.jsp
	public void doAddUser(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");//解码！
		
		String name=request.getParameter("name");
		String realName=request.getParameter("realName");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String age=request.getParameter("age");
		String sex=request.getParameter("sex");

		//int id, String name, String pass, String sex, int age, int role, String realName, String phone, String email, String address, Date registerDate
		User user = new User(name,realName,phone,email,address,age,sex); 
		UserService us= new UserService();
		us.insertUser(user); 
		doUserDisplay(request,response);
		//response.sendRedirect("managerView/user/userManage.jsp");
	}
	//modify user  doModifyUser.jsp
	public void doModifyUser(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");//解码！
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String realName=request.getParameter("realName");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String age=request.getParameter("age");
		String sex=request.getParameter("sex");

		//int id, String name, String pass, String sex, int age, int role, String realName, String phone, String email, String address, Date registerDate
		User user = new User(id,name,realName,phone,email,address,age,sex); 
		UserService us= new UserService();
		us.updateUser(user);  
		doUserDisplay(request,response);
		//response.sendRedirect("managerView/user/userManage.jsp");//跳转到user首页！
	}
}
