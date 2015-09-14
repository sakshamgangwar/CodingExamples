package cmu.sgangwar.problems;

public class ReturnKthToLast {

	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		lList.add(1);
		lList.add(2);
		lList.add(3);
		lList.add(1);
		lList.add(4);
		lList.add(5);

		lList.printList();
		
		System.out.println(returnKthToLast(lList, 3));		
	}

	private static int returnKthToLast(LinkedList lList, int k) {
		Node pointer1 = lList.head;
		Node pointer2 = lList.head;

		int counter = 0;
		while (pointer2.next != null) {
			pointer2 = pointer2.next;
			counter++;
			if (counter == k) {
				for (int i = 0; i < k; i++)
					pointer1 = pointer1.next;
				counter = 0;
			}
		}
		
		return pointer1.value;

	}

}
