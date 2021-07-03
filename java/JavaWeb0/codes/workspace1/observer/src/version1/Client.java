package version1;

public class Client {
	public static void main(String[] args){
		Moniter 姚雯 =new Moniter();
		
		Student stu1 = new Student("李鹏");
		Student stu2 = new Student("姚鑫");
		
		姚雯.attach(stu1);//绑定！
		姚雯.attach(stu2);//绑定！
		
		姚雯.inform("老师不在");
		姚雯.dettach(stu1);//解绑
		姚雯.inform("老师在");	
	}
}
