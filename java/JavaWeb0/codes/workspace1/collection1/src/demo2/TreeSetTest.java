package demo2;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tree =new TreeSet<>();
		tree.add(10);//自动装箱！10-》Integer
		tree.add(8);
		tree.add(12);
		tree.add(14);
		tree.add(17);
		tree.add(20);
		tree.add(5);
		System.out.println(tree.ceiling(7));//天花板方法。
		System.out.println(tree.floor(11));//地板
		System.out.println(tree.first());//最小的
		System.out.println("last"+tree.last());//;
		System.out.println("lower:"+tree.lower(20));
		//treeSet帮我们实现了对数字的自然排序！升序从小到大！
		for(Integer i :tree){
			System.out.println(i);
		}
		
		System.out.println("------------------");
		SortedSet<Integer> sort=tree.headSet(10);//head 不包含10 比10小
		for(Integer i :sort){
			System.out.println(i);
		}

		System.out.println("------------------");
		sort=tree.tailSet(10);//tail 包含10 比10大
		for(Integer i :sort){
			System.out.println(i);
		}
		
	}

}
