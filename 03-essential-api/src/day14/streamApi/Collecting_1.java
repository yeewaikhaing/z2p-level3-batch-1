package day14.streamApi;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Collecting_1 {

	public static void main(String[] args) {
		
		Student[] students = {
					new Student(10, "Cherry", "yangon"),
					new Student(2, "Cherry", "mandalay"),
					new Student(5, "khaing", "monywa"),
					new Student(1, "htet", "mandalay"),
					new Student(11, "htet yadanar", "yangon")
		};
		
		Set<String> hashSet = Arrays.stream(students)
										.map(Student::getName)
										.collect(Collectors.toSet());
		
		TreeSet<String> treeSet = Arrays.stream(students)
											.map(Student::getName)
											.collect(Collectors.toCollection(TreeSet::new));
		
		Map<Integer, String> hasMap = Arrays.stream(students)
											.collect(Collectors.toMap(Student::getRno, Student::getName));
		
		Map<Integer,Student> hashMap2 = Arrays.stream(students)
												.filter(s -> !s.getCity().equals("yangon"))
												.collect(Collectors.toMap( s -> s.getRno(), s -> s));
		
		System.out.println("hasSet: " + hashSet);
		System.out.println("treeSet: " + treeSet);
		System.out.println("hashMap: " + hasMap);
		System.out.println("hashMap2: " + hashMap2);
	}
}

class Student{
	private int rno;
	private String name;
	private String city;
	public Student(int rno, String name, String city) {
		super();
		this.rno = rno;
		this.name = name;
		this.city = city;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [ name=" + name + ", city=" + city + "]";
	}
	
	
	
}
