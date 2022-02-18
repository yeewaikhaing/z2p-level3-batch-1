package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionHandling_1 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number1: ");;
		int num1 = sc.nextInt();
		System.out.print("Enter  number2: ");
		int num2 = sc.nextInt();
		
		int result = num1 / num2; // create ArithmeticExcpeiton, throws obj
		System.out.println("Output: " + result);
		
		sc.close();
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter age:");
//		int age = Integer.parseInt(br.readLine());
//		
//		System.out.println("Your age: " + age);
	}
}
