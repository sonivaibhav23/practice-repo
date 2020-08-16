package vaibhav.practice.repo.datastructure.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> battingOrderLinkedList = new LinkedList<>();
		battingOrderLinkedList.add("Dhawan");
		battingOrderLinkedList.add("Rohit");
		battingOrderLinkedList.add("Kohli");
		battingOrderLinkedList.add("Rahane");
		battingOrderLinkedList.add("Dhoni");
		battingOrderLinkedList.add("Pandya");
		battingOrderLinkedList.add("Pant");

		System.out.println("Batting order of Indian Team");

		for (String str : battingOrderLinkedList) {
			System.out.println(str);
		}
		
		System.out.println("Now we want to promote Pandya batting order, and want him to open...");
		
		battingOrderLinkedList.remove("Pandya");
		
		battingOrderLinkedList.addFirst("Pandya");

		System.out.println("Modified Batting order of Indian Team");

		for (String str : battingOrderLinkedList) {
			System.out.println(str);
		}
		
		System.out.println("Functionality of element() method : " + battingOrderLinkedList.element());
		System.out.println("Functionality of element() method : " + battingOrderLinkedList.element());
		
		System.out.println("Functionality of getFirst() method : " + battingOrderLinkedList.getFirst());
		System.out.println("Functionality of getLast() method : " + battingOrderLinkedList.getLast());
		

		System.out.println("Functionality of peek() method : " + battingOrderLinkedList.peek());
		System.out.println("Functionality of peekFirst() method : " + battingOrderLinkedList.peekFirst());
		System.out.println("Functionality of peekLast() method : " + battingOrderLinkedList.peekLast());
		
		System.out.println("Functionality of poll() method : " + battingOrderLinkedList.poll());
		System.out.println("Functionality of pollFirst() method : " + battingOrderLinkedList.pollFirst());
		System.out.println("Functionality of pollLast() method : " + battingOrderLinkedList.pollLast());
		
		System.out.println("Batting order of Indian Team");
		for (String str : battingOrderLinkedList) {
			System.out.println(str);
		}
		
		System.out.println("Functionality of pop() method : " + battingOrderLinkedList.pop());
		
		System.out.println("Batting order of Indian Team");
		for (String str : battingOrderLinkedList) {
			System.out.println(str);
		}
	}

}
