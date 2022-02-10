package day3;

import java.util.Scanner;

public class Condtional_Statement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter language name: ");
		String input = sc.nextLine();
		
		if(input.equalsIgnoreCase("java"))// Java == java
			System.out.println("Best Programming Language");
	}
}
