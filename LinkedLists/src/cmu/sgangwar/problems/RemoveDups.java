package cmu.sgangwar.problems;

public class RemoveDups {

	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		lList.add(1);
		lList.add(2);
		lList.add(3);
		lList.add(1);
		lList.add(4);
		lList.add(5);

		lList.printList();
		
		removeDuplicateNodes(lList);
		
		lList.printList();		

	}

	private static void removeDuplicateNodes(LinkedList lList) {
		Node pointer = lList.head;

		while (pointer != null) {
			Node current = pointer;

			while (current.next != null) {

				if (pointer.value == current.next.value) {
					current.next = current.next.next;
				} else {
					current = current.next;
				}
			}

			pointer = pointer.next;
		}
	}
}

class Node {

	Node next;
	int value;

	public Node(int value) {
		this.value = value;
	}

}

class LinkedList {

	Node head;

	public LinkedList() {
		head = null;
	}

	public void printList() {
		Node n = head;
		System.out.println();
		while (n != null) {
			System.out.print("[ " + n.value + " ] -> ");
			n = n.next;
		}
		System.out.println("[X]");
	}

	public void add(int value) {
		Node n = new Node(value);
		if (head == null) {
			head = n;
		} else {
			Node counterNode = head;
			while (counterNode.next != null) {
				counterNode = counterNode.next;
			}

			counterNode.next = n;

		}
	}
}
