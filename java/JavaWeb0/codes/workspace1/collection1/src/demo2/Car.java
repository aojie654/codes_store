package demo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//如何比较汽车之间的关系？大小？
// 方法1 通过实现一个接口！Comparable接口就可以！
public class Car implements Comparable<Car> {
	private double price;
	private String brand ;
	public Car (String brand){
		this.brand = brand;
		price = 100000.0;
	}
	public Car (String brand,double price){
		this.brand = brand;
		this.price = price;
	}
	public String toString(){
		return "hello the car is made by "+brand
				+ " and the price is "+price;
	}
	@Override
	public int compareTo(Car car) {
		// TODO Auto-generated method stub
		if(car.price>this.price)
			return -1;//比当前车大则-1
		else if(car.price==this.price)
			return 0;//相等则0
		else return 1;//否则 返回1 表示比car大！
	}
	
	public static void main(String[] args){
		
		Car car1 = new Car("toyota",150000.00);
		Car car2 = new Car("benz",500000.00);
		Car car3 = new Car("保时捷",1000000.00);
		Car car4 = new Car("金杯",80000.00);
		
		List<Car> coll = new ArrayList<>();
		coll.add(car1);
		coll.add(car2);
		coll.add(car3);
		coll.add(car4);
		
		for(Car car:coll){
			System.out.println(car);
		}
		System.out.println("----------------------");
		
		Collections.sort(coll);//Collections sort方法可以对集合进行排序！
		//被排序对象 car需要实现比较接口！
		for(Car car:coll){
			System.out.println(car);
		}
		
	}
}
