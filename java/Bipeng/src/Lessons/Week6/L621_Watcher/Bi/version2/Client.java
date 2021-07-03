package Lessons.Week6.L621_Watcher.Bi.version2;

public class Client {
	public static void main(String[] args){
		Monitor m1 = new Monitor();

		Observer o1 = new GameStudent("ZhenNan.Li");
		Observer o2 = new PhoneStudent("Dc.Yang");

        m1.attach(o1);
        m1.attach(o2);

        m1.change("tt");
        m1.dettach(o2);
        m1.change("tf");
	}
}
