package db.doublylinked;

public class DoublyLinkedList {
	
	private Node first;
	private Node last;
	
	
	public DoublyLinkedList(){
		this.first = null;
		this.last= null;	
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()){
			last = newNode;
		}
		else{
			first.previous = newNode;
		}
		newNode.next =first;
		this.first = newNode;
	}
	
	public void insertLast(int data){
		Node newNode1 = new Node();
		newNode1.data = data;
		if(isEmpty()){
			first = newNode1;
		}else{
			last.next= newNode1;	
			newNode1.previous =last;
		}
		
		this.last = newNode1;
	}

}
