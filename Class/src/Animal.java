
public class Animal {

	String name;
	int age;
	String breed;
	String gender;
	
	public Animal(String name,int age,String breed, String gender){
		this.name = name;
		this.age = age;
		this.breed =breed;
		this.gender = gender;	
	}
	
	public void talk(){
		System.out.println("I am :"+name);
		System.out.println("And iam born in :"+age);
		System.out.println("My breed is :"+breed);
		System.out.println("I am a :"+gender);
	}
	
	
	
	
}
