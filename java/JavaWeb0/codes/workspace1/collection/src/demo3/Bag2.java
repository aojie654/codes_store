package demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Bag2 implements Comparable<Bag2>{

	private String brand;
	public double price;
	@Override
	public int compareTo(Bag2 o) {
		if(o.price>this.price)
			return -1;
		else if(o.price==this.price)
			return 0;
		else return 1;
	}
	public Bag2(String brand,double price){
		this.brand = brand;
		this.price = price;
	}
	public String toString(){
		return "the bag is made by "+brand +" and the price is "
				+price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Bag2> bags = new ArrayList<Bag2>();
		Bag2 bag1=new Bag2("LV",15000.0);
		Bag2 bag2=new Bag2("hermas",100000.0);
		Bag2 bag3=new Bag2("chanel",30000.0);
		Bag2 bag4=new Bag2("coach",3000.0);
		Bag2 bag5=new Bag2("MK",2000.0);
		bags.add(bag1);
		bags.add(bag2);
		bags.add(bag3);
		bags.add(bag4);
		bags.add(bag5);
		
		for(Bag2 bag:bags){//foreach循环
			System.out.println(bag);
		}
		System.out.println("------------------------");
		Collections.sort(bags);//工具类！实现了排序！
		for(Bag2 bag:bags){//foreach循环
			System.out.println(bag);
		}
		
 	}


}
