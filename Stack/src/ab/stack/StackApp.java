package ab.stack;


public class StackApp {

	public static void main(String[] args) {
		System.out.println(reverseString("Niyaz"));
	}
	
	
	public static String reverseString(String str){
		int strLength = str.length();
		Stack stack =new Stack(strLength);
		for(int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			stack.push(ch);
		}
		String result = "";
		while(!stack.isEmpty()){
			char ch  = stack.pop();
			result =result+ch;	
		}
		return result;
	}

}
