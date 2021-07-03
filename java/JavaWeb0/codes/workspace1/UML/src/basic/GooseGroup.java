package basic;

public class GooseGroup {
	//goose是雁群数组
	private Goose[] gooses;
	//通过set方法传入。而不是自己本生长出大雁！
	public void setGooses(Goose[] gooses) {
		this.gooses = gooses;
	}
	//也可通过构造函数传递雁群！聚合没有组合关系强
	public GooseGroup(Goose[] gooses){
		this.gooses = gooses;
	}
	
	public void vshapeFly(){
		System.out.println(this.gooses.length+"只大雁，成V字型飞");
	}
	
	public void yishapeFly(){
		System.out.println(this.gooses.length+"只大雁，成一字型飞");
	}
	
}
