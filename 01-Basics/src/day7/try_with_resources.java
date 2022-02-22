package day7;

import java.util.Scanner;

public class try_with_resources {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter your salary: ");
			int salary = Integer.parseInt(sc.nextLine());
			System.out.println("Salary : " + salary);
			//sc.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
