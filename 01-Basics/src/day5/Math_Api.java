package day5;

public class Math_Api {

	public static void main(String[] args) {
		//basic operation
		System.out.println("Abs of -7: " + Math.abs(-7));
		System.out.println("3 power 4: " + Math.pow(3, 4));
		System.out.println("square root of 49: " + Math.sqrt(49));
		System.out.println("Random value: " + Math.random());
		System.out.println("Min: " + Math.min(13, 31));
		System.out.println("Max: " + Math.max(13, 31));
		System.out.println("Sum: " + Math.addExact(13, 12));
		System.out.println("PI: " + Math.PI);
		
		// round
		System.out.println("Round(3.6): " + Math.round(3.6));
		System.out.println("flow(3.6): " + Math.floor(3.6));
		System.out.println("ceil(3.2): " + Math.ceil(3.2));
		
		System.out.println("Sin(30): " + Math.sin(30));
		System.out.println("Log10(10): " + Math.log10(10));
		
		
	}
}
