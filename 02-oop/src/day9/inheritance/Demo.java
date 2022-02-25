package day9.inheritance;

public class Demo {

	public static void main(String[] args) {
		Student obj = new Student(1, "jeon", "09123456");
		obj.display();
		System.out.println("Rno - " + obj.getRno());
	}
}
