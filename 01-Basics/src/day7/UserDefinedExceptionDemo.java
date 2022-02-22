package day7;

class InvalidAgeExcepiton extends Exception{

	
	private static final long serialVersionUID = 1L;
	public InvalidAgeExcepiton() {
		
	}
	public InvalidAgeExcepiton(String msg) {
		super(msg);
	}
	
}

public class UserDefinedExceptionDemo{
	
	static void checkAge(int age) throws InvalidAgeExcepiton{
		if(age < 18)
			throw new InvalidAgeExcepiton("Age is not valid to smoke");
		else
			System.out.println("You can smoke!");
	}
	public static void main(String[] args) {
		
		try {
			checkAge(20);
		} catch (InvalidAgeExcepiton e) {
			System.err.println(e.getMessage());
		}
	}
}
