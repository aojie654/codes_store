package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	//集合类中只能放置类实例对象。不能放基本类型。int 
	private static List<String> list;
	public static void main(String[] args) {
		//定义并初始化List 类对象
		//使用泛型，定义的list对象必须也只能放String实例！防止苍蝇飞入！
		list =new ArrayList<String>();//动态数组集合。本质是数组。
		//添加水果 数组的方式添加。 list[0]="菠萝";
	
		list.add(0, "菠萝");
		list.add(1, "苹果");
		list.add(2, "香蕉");
		list.add(3, "葡萄");

		list.add(4, "草莓");
		list.add(5, "荔枝");
		list.add(4, "西瓜");//插入效果，到4位置。其他顺移
		list.set(5, "桔子");//替代效果！
		//搬运到很远的地方。
		list=move("西安");
		//取出来！使用迭代器取出。第3种取东西的方法
		for(int i=0;i<list.size();i++){
			String str = (String)list.get(i);
			System.out.println(str);
		}
	}
	public static List<String> move(String difang){
		System.out.println("把箱子搬到了"+difang);
		return list;
	}

}
