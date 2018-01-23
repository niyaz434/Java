package ab.queue;

public class Que {

	public static void main(String[] args) {
			
		
		Queue queue = new Queue(6);
		queue.insert(100);
		queue.insert(200);
		queue.insert(300);
		queue.insert(400);
		queue.insert(500);
		queue.insert(600);
		queue.view();
		System.out.println("");
		System.out.println("First in and First out method");
	}

}
