package day10.polymorphism;

public class Demo {

	public static void main(String[] args) {
		Developer developer;
		
		developer = new FronEndDeveloper();
		
		developer.work();
		
		developer = new BackendDeveloper();
		
		developer.work();
	}
}
