package basic;

public abstract class Animal {
	//生命属性
	public boolean isAlive;
	public Animal(){
		isAlive =true;
		System.out.println("一个新生命诞生了！");
	}
	//新陈代谢方法依赖O2和Water类 依赖关系！
	public void inAndOut(O2 o2,Water water){
		if(o2==null||water==null){
			isAlive= false;
			System.out.println("没有水和氧气则生命不能代谢，死亡了");
		}
		System.out.println("生命利用水和氧气，进行新陈代谢！");
	}
	
	public void breed(){
		if(isAlive){
			System.out.println("生命在延续，进行繁殖");
		}else{
			System.out.println("生命已死，无法繁殖！");
		}
	}
}
