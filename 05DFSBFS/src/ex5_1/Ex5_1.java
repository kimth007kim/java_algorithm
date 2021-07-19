package ex5_1;

import java.util.Stack;

public class Ex5_1 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		s.push(5);
		System.out.println(s);
		s.push(2);
		System.out.println(s);
		s.push(3);
		System.out.println(s);
		s.push(7);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.push(1);
		System.out.println(s);
		s.push(4);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		
		while(!s.empty()) {
			System.out.println(s.peek());
			s.pop();
		}

	}

}
