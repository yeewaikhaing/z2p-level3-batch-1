package day13.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Testing {
 
	public static void main(String[] args) {
		Map<String, String> foods = new HashMap<>();
		
		foods.put("Orange", "Fruit");
		foods.put("Apple", "Fruit");
		
		Map<String, String> anotherMap = Map.of("Mango","Fruit","Potatos","Vegetable");
		
		foods.putAll(anotherMap);
		
		System.out.println(foods);
		
		Map<String, String> anotherMap2 = Map.ofEntries(
									Map.entry("Coffee", "Juice"),
									Map.entry("Lemon Tea", "Juice")
								);
		
		foods.putAll(anotherMap2);
		
		foods.forEach((k,v) -> System.out.println(k + " -> " + v));
		
		foods.putIfAbsent("kiwi", "Fruit");
		System.out.println("After put: " + foods);
		
		System.out.println("Coffee?: " + foods.containsKey("Coffee"));
		System.out.println("Snack?: " + foods.containsValue("Snack"));
		
		Set<String> keys = foods.keySet();
		
		System.out.println("Keys: " + keys);
		
		Collection<String> values = foods.values();
		System.out.println("values: " + values);
		
		/*foods.remove("Mango");
		System.out.println("After remove: " + foods);
		
		foods.keySet().removeIf(d -> d.contains("Tea"));
		System.out.println("After remove: " + foods);
		
		foods.values().removeIf(d -> d.equalsIgnoreCase("fruit"));
		System.out.println("After remove: " + foods);
		*/
		
		foods.replace("Mango", "PipeApple");
		
		System.out.println("Value of Mango: " + foods.get("Mango"));
		
		foods.compute("Coffee", (k,v) -> v.toUpperCase());
		System.out.println("value of coffee: " + foods.get("Coffee"));
		
		foods.compute("Cake", (k,v) -> "Snack");
		System.out.println(foods);
		
		foods.computeIfAbsent("Orange", k -> "Juice");
		System.out.println("value of Orange: " + foods.get("Orange"));
		
		foods.computeIfAbsent("Banana",k -> "Fruit" );
		
		System.out.println(foods);
		
		foods.computeIfPresent("Orange", (k,v) -> "Juice");
		System.out.println("value of Orange: " + foods.get("Orange"));
		
		foods.computeIfPresent("Corn", (k,v) -> "Vegetable");
		System.out.println("value of Corn: " + foods.get("Corn"));
		
		
		
		
	}
}
