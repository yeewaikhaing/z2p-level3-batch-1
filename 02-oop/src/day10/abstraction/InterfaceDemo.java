package day10.abstraction;

public class InterfaceDemo {

	public static void main(String[] args) {
		Button btn1 = new Button("btn-login");
		Button btn2 = new Button("btn-logOut");
		
		btn1.display();
		btn1.onClick();
		btn1.onDoubleClick();
		
		btn2.onClick();
		btn2.onDoubleClick();
	}
}
