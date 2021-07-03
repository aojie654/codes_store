package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest3 {
	//集合类中只能放置类实例对象。不指明则默认Object 不能放基本类型。int 
	private static Set set;
	public static void main(String[] args) {
		//定义并初始化Collection 类对象
		set =new HashSet();
		//Set 特点是不能放重复的东西。不能保持顺序
		//添加水果
		set.add("菠萝");//自动装箱过程。
		set.add(new String("苹果"));
		set.add("榴莲");
		set.add("西红柿");
		set.add("葡萄");
		set.add("梨子");
		set.add("梨子");//Set中不可以相同的对象不能有两个！
		//coll.add(12);//自动装箱。int->Integer
		//搬运到很远的地方。
		set=move("西安");
		//取出来！使用迭代器取出。第一种取东西的方法
		Iterator  iterator =set.iterator();
		while(iterator.hasNext()){//一个一个遍历。
			String str = (String)iterator.next();
			System.out.println(str);
		}
		//苹果 -》榴莲 -》葡萄 -》梨子 -》菠萝 -》西红柿
		//根据结果可知，Set 特点是不能放重复的东西。不能保持顺序
		//此方法叫做foreach循环！定义set时没指名类型那就认为是Object
		for (Object str : set) {
			System.out.println((String)str);
		}
	}
	public static Set move(String difang){
		System.out.println("把箱子搬到了"+difang);
		return set;
	}

}
