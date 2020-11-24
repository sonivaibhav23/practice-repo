package vaibhav.practice.repo.datastructure.leetcode.linkedlist;

public class LinkedListBetterSolution {

	public static void main(String[] args) {
		MySinglyLinkedList head = new MySinglyLinkedList();
		head.addAtHead(1);
		head.print();

		head.addAtTail(3);
		head.print();

		head.addAtIndex(1, 2);
		head.print();

		head.get(1);

		head.deleteAtIndex(1);

		head.print();

		head.get(1);
	}
}

class MySinglyLinkedList {

	class Node {
		private int val;
		private Node next;

		public Node(int val) {
			this.val = val;
			this.next = null;
		}

		public Node() {

		}
	}

	private Node head;
	private Node tail;
	private int length = 0;

	public MySinglyLinkedList() {
		head = new Node();
		tail = head;
	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {
		Node node = head.next;

		if (index == length - 1)
			return tail.val;

		if (index < 0 || index > length - 1) {
			return -1;
		}

		for (int i = 0; i < index; i++) {
			node = node.next;
		}

		return node.val;
	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		Node node = new Node(val);
		node.next = head.next;
		head.next = node;

		if (length == 0)
			tail = node;
		length++;
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		Node node = new Node(val);
		tail.next = node;

		tail = tail.next;
		length++;
	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {
		if (index == length) {
			addAtTail(val);
		} else if (index == 0) {
			addAtHead(val);
		} else if (index > length) {
			return;
		} else {
			Node prev = head;
			for (int i = 0; i < index; i++) {
				prev = prev.next;
			}

			Node node = new Node(val);

			node.next = prev.next;
			prev.next = node;
			length++;
		}
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		if (index > length) {
			return;
		}

		Node prev = head;
		for (int i = 0; i < index; i++) {
			prev = prev.next;
		}

		if (prev.next == tail) {
			prev.next = null;
			tail = prev;
		} else {
			prev.next = prev.next.next;
		}
		length--;
	}

	public void print() {
		Node node = this.head;
		System.out.print(node.val + " ");

		while (node.next != null) {
			node = node.next;
			System.out.print(node.val + " ");
		}
		System.out.println();
	}

}
