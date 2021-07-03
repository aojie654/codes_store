package basic;

public abstract class Animal {
	//是否有生命！
	public boolean isAlive;
	
	public Animal(){
		isAlive = true;
		System.out.println("生命诞生了！");
	}
	//繁殖
	public void breed(){
		if(isAlive){
			System.out.println("生命进行延续！");
		}else{
			System.out.println("生物死亡，无法繁殖！");
		}
	}
	//新陈代谢
	public void inAndOut(Air air,Water water){
		if(air==null||water==null){
			isAlive=false;
		}
		System.out.println("生命进行着新陈代谢！");
	}
}
