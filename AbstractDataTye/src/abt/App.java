package abt;

public class App {

	public static void main(String[] args) {
		
		
		Counter counter = new Counter("niyaz");
		
		counter.incerement();
		counter.incerement();
		counter.incerement();
		counter.incerement();
		int table = counter.getItemCount();
		
		System.out.println(table);
	}

}
