package observer;

public class Client {
	public static void main(String[] args){
		Secretary mi =new Secretary();
		Observer o1 = new Observer("小王");
		Observer o2 = new Observer("小李");
		mi.attach(o1);//绑定！
		mi.attach(o2);
		mi.setState("老板不在");
		mi.nodify();//通知大家
		mi.setState("老板回来了！");
		mi.nodify();//通知大家
	}
}
