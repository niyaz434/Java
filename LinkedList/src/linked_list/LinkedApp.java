package linked_list;

import java.util.Currency;

public class LinkedApp {

	public static void main(String[] args) {

		Node nodeA = new Node();
		nodeA.num  = 1;
		
		Node nodeB = new Node();
		nodeB.num = 2;
		
		Node nodeC = new Node();
		nodeC.num =4;
		
		Node nodeD = new Node();
		nodeD.num = 3;
		
		
		nodeA.node = nodeB;
		nodeB.node = nodeC;
		nodeC.node = nodeD;
		
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
