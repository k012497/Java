package chapter15.vector;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) throws InterruptedException {
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = 10 ; i >= 0 ; i--) {
			queue.add(new Integer(i));
		}
		
		while(!queue.isEmpty()) {//비어있지 않을 때 실행 
			System.out.println(queue.remove()+""); //remove - 가져오고 없애버림 
			Thread.sleep(1000);
		}
		

	}

}
