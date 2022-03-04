package day12.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Testing_1 {

	public static void main(String[] args) {
		
		// create
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// add
		list.add(10);
		list.add(30);
		list.add(59);
		System.out.println(list.size());
		System.out.println(list);
		
		list.add(1, 100);
		list.forEach(i -> System.out.println(i));
		
		// update
		list.set(0, 500);
		System.out.println(list.get(0));// get element specified index
		
		// remove
		list.remove(1);
		System.out.println("size: " + list.size());
		System.out.println(list);
		
		System.out.println("Max number: " + Collections.max(list));
		System.out.println("Min number: " + Collections.min(list));
		
		list.clear(); // remove all elements
		System.out.println("size: " + list.size());
		System.out.println(list);
	}
}
