package demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//使用比较器，进行排序
class BagComparator implements Comparator<Bag3>{

	@Override
	public int compare(Bag3 o1, Bag3 o2) {
		// TODO Auto-generated method stub
		if(o1.price>o2.price)
			return 1;
		else if(o1.price==o2.price)
			return 0;
		else return -1;
	}	
}
public class Bag3 {

	private String brand;
	public double price;
	
	public Bag3(String brand,double price){
		this.brand = brand;
		this.price = price;
	}
	public String toString(){
		return "the bag is made by "+brand +" and the price is "
				+price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Bag3> bags = new ArrayList<Bag3>();
		Bag3 bag1=new Bag3("LV",15000.0);
		Bag3 bag2=new Bag3("hermas",100000.0);
		Bag3 bag3=new Bag3("chanel",30000.0);
		Bag3 bag4=new Bag3("coach",3000.0);
		Bag3 bag5=new Bag3("MK",2000.0);
		bags.add(bag1);
		bags.add(bag2);
		bags.add(bag3);
		bags.add(bag4);
		bags.add(bag5);
		
		for(Bag3 bag:bags){//foreach循环
			System.out.println(bag);
		} 
		System.out.println("------------------------");
		//bags.sort(new BagComparator());
		
		for(Bag3 bag:bags){//foreach循环
			System.out.println(bag);
		}
		
		System.out.println("------------------------");
		Collections.sort(bags,new BagComparator());//工具类！实现了排序！
		for(Bag3 bag:bags){//foreach循环
			System.out.println(bag);
		}
		
 	}


}
