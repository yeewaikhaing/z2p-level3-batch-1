package day14.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlattingMap {

	public static void main(String[] args) {
		List<String> drinks = Arrays.asList("Cola","Milk Tean","Pessi");
		List<String> foods = List.of("Burger","Kyaw oho","Noodels","Cake");
		List<String> desserts = List.of("Ice Cream","Cake");
		
		List<List<String>> items = new ArrayList<>();
		
		items.add(desserts);
		items.add(drinks);
		items.add(foods);
		
		System.out.println("Before flat: " + items);
		
		Set<String> set = items.stream()
				.flatMap(v -> v.stream())
				.collect(Collectors.toSet());
		
		System.out.println("After flat: " + set);
		
	}
}
