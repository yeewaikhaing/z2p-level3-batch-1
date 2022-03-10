package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ass_1 {

	public static void PutName(List<String> ex_list, String name) {
		if(ex_list.contains(name)) 
			System.out.println("The name " + name + " is already existed!!!");
		
		else
			ex_list.add(name);
		
	}
	public static void main(String[] args) {
		String[] data = {"MgMg","AungAung","KaungMyat","MyatAung","HlaHtun","MonLay","KaungMon","HlaHla","SuLay"};
		List<String> student =new ArrayList<String>(Arrays.asList(data));
		
		
		System.out.println(student);
		Collections.sort(student);
		System.out.println(student);
		
		int result = Collections.binarySearch(student, "MgMg");
		System.out.println("the position of "+student.get(result) + " is "+ ++result);
		
		PutName(student, "MgMg");
		PutName(student, "SawMin");
		Collections.sort(student);
		System.out.println(student);
		
		student.forEach(stu->{
			if(stu.startsWith("K") || stu.startsWith("k")) {
				System.out.println("The name start with K or k is :" + stu);
			}
		});
		
		student.removeIf(stu->(stu.endsWith("G")) || (stu.endsWith("g")));
		System.out.println(student);
		
		student.clear();
		
		
		
		
		
		
		
		
		
		
	}
	

}
