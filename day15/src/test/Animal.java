package test;

public class Animal {

	String name;
	
	void setName(String name){
		this.name =name;
	}
	
	
	
	public static void main(String[] args) {
		Animal cat = new Animal();
		Animal dog = new Animal();
		Animal horse = new Animal();
		
		cat.name = "ab";
		dog.name ="bok";
		horse.name = "mar";
		
		System.out.println(cat.name);
		System.out.println(dog.name);
		System.out.println(horse.name);
		
		
	}
	
}
