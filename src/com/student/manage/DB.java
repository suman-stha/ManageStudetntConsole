package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	static Connection con;
public static Connection createC() {
		try {
			// load the driver:
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// creating a connection
			
			String url="jdbc:mysql://localhost:3306/student_manage";
			String username="root";
			String password="78626";
			
			 con=DriverManager.getConnection(url,username,password);
			 
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		return con;
		}

}

