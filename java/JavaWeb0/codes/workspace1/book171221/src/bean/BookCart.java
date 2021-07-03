package bean;
import java.sql.*;
/**
 * 购物车类
 *
 */
public class BookCart {
	/**
	 * 编号
	 */ 
	private int id;
	/**
	 * 名称
	 */ 
	private String name;
	/**
	 * 单价
	 */ 
	private float unitPrice;
	/**
	 *  数量
	 */
	private int number;
	/**
	 * 总价
	 */ 
	private float totalPrice;
	
	/**
	 * 添加日期
	 */
	private Date addDate;
	
	/**
	 * 图书编号
	 */ 
	private int bookId;
	/**
	 * 用户姓名
	 */
	private String userName;
	
	/**
	 * 获得图书编号
	 * @return
	 */
	public int getBookId() {
		return bookId;
	}
	/**
	 * 设置图书编号
	 * @param bookId
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	/**
	 * 无参构造函数
	 *
	 */
	public BookCart() {
	// TODO Auto-generated constructor stub
	}
	/**
	 * 带参构造函数
	 * @param id
	 * @param name
	 * @param unitPrice
	 * @param number
	 * @param totalPrice
	 * @param addDate
	 * @param bookId
	 * @param userName
	 */
	public BookCart(int id, String name, float unitPrice, int number, float totalPrice, Date addDate, int bookId, String userName) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.number = number;
		this.totalPrice = totalPrice;
		this.addDate = addDate;
		this.bookId = bookId;
		this.userName = userName;
	}
	/**
	 * 获得添加日期
	 */ 
	public Date getAddDate() {
		return addDate;
	}
	/**
	 * 设置添加日期
	 * @param addDate
	 */
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	/**
	 *  获得编号
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * 设置编号
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获得数量
	 * @return
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * 设置数量
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/**
	 * 获得总价
	 * @return
	 */
	public float getTotalPrice() {
		return totalPrice;
	}
	/**
	 * 设置总价
	 * @param totalPrice
	 */
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	/**
	 * 获得单价
	 * @return
	 */
	public float getUnitPrice() {
		return unitPrice;
	}
	/**
	 * 设置单价
	 * @param unitPrice
	 */
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	/**
	 * 获得名称
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置名称
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获得用户名
	 * @return
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置用户名
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
