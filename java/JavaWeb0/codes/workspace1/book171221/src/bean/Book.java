package bean;

import java.sql.Date;
//javabean 根据功能可以分为数据bean
/**
 * 图书信息
 */
public class Book {
	
	/**
	 * 编号
	 */
	private int id;
	
	/**
	 * 书名
	 */
	private String name;
	/**
	 * 书ISBN
	 */
	private String isbn;
	
	/**
	 * 作者
	 */
	private String author;
	
	/**
	 * 出版商
	 */
	private String publishing;
	
	/**
	 * 价格
	 */
	private float price;
	
	/**
	 * 这种书当前剩余的本数
	 */
	private  int remainNum;
	
	/**
	 * 所属的目录编号
	 */
	private int categoryId;
	
	/**
	 * 内容简介
	 */
	private String introduction;
	
	/**
	 * 上架本数
	 */
	private  int onSaleNum;
	
	/**
	 * 上架日期
	 */
	private Date onSaleDate;
	
	/**
	 * 出版日期
	 */
	private Date onPublishDate;
	
	/**
	 * 图片路径
	 */
	private String image;
	

	public Book(int id, String name,String isbn, String author, String publishing, float price, int remainNum, int categoryId, String introduction, int onSaleNum, Date onSaleDate,Date onPublishDate,String image) {
		super();
		this.id = id;
		this.name = name;
		this.isbn = isbn;
		this.author = author;
		this.publishing = publishing;
		this.price = price;
		this.remainNum = remainNum;
		this.categoryId = categoryId;
		this.introduction = introduction;
		this.onSaleNum = onSaleNum;
		this.onSaleDate = onSaleDate;
		this.onPublishDate = onPublishDate;
		this.image = image;
	}
	
	/**
	 * 构造函数
	 *
	 */
	public Book() {
		super();
	}
	/**
	 * 获得入库数量
	 * @return
	 */
	public int getOnSaleNum() {
		return onSaleNum;
	}
	/**
	 * 设置入库数量
	 * @param onSaleNum
	 */
	public  void setOnSaleNum(int onSaleNum) {
		this.onSaleNum = onSaleNum;
	}
	
	/**
	 * 获得现有库存数量
	 * @return
	 */
	public  int getRemainNum() {
		return remainNum;
	}
	
	/**
	 * 设置库存数量
	 * @param remainNum
	 */
	public  void setRemainNum(int remainNum) {
		this.remainNum = remainNum;
	}

	/**
	 * 得到作者
	 * @return
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * 设置作者
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * 得到出版社
	 * @return
	 */
	public String getPublishing() {
		return publishing;
	}
	
	/**
	 * 设置出版社
	 * @param publishing
	 */
	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}
	/**
	 * 得到类别ID
	 * @return
	 */
	public int getCategoryId() {
		return categoryId;
	}
	
	/**
	 * 设置类别ID
	 * @param categoryId
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	/**
	 * 得到ID
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * 设置ID
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * 得到介绍
	 * @return
	 */
	public String getIntroduction() {
		return introduction;
	}
	
	/**
	 * 设置图书介绍
	 * @param introduction
	 */
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	/**
	 * 得到书名
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 设置书名
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 得到入库日期
	 * @return
	 */
	public Date getOnSaleDate() {
		return onSaleDate;
	}
	
	/**
	 * 设置入库日期
	 * @param onSaleDate
	 */
	public void setOnSaleDate(Date onSaleDate) {
		this.onSaleDate = onSaleDate;
	}
	
	/**
	 * 得到单价
	 * @return
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * 设置单价
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * 得到ISBN
	 * @return
	 */
	public String getIsbn() {
		return isbn;
	}
	
	/**
	 * 设置ISBN
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * 得到出版日期
	 * @return
	 */
	public Date getOnPublishDate() {
		return onPublishDate;
	}
	
	/**
	 * 设置出版日期
	 * @param onPublishDate
	 */
	public void setOnPublishDate(Date onPublishDate) {
		this.onPublishDate = onPublishDate;
	}

	/**
	 * 得到照片
	 * @return
	 */
	public String getImage() {
		return image;
	}
	
	/**
	 * 设置照片路径
	 * @param image
	 */
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
