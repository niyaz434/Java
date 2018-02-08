package recursion;

public class recursion {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6};
		System.out.println(recursivelinear(a, 0, 6));
	}

	public static int recursivelinear(int [] a,int i, int x){
		if(i>a.length-1){
			return -1;
		}
		else if(a[i] == x){
			return i;
		}
		else {
			System.out.println("index at : "+i );
			return recursivelinear(a,i+1,x);
		}
	}

	
	
}
