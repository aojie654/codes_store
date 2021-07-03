package bean;

/**
 * 图书分类信息
 */
public class BookCategory {
	
	/**
	 * 类别ID
	 */
	private int id;
	
	/**
	 * 类别名
	 */
	private String name;
	
	/**
	 * 构造函数
	 *
	 */
	public BookCategory() {
		super();
	}
	
	/**
	 * 获得类别ID
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * 设置类别ID
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获得类别名
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 设置类别名
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 带参构造函数
	 * @param id
	 * @param name
	 */
	public BookCategory(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
