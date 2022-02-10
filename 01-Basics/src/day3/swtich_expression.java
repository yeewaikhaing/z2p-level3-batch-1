package day3;

import java.util.Scanner;

public class swtich_expression {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter food name: ");
		String name = sc.nextLine();
		

//		var category = switch(name) {
//						case "burger","pizza","sandwich" -> "Fast Food";
//						case "yogurt","milk tea" ->  "Dessert";
//						case "mohinga"-> "Burmese Food";
//						case "sushi"-> "Japanese Food";
//						default -> "unknown";
//					};
		var category = switch(name) {
							case "burger","pizza","sandwich" -> {
								if(name.equals("pizza"))
									System.out.println(name + " is an Italian food");
								yield "Fast Food";
							}
							case "yogurt","milk tea" ->  { yield "Dessert";}
							case "mohinga"-> "Burmese Food";
							case "sushi"-> "Japanese Food";
							default -> "unknown";
		};
		
		System.out.println(name + " is " + category);
		
		sc.close();
	}
}
