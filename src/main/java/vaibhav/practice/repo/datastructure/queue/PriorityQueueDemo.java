package vaibhav.practice.repo.datastructure.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>((o1, o2) -> o1.compareTo(o2));

		queue.add("Apple");
		queue.add("Yeellow");
		queue.add("Cat");
		queue.add("Eat");

		System.out.println(queue);

		System.out.println(search(queue, "Yeellow"));
	}

	public static int search(Queue<String> queue, String value) {
		int i = 0;
		for (String a : queue.toArray(new String[0])) {
			if (value.equals(a)) {
				return i;
			}
			i++;
		}
		return -1;
	}

}
