package abt;

public class Counter {

	private int counter = 0;
	private String name = null;
	
	
	public Counter(String str){
		this.name = str;	
	}
	
	public void incerement(){
		counter++;
	}
	
	public int getItemCount(){
		return counter;
	}
	
	public String ToString(){
		return name+ ": "+counter;
		
	}
	
	
}
