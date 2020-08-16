package vaibhav.practice.repo.datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {

	public static void main(String[] args) {
		Queue<Character> queue = new LinkedList<Character>();

		queue.add('A');
		queue.add('C');
		queue.add('Y');

		System.out.println(queue);

		Character removeChar = queue.remove();
		System.out.println("Removed character : " + removeChar);

		System.out.println(queue);
	}

}
