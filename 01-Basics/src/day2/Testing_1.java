package day2;

public class Testing_1 {
	static String name;//static var
	int price;
	
	void display() {
		int barCode = 1001;//local var
		name = "Juice";
		price = 1500;
		
		System.out.println("Code: " + barCode);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		
	}
	static void Method() {
		//can access only static data.
		// if instance data is needed to access, create obj.
		name = "Coffee";
		
		
		System.out.println("This is static method");
	}
	public static void main(String[] args) {
		Testing_1 obj = new Testing_1();
		obj.price = 1500;
		obj.display();
	}
}
