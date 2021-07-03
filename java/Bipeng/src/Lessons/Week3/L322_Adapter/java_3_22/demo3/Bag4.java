package Lessons.Week3.L322_Adapter.java_3_22.demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//使用比较器，进行排序
public class Bag4 {

	private String brand;
	public double price;
	
	public Bag4(String brand,double price){
		this.brand = brand;
		this.price = price;
	}
	public String toString(){
		return "the bag is made by "+brand +" and the price is "
				+price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//界面编成！也要用到！这种写法！
		Set<Bag4> bags = new TreeSet<>(new Comparator<Bag4>(){
			public int compare(Bag4 o1, Bag4 o2) {
				// TODO Auto-generated method stub
				if(o1.price>o2.price)
					return 1;//比当前车大则-1
				else if(o1.price==o2.price)
					return 0;//相等则0
				else return -1;
			}
		});
		Bag4 bag1=new Bag4("LV",15000.0);
		Bag4 bag2=new Bag4("hermas",100000.0);
		Bag4 bag3=new Bag4("chanel",30000.0);
		Bag4 bag4=new Bag4("coach",3000.0);
		Bag4 bag5=new Bag4("MK",2000.0);
		bags.add(bag1);
		bags.add(bag2);
		bags.add(bag3);
		bags.add(bag4);
		bags.add(bag5);
		
		for(Bag4 bag:bags){//foreach循环
			System.out.println(bag);
		} 
		System.out.println("------------------------");
		ArrayList<String> s = new ArrayList<String>();
		Collections.synchronizedList(s);
		
 	}


}
