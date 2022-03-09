package day14.streamApi;

import java.util.List;

public class Filtering_1 {

	public static void main(String[] args) {
		List<Users> users = List.of(
					new Users("Kyaw Kyaw", "Admin"),
					new Users("Aung Aung", "Staff"),
					new Users("Maung Maung","Staff"),
					new Users("Yuri", "Customer"),
					new Users("Jeon", "Customer")
				);
		
		users.stream()
				//.filter(u -> u.getRole().equalsIgnoreCase("staff"))
				.filter(Users::IsStaff) // user object
				.forEach(u -> System.out.println(u.getName() + ", " + u.getRole()));
	}
}

class Users{
	private String name;
	private String role;
	
	public Users() {
		
	}
	public Users(String name,String role) {
		this.name = name;
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public boolean IsStaff() {
		return this.role.equalsIgnoreCase("staff");
	}
}
