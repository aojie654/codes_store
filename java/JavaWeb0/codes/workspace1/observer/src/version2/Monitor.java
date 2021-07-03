package version2;

public class Monitor extends Subject{

	public void change(String newState){
        this.setState(newState);
        System.out.println("新状态为：" + newState);
        //状态发生改变，通知各个观察者
        this.inform(newState);
        //教师还有做具体工作！
    }
}
