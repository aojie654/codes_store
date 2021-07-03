package version2;
//红路灯作业  汽车根据红路灯 停车或过马路！例子
public class Client {
	public static void main(String[] args){
		Monitor  mon = new Monitor();
		
		Observer o1 = new GameStudent("李鹏");
		Observer o2 = new PhoneStudent("姚鑫");
		mon.attach(o1);
		mon.attach(o2);
		mon.change("老师在");
		//mon.dettach(o1);
		mon.change("老师不在");
	}
}
