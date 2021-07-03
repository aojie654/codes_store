package Lessons.Week3.L322_Adapter.java_3_22.demo3;

import java.util.Set;
import java.util.TreeSet;
//通过实现Comparable 可以实现排序！TreeSet 或者Collections.sort()方法！
public class Bag implements Comparable<Bag>{

	private String brand;
	public double price;
	@Override
	public int compareTo(Bag o) {
		if(o.price>this.price)
			return -1;
		else if(o.price==this.price)
			return 0;
		else return 1;
	}
	public Bag(String brand,double price){
		this.brand = brand;
		this.price = price;
	}
	public String toString(){
		return "the bag is made by "+brand +" and the price is "
				+price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Bag> bags = new TreeSet<Bag>();
		Bag bag1=new Bag("LV",15000.0);
		Bag bag2=new Bag("hermas",100000.0);
		Bag bag3=new Bag("chanel",30000.0);
		Bag bag4=new Bag("coach",3000.0);
		Bag bag5=new Bag("MK",2000.0);
		bags.add(bag1);
		bags.add(bag2);
		bags.add(bag3);
		bags.add(bag4);
		bags.add(bag5);
		for(Bag bag:bags){//foreach循环
			System.out.println(bag);
		}
 	}


}
