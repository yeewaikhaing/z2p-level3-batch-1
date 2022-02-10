package day3;

import java.util.Scanner;

public class Conditonal_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your bmi value: ");
		float bmi = sc.nextFloat();
		
		if(bmi < 18.5)
			System.out.println("Underweight");
		else if(bmi >= 18.5 && bmi <= 24.9)
			System.out.println("Normal weight");
		else if(bmi >= 25 && bmi <= 29.9)
			System.out.println("Overweight");
		else
			System.out.println("Obesity");
		
		sc.close();
	}
}
