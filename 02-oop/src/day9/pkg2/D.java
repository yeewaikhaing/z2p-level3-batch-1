package day9.pkg2;
import day9.pkg1.A;

public class D {

	void test() {
		A obj = new A();
		//obj.a = 20;// different pkg
		//obj.price
	}
}
class F extends A{
	void test() {
		A obj = new A();
		//obj.a
		//obj.price = 100;
		F obj1 = new F();
		obj1.price = 100;
	}
}
