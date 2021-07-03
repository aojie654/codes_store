package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//HashSet
//添加一些你喜欢的东西。
//对这些东西进行遍历！
public class CollTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add(0, "悟空传");
		list.add(1, "历史不忍细读");
		list.add(2, "Java高级编程");
		list.add(3, "鱼羊野史");
		list.add(3, "冷酷仙境");//插入效果！
		list.set(3, "abc");//替换效果！
		
		//循环方式2
		for(int i=0;i<list.size();i++){
			String str=list.get(i);	
			System.out.println(str);
		}
		
		Collection<String> list2 = new ArrayList<>();
		
		list2.add("悟空传");
		list2.add("历史不忍细读");
		list2.add("Java高级编程");
		list2.add("冷酷仙境");
		list2.add("鱼羊野史");
		
		//2 如何遍历！
		Iterator<String> iterator =list2.iterator();
		
		//循环方式1
		while(iterator.hasNext()){
			String obj=iterator.next();
			System.out.println(obj);
		}
		
		//循环方式3 foreach
		for(String str:list){
			System.out.println(str);
		}
		//<>泛型！ 可以帮助我们放置出现集合中放入不一致的类对象。1.5加入了泛型！
		//集合类中只能放类对象！
		Set<String> set = new HashSet<>();
		set.add("草莓");//自动装箱！对应 自动拆箱！ 
		set.add(new String("草莓"));//系统自动将简单类型“草莓”字符串装箱成String实例对象。
		set.add("草莓");
		set.add("香蕉");
		set.add("苹果");
		
		
		
		//循环方式4 foreach
		for(String str:set){
			System.out.println(str);
		}
		
		//2 如何遍历！
		Iterator iterator2 =set.iterator();
		
		//循环方式1
		while(iterator2.hasNext()){
			String obj=(String)iterator2.next();
			System.out.println(obj);
		}
		
	}

}
