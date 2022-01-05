package com.Management;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
 static Connection con;
public static Connection createC() throws SQLException {
	
	
	// 
	try {
		
		//load the driver 
		Class.forName("com.mysql.jdbc.Driver");
		//create connection ...
		String  user = "root";
		String password= "1234";
		String url = "jdbc:mysql://localhost:3306/student_management";
		con = DriverManager.getConnection(url,user,password);
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}
}
