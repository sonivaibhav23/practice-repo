package vaibhav.practice.repo.datastructure.stack;

import java.util.Iterator;
import java.util.Stack;
import java.util.stream.IntStream;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		IntStream.rangeClosed(0, 5).forEach(i -> stack.push(i));

		System.out.println("Printing Elements ... ");

		Iterator<Integer> stackIterator = stack.iterator();

		while (stackIterator.hasNext()) {
			System.out.println(stackIterator.next());
		}

		System.out.println("Stack Pop : " + stack.pop());

		System.out.println("Stack Peep : " + stack.peek());

		System.out.println("Stack Peep : " + stack.peek());
	}

}
