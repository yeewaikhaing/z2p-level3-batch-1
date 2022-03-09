package day13.collection;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMap_Testing {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
		
		students.put(11, "Aung Aung");
		students.put(5, "Kyaw Kyaw");
		students.put(8, "Honey");
		
		students.putIfAbsent(10, "Cherry");
		
		students.forEach((k,s) -> {
			System.out.println("Rno: " + k);
			System.out.println("Name: " + s);
		});
		
		students.replace(8, "Honey Tun");
		System.out.println(students);
		
		students.remove(8);
		System.out.println("After remove: " + students);
		
		
		// Tree Map
		System.out.println("--------------------");
		
		TreeMap<String, String> fileExtens = new TreeMap<>();
		fileExtens.put("java", ".java");
		fileExtens.put("php", ".php");
		fileExtens.put("c++", ".cpp");
		fileExtens.put("html", ".html");
		fileExtens.put("javascript", ".js");
		
		System.out.println(fileExtens);
		
		fileExtens.remove("c++");
		System.out.println("After remove: " + fileExtens);
		
	}
}
