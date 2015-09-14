package cmu.sgangwar.problems;

public class PartitionProblem {
	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		lList.add(3);
		lList.add(5);
		lList.add(8);
		lList.add(5);
		lList.add(10);
		lList.add(2);
		lList.add(1);


		lList.printList();
		
		doPartition(lList,8);
		
		lList.printList();		
	}
	
	private static void doPartition(LinkedList lList, int value){
		Node lessThanValHead = null;
		Node lessThanValTail = null;
		Node moreThanValHead = null;
		Node moreThanValTail = null;
		
		Node node = lList.head;
		
		while(node !=null){
			
			Node nextNode = node.next;
			
			node.next = null;
			
			if(node.value<value){
				if(lessThanValHead==null){
					lessThanValHead = node;
					lessThanValTail = lessThanValHead;
				}else{
					lessThanValTail.next = node;
					lessThanValTail = node;
				}
			}else{
				if(moreThanValHead==null){
					moreThanValHead = node;
					moreThanValTail = moreThanValHead;
				}else{
					moreThanValTail.next = node;
					moreThanValTail = node;
				}
			}
			
			node = nextNode;
		}
		
		if(moreThanValHead==null){
			lList = new LinkedList();
			lList.head = lessThanValHead;
		}
		
		if(lessThanValTail!=null)
		{
			
			lessThanValTail.next = moreThanValHead;
			lList = new LinkedList();
			lList.head = lessThanValHead;
		}
		
		if(lessThanValHead==null)
		{
			lList = new LinkedList();
			lList.head = moreThanValHead;
		}
		
		
	}

}
