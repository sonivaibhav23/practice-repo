package vaibhav.practice.repo.datastructure.geeksforgeeks.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		Deque<Integer> arrayDeque = new ArrayDeque<>();
		
		arrayDeque.push(6);
		arrayDeque.push(5);
		
		System.out.println(arrayDeque.pop());
		System.out.println(arrayDeque.peek());
		

	}

}
