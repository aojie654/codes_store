package observer2;

public class Client {
	public static void main(String[] args){
		Boss boss =new Boss();
		Observer o1 = new NBAObserver("小王");
		Observer o2 = new GameObserver("小李");
		boss.attach(o1);//绑定！
		boss.attach(o2);
		boss.change("老板在");
		boss.change("老板不在");
	}
}
