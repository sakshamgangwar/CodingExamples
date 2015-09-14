package cmu.sgangwar.problems;

public class DeleteMiddleNode {

	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		lList.add(1);
		lList.add(2);
		lList.add(3);
		lList.add(4);
		lList.add(5);

		lList.printList();

		deleteMiddleNode(lList.head.next.next);

		lList.printList();
	}
	
	private static boolean deleteMiddleNode(Node nodeToBeDeleted){
		if(nodeToBeDeleted==null || nodeToBeDeleted.next==null){
			return false;
		}
		
		Node nextNode = nodeToBeDeleted.next;
		nodeToBeDeleted.value = nextNode.value;
		nodeToBeDeleted.next = nextNode.next;
		
		return true;
		
	}

}
