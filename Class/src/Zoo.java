import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> array = new LinkedList<String>();
		array.add("Hello");
		array.add("hai this is me");
		array.add("Hopefuly arraylist is created");
		
		Collections.sort(array);
		
		for(String iterate : array){
			System.out.println(iterate);
		}
		
		Animal animal1 =new Animal("Zebra",20,"eggs","male");
		Bird bird1 = new Bird();
		animal1.talk();
		bird1.fly();
		
	}

}
