package linked_list;

public class LinkedApp {

	public static void main(String[] args) {
			
		Node nodeA = new Node();
		nodeA.num = 4;
		
		Node nodeB = new Node();
		nodeB.num = 5;
		
		Node nodeC = new Node();
		nodeC.num = 6;
		
		nodeA.node = nodeB;
		nodeB.node = nodeC;
		
		System.out.println(listLength(nodeA));
		
	}

	public static int listLength(Node anode){
		int length = 0;
		Node currentNode = anode;
		
		while(currentNode != null){
			length++;
			currentNode = currentNode.node;
		}
		return length;
	}
	
	
}
