package service;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Book;
import bean.BookCategory;
import dao.BookCategoryDAO;
import dao.BookDAO;

/**
 * 该类用于得到图书和分类信息
 * 
 * 
 */ 
public class BookService {
	
	/**
	 * 获得所有图书分类列表
	 * 
	 * @return List<BookCategory> 图书分类列表
	 */
	public List<BookCategory>  getCategoryList(){
		
		List<BookCategory> categoryList;
		BookCategoryDAO bcdao = new BookCategoryDAO();
		categoryList = bcdao.querryCategory();
		return categoryList;
	}
	
	
	/**
	 * 添加图书分类
	 * 
	 * @return 
	 */
	public void  addCategory(String categoryName){
		
		BookCategoryDAO bcdao = new BookCategoryDAO();
		BookCategory bc = bcdao.querryUseName(categoryName);

		if (bc.getName() == null) {
			bc.setName(categoryName);
			bcdao.insert(bc);
		}
	}
	
	/**
	 * 修改图书分类
	 * 
	 * @return 
	 */
	public void  modifyCategory(HttpServletRequest request,HttpServletResponse response){
		
		try {
			request.setCharacterEncoding("utf-8");
			
			String categoryName = request.getParameter("categoryName");
			int categoryId = Integer.parseInt(request.getParameter("categoryId"));
	
			BookCategoryDAO bcdao = new BookCategoryDAO();
			BookCategory bc = bcdao.querryUseName(categoryName);
			if(bc.getName()==null){
			
				bc.setId(categoryId);
				bc.setName(categoryName);
	
				bcdao.update(bc);
			}else{
				request.setAttribute("Error", "与其他分类信息重名！请再次输入");
				RequestDispatcher rd=request.getRequestDispatcher("modifyCategory.jsp");
				rd.forward(request, response);
			}
		
			response.sendRedirect("categoryManage.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	/**
	 * 用于删除一种图书类别
	 * 
	 * @param request
	 * @param response
	 */
	public void deleteCategory(String  id) {
		BookCategoryDAO bcdao = new BookCategoryDAO();
		bcdao.delete(Integer.valueOf(id).intValue());
	}
	
	/**
	 * 获得所有图书信息
	 * 
	 * @return List<Book> 图书列表
	 */
	public List<Book>  getBookList(){
		List<Book> bookList;
		BookDAO bookdao = new BookDAO();
		bookList = bookdao.querryAllBooks();
		return bookList;
	}
	
	/**
	 * 获得所有指定图书信息
	 * 
	 * @param bookId 图书ID
	 * @return Book 图书
	 */
	public Book  getBook(String bookId){
		Book book;
		BookDAO bookdao = new BookDAO();
		book = bookdao.querryBookbyId(Integer.parseInt(bookId));
		return book;
	}
	
	/**
	 * 获得所有指定图书分类信息
	 * 
	 * @param book 图书
	 * @return Book 指定图书分类
	 */
	public String getOneBookCategory(Book book){
		String categoryName="" ;
		List<BookCategory> categoryList=getCategoryList();
		for(BookCategory category:categoryList){
			if(category.getId()==book.getCategoryId()){
				categoryName =category.getName();
			}
		}
		return categoryName;
	}
}
