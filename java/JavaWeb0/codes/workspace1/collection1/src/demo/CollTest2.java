package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollTest2 {
	//集合类中只能放置类实例对象。不能放基本类型。int 
	private static Collection coll;
	public static void main(String[] args) {
		//定义并初始化Collection 类对象
		coll =new HashSet();
		//Set 特点是不能放重复的东西。不能保持顺序
		//添加水果
		coll.add("菠萝");//自动装箱过程。
		coll.add(new String("苹果"));
		coll.add("榴莲");
		coll.add("西红柿");
		coll.add("葡萄");
		coll.add("梨子");
		coll.add("梨子");//Set中不可以相同的对象不能有两个！
		//coll.add(12);//自动装箱。int->Integer
		//搬运到很远的地方。
		coll=move("西安");
		//取出来！使用迭代器取出。第一种取东西的方法
		Iterator  iterator =coll.iterator();
		while(iterator.hasNext()){//一个一个遍历。
			String str = (String)iterator.next();
			System.out.println(str);
		}
		//苹果 -》榴莲 -》葡萄 -》梨子 -》菠萝 -》西红柿
		//根据结果可知，Set 特点是不能放重复的东西。不能保持顺序
		
	}
	public static Collection move(String difang){
		System.out.println("把箱子搬到了"+difang);
		return coll;
	}

}
