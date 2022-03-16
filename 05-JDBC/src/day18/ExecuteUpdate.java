package day18;

import java.sql.*;
import java.time.LocalDate;

public class ExecuteUpdate {

	public static void main(String[] args) {
		String url = "jdbc:mariadb://localhost:3306/testing";
		String username = "root";
		String password = "";
		
		try(Connection conn = DriverManager.getConnection(url,username,password)){
			
			String insert = """
					INSERT INTO employees(empNo,name,salary,birthday)VALUES(?,?,?,?)
					""";
			// prepare statement
			
			PreparedStatement pstm = conn.prepareStatement(insert);
			pstm.setInt(1, 1001);
			pstm.setString(2, "Htet Htet");
			pstm.setDouble(3, 500000);
			
			LocalDate dob = LocalDate.of(1995, 9, 1);
			
			pstm.setDate(4, Date.valueOf(dob));
			
			int result = pstm.executeUpdate();
			
			System.out.println((result > 0) ? "insert success" : "insert fail");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
