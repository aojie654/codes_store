package demo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// 定义一个队列对象que 本质是ArrayDeque就是双端队列！
		Queue<String> que = new ArrayDeque<>();
		//入队操作！
		que.offer("芹菜");
		que.offer("荠荠菜");
		que.offer("苜蓿");
		que.offer("香椿");
		//出队操作！
		String cai=que.poll();
		System.out.println(cai);
		//出队，但不删除
		cai=que.peek();
		System.out.println(cai);
		
		System.out.println("----------------");
		for(String local:que){
			System.out.println(local);
		}
		
		Deque<String> deque=(Deque<String>)que;
		//deque.poll(); 对于 poll offer peek都增加了first last方法！
		//deque.pollFirst();
		//deque.pollLast();
		//deque.offerFirst();
		//deque.offerLast();
		//增加了栈的push pop方法！
		deque.push("西红柿");//压入队列头部！
		deque.push("圣女果");//压入队列头部！
		System.out.println("----------------");
		System.out.println(deque.pop());//弹出，并删除栈
		System.out.println("----------------");
		for(String local:que){
			System.out.println(local);
		}
 	}

}
