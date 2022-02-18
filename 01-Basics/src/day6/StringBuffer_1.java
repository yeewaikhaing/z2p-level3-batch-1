package day6;

public class StringBuffer_1 {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Java Programming");
		
		System.out.println("Original: " + buffer);
		buffer.append(" Language");
		System.out.println("Append: " + buffer);
		
		buffer.insert(4, " is a");
		System.out.println("Insert:  " + buffer);
		
		buffer.replace(0, 4, "PHP");
		System.out.println("Replace: " + buffer);
		
		System.out.println("Leng: " + buffer.length());
		System.out.println("indexof: " + buffer.indexOf("Language"));
		
		
		System.out.println("substring: " + buffer.substring(4));
		
		buffer = null;
		
		buffer.delete(0, 4);
		System.out.println("delete: " + buffer);
		
		// I am student.(It is not question sentence)
		// How are you? (It is question sentence. It is simple present tense)
		// did you work? (It is question senctence. It is not simple present tense)
	}
}
