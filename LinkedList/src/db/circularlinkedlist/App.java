package db.circularlinkedlist;

public class App {

	public static void main(String[] args) {
			
		
		CircularList singlyLinkedList = new CircularList();
		singlyLinkedList.insertFirst(100);
		singlyLinkedList.insertFirst(50);
		singlyLinkedList.insertFirst(60);
		singlyLinkedList.insertFirst(80);
		singlyLinkedList.insertFirst(90);
		singlyLinkedList.insertFirst(8);
		singlyLinkedList.insertLast(100);
		singlyLinkedList.insertLast(1000);

		
		singlyLinkedList.displayList();

	}

}
