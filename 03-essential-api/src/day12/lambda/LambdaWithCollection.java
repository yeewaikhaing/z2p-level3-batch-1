package day12.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithCollection {

	public static void main(String[] args) {
		List<String> languages = List.of("HTML","Javascript","CSS","Java","PHP");
		
		languages.forEach(s-> System.out.println(s));
		
		System.out.println("----------");
		
		languages.forEach(lang -> {
			if(lang.contains("Java"))
				System.out.println(lang);
		});
		
		
		
	}
}
