package basic;

public class GooseGroup {
	private WildGoose[] gooses;//雁群是有大雁组成的！聚合关系！1对多
	//通过set方法对雁群进行初始化！也说明了大雁是从外面来的！聚合关系
	public void setGooses(WildGoose[] gooses) {
		this.gooses = gooses;
	}
	
	public void vFly(){
		System.out.println(this.gooses.length+"只大雁，成V字型飞");
	}
	public void yiFly(){
		System.out.println(this.gooses.length+"只大雁，成一字型飞");
	}
}
