package day11.interface_test;

public interface MyInterface {

	void method1();
	default void method2() {
		System.out.println("This is default method");
	}
	static void method3() {
		System.out.println("This is static method");
	}
}
class MyClass implements MyInterface{

	@Override
	public void method1() {
		System.out.println("This is abstract method");
		
	}

	@Override
	public void method2() {
		
	}
	
	
	
}
