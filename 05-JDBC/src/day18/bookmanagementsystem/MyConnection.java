package day18.bookmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	
	public static Connection createConnection() throws Exception{
		
		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bookdb", "root", "");
		
		return con;
	}
}
