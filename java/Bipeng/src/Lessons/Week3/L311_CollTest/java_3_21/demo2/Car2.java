package Lessons.Week3.L311_CollTest.java_3_21.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//��αȽ�����֮��Ĺ�ϵ����С��
//����2 �����ƻ�Car2�౾��ʵ�ֱȽϣ������Ƕ���һ��Car�ıȽ�����
//ʵ�� Comparator�ӿڣ�
public class Car2 {
	public double price;
	private String brand ;
	public Car2 (String brand){
		this.brand = brand;
		price = 100000.0;
	}
	public Car2 (String brand,double price){
		this.brand = brand;
		this.price = price;
	}
	public String toString(){
		return "hell the car is made by "+brand
				+ " and the price is "+price;
	}
	
	
	public static void main(String[] args){
		
		Car2 car1 = new Car2("toyota",150000.00);
		Car2 car2 = new Car2("benz",500000.00);
		Car2 car3 = new Car2("��ʱ��",1000000.00);
		Car2 car4 = new Car2("��",80000.00);
		
		List<Car2> list = new ArrayList<>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		list.add(car4);
		System.out.println("----------------------");
		for(Car2 car:list){
			System.out.println(car);
		}
		System.out.println("----------------------");
		list.sort(new CarComparator());
		for(Car2 car:list){
			System.out.println(car);
		}
		System.out.println("----------------------");
		Collections.sort(list,new CarComparator());//Collections sort�������ԶԼ��Ͻ�������
		//��������� car��Ҫʵ�ֱȽϽӿڣ�
		for(Car2 car:list){
			System.out.println(car);
		}
		
	}
}
		//ʵ��һ���Ƚ�����
class CarComparator implements Comparator<Car2>{
	@Override
	public int compare(Car2 o1, Car2 o2) {
		// TODO Auto-generated method stub
		if(o1.price>o2.price)
			return 1;//�ȵ�ǰ������-1
		else if(o1.price==o2.price)
			return 0;//�����0
		else return -1;
	}
}