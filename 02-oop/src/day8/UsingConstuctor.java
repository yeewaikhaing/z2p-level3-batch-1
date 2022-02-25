package day8;

public class UsingConstuctor {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.display();
		System.out.println("+++++");
		Person p2 = new Person("Honey", 25, true);
		p2.display();
	}
}

class Person{
	String name;
	int age;
	boolean is_single;
	
	Person(){
		
	}

	public Person(String name, int age, boolean is_single) {
		super();
		this.name = name;
		this.age = age;
		this.is_single = is_single;
	}
	
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Is single: " + ((is_single) ? "yes" : "no"));
	}
	
}
