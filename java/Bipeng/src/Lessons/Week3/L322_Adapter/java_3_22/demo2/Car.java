package Lessons.Week3.L322_Adapter.java_3_22.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		return "hell the car is made by "+brand
				+ " and the price is "+price;
	}
	@Override
	public int compareTo(Car car) {
		// TODO Auto-generated method stub
		if(car.price>this.price)
			return -1;
		else if(car.price==this.price)
			return 0;
		else return 1;
	}

	public static void main(String[] args){

		Car car1 = new Car("toyota",150000.00);
		Car car2 = new Car("benz",500000.00);
		Car car3 = new Car("BMW",1000000.00);
		Car car4 = new Car("WuLing",80000.00);

		List<Car> coll = new ArrayList<>();
		coll.add(car1);
		coll.add(car2);
		coll.add(car3);
		coll.add(car4);

		for(Car car:coll){
			System.out.println(car);
		}
		System.out.println("----------------------");

		Collections.sort(coll);
		for(Car car:coll){
			System.out.println(car);
		}
		
	}
}
