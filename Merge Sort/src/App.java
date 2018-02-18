
public class App {

	public static void main(String[] args) {

		int inputArray[] = {9,8,7,6,5,0,9,8,7,6,5,4,1};
	// Before sorting
		
		for (int i = 0 ; i < inputArray.length;i++){
			System.out.print("{ "+ inputArray[i]+" }");
		}
		
	System.out.println();
		MergeSort sorter = new MergeSort();
		MergeSort.sort(inputArray);
		
		
		//After sorting
		for (int i = 0 ; i < inputArray.length;i++){
			System.out.print("{ "+ inputArray[i]+" }");
		}
		
	}

}
