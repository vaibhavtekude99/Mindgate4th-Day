package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTestMain {
	public static void main(String[] args) 
	{
	   System.out.println("main start");
	   
	   try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","mindgate123");
		System.out.println("Connection successful!!!!!");
		
		
		
		
		
		
	} catch (ClassNotFoundException | SQLException e) {

               System.out.println("failed to load the driver");
               System.out.println(e.getMessage());
	}
	   
	   System.out.println("main end");
	}

}
