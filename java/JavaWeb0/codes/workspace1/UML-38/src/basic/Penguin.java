package basic;
public class Penguin extends Bird{
	private Climate climate;//关联关系！企鹅与气候是比依赖关系强的关联关系！
	@Override
	public void layEggs() {
		// TODO Auto-generated method stub
		if(this.climate.intro.equals("南极")){
			this.breed();
			System.out.println("气候非常寒冷，企鹅下蛋，噢噢噢！");
		}else{
			System.out.println("气候不够寒冷，企鹅无法下蛋！");
		}
	}
	public void setClimate(Climate climate) {
		this.climate = climate;
	}
	public Penguin(Climate climate) {
		super();
		this.climate = climate;
		System.out.println("是一只企鹅！");
	}
}
