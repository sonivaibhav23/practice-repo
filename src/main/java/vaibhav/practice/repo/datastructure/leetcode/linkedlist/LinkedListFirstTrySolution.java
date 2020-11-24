package vaibhav.practice.repo.datastructure.leetcode.linkedlist;

public class LinkedListFirstTrySolution {

	public static void main(String[] args) {
		MyLinkedList head = new MyLinkedList();
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

class MyLinkedList {

	private int val;
	private MyLinkedList next;
	private boolean isHead;

	/** Initialize your data structure here. */
	public MyLinkedList() {
		next = null;
		isHead = false;
	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {
		MyLinkedList node = this;
		while (index != 0 && node != null) {
			node = node.next;
			index--;
		}

		if (index > 0) {
			return -1;
		} else {
			return node.val;
		}
	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		if (this.next == null && !this.isHead) {
			this.val = val;
			this.isHead = true;
		} else {
			MyLinkedList tempNode = this;

			this.val = val;
			this.next = tempNode;
		}
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		MyLinkedList node = this;

		while (node.next != null) {
			node = node.next;
		}

		MyLinkedList newNode = new MyLinkedList();
		newNode.val = val;

		node.next = newNode;
	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {
		MyLinkedList node = this;
		MyLinkedList prev = null;

		while (index != 0 && node != null) {
			prev = node;
			node = node.next;
			index--;
		}

		if (index == 0) {
			MyLinkedList newNode = new MyLinkedList();
			newNode.val = val;

			MyLinkedList temp = prev.next;
			prev.next = newNode;

			newNode.next = temp;
		}
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		MyLinkedList node = this;
		MyLinkedList prev = null;
		while (index != 0) {
			prev = node;
			node = node.next;
			index--;
		}

		if (prev != null) {
			prev.next = node.next;
		}
	}

	public void print() {
		MyLinkedList node = this;
		System.out.print(node.val + " ");

		while (node.next != null) {
			node = node.next;
			System.out.print(node.val + " ");
		}
		System.out.println();
	}
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList(); int param_1 = obj.get(index);
 * obj.addAtHead(val); obj.addAtTail(val); obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
