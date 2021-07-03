package bean;

/**
 * 图书销售记录类
 */
public class TradeRecord {

	/**
	 * 编号
	 */
	private int id;

	/**
	 * 用户编号
	 */
	private int userId;
	

	/**
	 * 图书编号
	 */
	private int bookId;
	
	/**
	 * 交易数量
	 */
	private int tradeNum;
	/**
	 * 交易总额
	 */
	private double sum;
	
	/**
	 * 无参构造函数
	 */
	public TradeRecord() {

	}

	/**
	 * 带参构造函数
	 * @param id
	 * @param userId
	 * @param bookId
	 * @param tradeNum
	 * @param sum
	 */
	public TradeRecord(int id, int userId, int bookId, int tradeNum, double sum) {
		super();
		this.id = id;
		this.userId = userId;
		this.bookId = bookId;
		this.tradeNum = tradeNum;
		this.sum = sum;
	}
	
	/**
	 * 获得图书编号信息
	 * @return
	 */
	public int getBookId() {
		return bookId;
	}
	
	/**
	 * 修改图书编号信息
	 * @param bookId
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	/**
	 * 获得交易编号
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * 修改交易编号
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获得交易总额
	 * @return
	 */
	public double getSum() {
		return sum;
	}
	/**
	 * 修改交易总额
	 * @param sum
	 */
	public void setSum(double sum) {
		this.sum = sum;
	}

	/**
	 * 获得交易数量
	 * @return
	 */
	public int getTradeNum() {
		return tradeNum;
	}
	/**
	 * 修改交易数量
	 * @param tradeNum
	 */
	public void setTradeNum(int tradeNum) {
		this.tradeNum = tradeNum;
	}
	/**
	 * 获得用户ID
	 * @return
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * 修改用户ID
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
