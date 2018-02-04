package db.singlylinkedlist;

public class App {

	public static void main(String[] args) {
			
		
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.insertData(100);
		singlyLinkedList.insertData(50);
		singlyLinkedList.insertData(60);
		singlyLinkedList.insertData(80);
		singlyLinkedList.insertData(90);
		singlyLinkedList.insertData(8);
		singlyLinkedList.insertLast(999999);

		
		singlyLinkedList.displayList();

	}

}
