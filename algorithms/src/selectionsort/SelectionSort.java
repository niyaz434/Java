package selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		int myArray [] = selectionsort(new int [] {8,3,6,9,15,46});
		for(int i = 0; i <myArray.length;i++){
			System.out.println(myArray[i]);
		}
	}

	public static int[] selectionsort(int[] a) {
		for (int i = 0; i<a.length;i++){
			int minimum = i;
			for(int j= i+1; j<a.length;j++){
				if(a[j] < a[minimum]) {
					j = minimum;
				}
			}
			int temp = a[i];
			a[i] =a[minimum];
			a[minimum] = temp;
		}
		return a;
	}

}
