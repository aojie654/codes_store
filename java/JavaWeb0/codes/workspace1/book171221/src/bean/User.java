package bean;
//jsp（display.jsp+doxxx.jsp）+javabean开发模式！
//jsp(display.jsp)+servlet(doxxx.jsp) +javaBean(数据bean+业务bean)开发模式！
// java + js +html5 +mysql
import java.util.Calendar;
import java.sql.Date;
/**
 * 用户类
 */
public class User {
	
	/**
	 * 拥护编号
	 */
	private int id;
	
	/**
	 * 用户姓名
	 */
	private String name;
	
	/**
	 * 用户密码
	 */
	private String pass;
	
	/**
	 * 用户性别
	 */
	private String sex;
	
	/**
	 * 用户年龄
	 */
	private int age;
	
	/**
	 * 用户的身份，管理员或者普通用户
	 */
	private int role;
	
	/**
	 * 真实姓名
	 */
	private String realName;
	
	/**
	 * 联系电话
	 */
	private String phone;
	
	/**
	 * 电子邮件
	 */
	private String email;
	
	/**
	 * 联系地址
	 */
	private String address;
	
	/**
	 * 注册日期
	 */
	private Date registerDate;

	/**
	 * 无参构造函数
	 */
	public User() {
	}
	
	/**
	 * 带参构造函数
	 * @param id
	 * @param name
	 * @param pass
	 * @param sex
	 * @param age
	 * @param role
	 * @param realName
	 * @param phone
	 * @param email
	 * @param address
	 * @param postcode
	 * @param registerDate
	 */
	public User(int id, String name, String pass, String sex, int age, int role, String realName, String phone, String email, String address, Date registerDate) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.sex = sex;
		this.age = age;
		this.role = role;
		this.realName = realName;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.registerDate = registerDate;
	}
	
	public User(String id,String name,String realName, String phone, String email, 
			String address,String age,String sex) {
		super();
		this.id=Integer.valueOf(id);
		this.name = name;
		this.sex = sex;
		this.age = Integer.valueOf(age);
		this.realName = realName;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	public User(String name,String realName, String phone, String email, String address,String age,String sex) {
		super();
		this.name = name;
		this.pass = "123";
		this.sex = sex;
		this.age = Integer.valueOf(age);
		this.role = 1;
		this.realName = realName;
		this.phone = phone;
		this.email = email;
		this.address = address;
		//从系统中获得注册日期
		Calendar cal = Calendar.getInstance();
		java.util.Date utilDate=cal.getTime();
		this.registerDate =new Date(utilDate.getTime());

	}
	
	/**
	 * 获得联系地址
	 * @return
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置联系地址
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 *  获得年龄
	 * @return
	 */
	public int getAge() {
		return age;
	}
	/**
	 * 设置年龄
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 *  获得电邮地址
	 * @return
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置电邮地址
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获得编号
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
	// 获得用户名
	public String getName() {
		return name;
	}
	/**
	 * 设置用户名
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获得密码
	 * @return
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * 设置密码
	 * @param pass
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	/**
	 * 获得联系电话
	 * @return
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置联系电话
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获得真实姓名
	 * @return
	 */
	public String getRealName() {
		return realName;
	}
	/**
	 * 设置真实姓名
	 * @param realName
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	/**
	 *  获得注册日期
	 * @return
	 */
	public Date getRegisterDate() {
		return registerDate;
	}
	/**
	 *  设置注册日期
	 * @param registerDate
	 */
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	/**
	 * 获得用户身份
	 * @return
	 */
	public int getRole() {
		return role;
	}
	/**
	 * 设置用户身份
	 * @param role
	 */
	public void setRole(int role) {
		this.role = role;
	}
	/**
	 * 获得性别
	 * @return
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 设置性别
	 * @param sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

}
