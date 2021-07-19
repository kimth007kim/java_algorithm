package ex5_2;

import java.util.LinkedList;
import java.util.Queue;

public class Ex5_2 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(5);
		System.out.println(q);
		q.offer(2);
		System.out.println(q);
		q.offer(3);
		System.out.println(q);
		q.offer(7);
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.offer(1);
		System.out.println(q);
		q.offer(4);
		System.out.println(q);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
