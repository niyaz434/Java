package ab.queue;

public class Queue {

	private int maxSize;
	private long[] queueArray;
	private int  front;
	private int rear;
	private int nItems;
	
	public Queue(int size){
		this.maxSize = size;
		this.queueArray = new long[size];
		this.front = 0;
		this.rear =-1;
		this.nItems = 0;
			
	}
	
	
	public void insert(long j){
		rear++;
		queueArray[rear] = j;
		nItems++;
	}
	
	public void view(){
		System.out.print("[ ");
		for(int i =0; i<queueArray.length;i++){
			System.out.print(queueArray[i]+" ");	
		}
		System.out.print(" ]");
	}
	
	
}
