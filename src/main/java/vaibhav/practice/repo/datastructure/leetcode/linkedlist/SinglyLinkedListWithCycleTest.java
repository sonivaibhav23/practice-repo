package vaibhav.practice.repo.datastructure.leetcode.linkedlist;

public class SinglyLinkedListWithCycleTest {

	public static void main(String[] args) throws InterruptedException {
		LLinkedList llist = new LLinkedList();

		llist.addAtHead(2);
		llist.print();
		llist.addAtHead(4);
		llist.print();
		llist.addAtTail(5);
		llist.print();
		llist.addAtTail(6);
		llist.print();

		llist.addACircle(3, 1);

		System.out.println(llist.hasCircle());

	}
}