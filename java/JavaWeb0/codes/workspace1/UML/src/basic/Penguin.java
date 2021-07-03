package basic;

public class Penguin extends Bird{
	//climate与企鹅是关联关系！
	private Climate climate;
	
	//对气候进行设置！
	public void setClimate(Climate climate) {
		this.climate = climate;
	}
	
	public Penguin(){
		System.out.println("是一只企鹅");
	}
	@Override
	public void layEggs() {
		// TODO Auto-generated method stub
		if(climate.intro.equals("南极")){
			System.out.println("天气寒冷，企鹅下蛋！");
		}else{
			System.out.println("天气不够寒冷，企鹅无法下蛋！");
		}
	}

}
