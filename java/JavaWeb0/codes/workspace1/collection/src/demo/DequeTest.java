package demo;

import java.util.*;


public class DequeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new ArrayDeque<>();
		//队列方法
		deque.offer("香蕉");
		deque.offer("苹果");
		deque.offer("柚子");
		System.out.println("--------------------------");
		for(String str:deque){
			System.out.println(str);
		}
		System.out.println("--------------------------");
		
		System.out.println(deque.poll());//区别？弹出第一个
		System.out.println(deque.peek());//不弹出，返回第一个。
		System.out.println("--------------------------");
		for(String str:deque){
			System.out.println(str);
		}
		System.out.println("--------------------------");
				
		System.out.println("--------------------------");
		//栈常用方法  //压如队列对头！
		deque.push("草莓");//压仓！
		deque.push("蓝莓");//压仓！
		System.out.println("--------------------------");
		for(String str:deque){
			System.out.println(str);
		}
		System.out.println("--------------------------");
				
		
		System.out.println(deque.pop());//弹出最后一个。
		System.out.println("--------------------------");
		for(String str:deque){
			System.out.println(str);
		}
		
		Queue<String> queue = new ArrayDeque<>();
		//queue队列只有队列的基本方法。peak poll offer
	}

}
