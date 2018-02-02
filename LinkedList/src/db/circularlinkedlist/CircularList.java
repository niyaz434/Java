package db.circularlinkedlist;

public class CircularList {
	
	private Node first;
	private Node last;
	
	public CircularList(){
		this.first =null;
		this.last = null;
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
	
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()){
			last = newNode;
		}
		newNode.next = first;
		first = newNode;
	}
	
	public void insertLast(int data){
		Node newNode1 = new Node();
		newNode1.data = data;
		if(isEmpty()){
			first = newNode1;
		}
		last.next = newNode1;
		last = newNode1;
	}
	
	
	public int deleteFirst(){
		int temp = first.data;
		if(first.next == null){
			last = null;
		}
		first =first.next;
		return temp;
		
	}
	
	public void displayList(){
		System.out.println("first to last");
		Node current = first;
		while(current != null){
			current.displayNode();
			current = current.next;	
		}
		System.out.println();
	}
	
	

}
