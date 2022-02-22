package day7;

public class Throw_Exepciton_2 {

	static void checkMark(int mark) throws ArithmeticException{
		if(mark < 0 || mark > 100) {
			ArithmeticException ex = new ArithmeticException("Invalid mark!");
			throw ex;
		}
	}
	public static void main(String[] args) {
		try {
			checkMark(-1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
