package db.singlylinkedlist;

public class SinglyLinkedList {
	
	
	private Node first;
	
	public boolean isEmpty(){
		return (first == null);
	}
	
	public void insertData(int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;	
	}
	
	public Node deleteNode(){
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList(){
		System.out.println("prints first to last");
		Node currentNode = first;
		while(currentNode != null){
			currentNode.displayNode();
			currentNode = currentNode.next;
		}
	}
	
	public void insertLast(int data){
		Node current = first;
		while(current.next != null){
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
	
	
}
