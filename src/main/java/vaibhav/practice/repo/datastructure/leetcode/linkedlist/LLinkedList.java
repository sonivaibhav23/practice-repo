package vaibhav.practice.repo.datastructure.leetcode.linkedlist;

class LLinkedList {

	class Node {
		private int val;
		private Node next;

		public Node(int val) {
			this.val = val;
			this.next = null;
		}
	}

	private Node head;
	private Node tail;

	private int length;

	public LLinkedList() {
		this.head = new Node(0);
		this.tail = head;
		this.length = 0;
	}

	public void print() {
		Node node = head.next;
		System.out.print(node.val + " ");

		while (node.next != null) {
			node = node.next;
			System.out.print(node.val + " ");
		}

		System.out.println();
	}

	public void addAtHead(int val) {
		Node node = new Node(val);
		node.next = head.next;
		head.next = node;
		if (length == 0) {
			tail = node;
		}
		length++;
	}

	public void addAtTail(int val) {
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		length++;
	}

	public void addAtIndex(int index, int val) {
		if (index >= length || index < 0) {
			System.out.println("Node cannot be added at given index as it is invalid.");
			return;
		}
		if (index == 0) {
			addAtHead(val);
		}
		if (index == length) {
			addAtTail(val);
		}

		// after covering edge cases
		Node node = new Node(val);
		Node prev = head.next;
		for (int i = 1; i < index; i++) {
			prev = prev.next;
		}
		node.next = prev.next;
		prev.next = node;
		length++;
	}

	public void deleteAtIndex(int index) {
		if (index > length - 1 || index < 0) {
			System.out.println("Node cannot be deleted at given index as it is invalid.");
			return;
		}
		Node prev = head;
		for (int i = 0; i < index; i++) {
			prev = prev.next;
		}
		prev.next = prev.next.next;
		length--;
	}

	public int get(int index) {
		if (index < 0 || index > length - 1) {
			System.out.println("Node cannot be found at given index as it is invalid.");
			return -1;
		}
		Node prev = head.next;
		for (int i = 0; i < index; i++) {
			prev = prev.next;
		}
		return prev.val;
	}

	private Node getNodeAtIndex(int index) {
		if (index < 0 || index > length - 1) {
			System.out.println("Node cannot be found at given index as it is invalid.");
			return null;
		}
		Node prev = head.next;
		for (int i = 0; i < index; i++) {
			prev = prev.next;
		}
		return prev;
	}

	public void addACircle(int index1, int index2) {
		Node srcNode = getNodeAtIndex(index1);
		Node destNode = getNodeAtIndex(index2);

		srcNode.next = destNode;
	}

	public boolean hasCircle() {
		int fp = 0;
		int sp = 0;

		Node curr = head;

		while (curr.next != null) {
			if (sp < fp) {
				return true;
			}
			curr = curr.next;
			fp++;
			sp = sp >= 2 * length ? 0 : sp + 2;
		}

		return false;
	}

}