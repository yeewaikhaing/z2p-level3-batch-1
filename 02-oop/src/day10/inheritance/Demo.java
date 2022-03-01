package day10.inheritance;

public class Demo {

	public static void main(String[] args) {
		Person person = new Person("James");
		person.showInfo();
		
		Teacher teacher = new Teacher("Aung Aung", "Instructor");
		teacher.showInfo();
		
		Person person1 = new Teacher("Naung Naung", "Tutor");//
		person1.showInfo();
		///person1.display();
	}
}
