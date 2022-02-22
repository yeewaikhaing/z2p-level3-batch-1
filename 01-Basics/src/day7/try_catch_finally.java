package day7;

public class try_catch_finally {

	public static void main(String[] args) {
		try {
			String name = null;
			System.out.println("Length: " + name.length());
		} catch (Exception e) {
			System.err.println("It does not allocate!");
		}
		finally {
			System.out.println("Finllay block");
		}
		System.out.println("Final Statement!");
	}
}
