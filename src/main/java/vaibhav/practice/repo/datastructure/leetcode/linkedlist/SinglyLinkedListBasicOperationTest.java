package vaibhav.practice.repo.datastructure.leetcode.linkedlist;

public class SinglyLinkedListBasicOperationTest {

	public static void main(String[] args) {
		LLinkedList llist = new LLinkedList();

		llist.addAtHead(2);
		llist.print();
		llist.addAtHead(4);
		llist.print();
		llist.addAtIndex(1, 10);
		llist.print();
		System.out.println(llist.get(1));
		llist.print();
		llist.deleteAtIndex(2);
		llist.print();
	}
}