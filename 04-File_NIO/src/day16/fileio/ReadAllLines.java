package day16.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadAllLines {

	public static void main(String[] args) throws IOException {
		List<String> lines = Files.readAllLines(Path.of("src/day16/fileio/employee.txt"));
		
		//lines.forEach(System.out::println);
		List<Employee> empList = lines.stream()
										.map(Employee::getEmployeeFromLine)/// line to emp obj
										.collect(Collectors.toList());
		empList.forEach(emp ->{
			System.out.println("Id: " + emp.getId());
			System.out.println("Name: " + emp.getName());
			System.out.println("Address: " + emp.getAddress());
		});
		
		System.out.println("-------- Read all bytes -------------");
		byte[] byteData = Files.readAllBytes(Path.of("src/day16/fileio/employee.txt"));
		
		System.out.println(new String(byteData));
		
		
		System.out.println("----------- Read all String ----------");
		
		String empStr = Files.readString(Path.of("src/day16/fileio/employee.txt"));
		System.out.println(empStr);
	}
}
class Employee{
	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public static Employee getEmployeeFromLine(String line) {
		Employee emp = new Employee();
		
		String[] data = line.split("\t");
		
		emp.setId(Integer.parseInt(data[0]));
		emp.setName(data[1]);
		emp.setAddress(data[2]);
		
		return emp;
	}
	
}
