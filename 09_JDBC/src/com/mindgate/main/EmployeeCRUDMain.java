package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUDMain {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "mindgate123";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String sqlQuery = "";
		int result = 0;
		
      	Connection connection;
		 PreparedStatement preparedStatement;
		ResultSet resultSet;
//		
//		System.out.println("Insert Example");
//		
////		
//		try {
//			Class.forName(driver);
//		connection=DriverManager.getConnection(url,user,password);
//		sqlQuery="INSERT INTO employee_details (name,salary) values (?,?)";
//      			preparedStatement= connection.prepareStatement(sqlQuery);
//			     preparedStatement.setString(1,"Vaibhav");
//			     preparedStatement.setDouble(2,26636);
//		result=preparedStatement.executeUpdate();
//			if(result>0)
//			{
//				System.out.println("Inserted successfully");
//			}
//			else
//			{
//				System.out.println("Unable to inserted");
//			}
//			connection.close();
//        	} catch (ClassNotFoundException | SQLException e)
//        	{
//	         System.out.println("Exceptoion occur");			
//	         System.out.println(e.getMessage());
//		     e.printStackTrace();
//		     }

	
		
//		try {
//			Class.forName(driver);
//					
//			connection=DriverManager.getConnection(url, user, password);
//		sqlQuery="UPDATE employee_details set name=?,salary=? where employee_id=?";
//     			preparedStatement =connection.prepareStatement(sqlQuery);
//     			
//     			preparedStatement.setString(1, "Vaibhav");
//     			preparedStatement.setDouble(2, 30000);
//     			preparedStatement.setInt(3,7);
//     			
//		result=preparedStatement.executeUpdate();
//			if(result>0)
//     			System.out.println("Updated Successfully");
//		
//			else
//				System.out.println("Unable to update");
//			
//			
//			connection.close();
//			
//			
//			
//	} catch (ClassNotFoundException | SQLException e) {
//		     
//			e.printStackTrace();
//		}
//
//		
		
		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url, user, password);
			
			sqlQuery="DELETE FROM employee_details where employee_id=?";
			
			preparedStatement=connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, 3);
		result=preparedStatement.executeUpdate();
		if(result>0)
		{
			System.out.println("Deleted successfully");
		}
		else
			System.out.println("unable to delete"
					+ "");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//		try {
//			Class.forName(driver);
//			
//		connection=DriverManager.getConnection(url, user, password);
//		sqlQuery="select * from employee_details";
//		preparedStatement=connection.prepareStatement(sqlQuery);
//		
//		
//	        resultSet	=preparedStatement.executeQuery();
//
//	      while(resultSet.next())
//	      {
//	    	  System.out.println(resultSet.getInt("employee_Id"));
//	    	  System.out.println(resultSet.getString("name"));
//	    	  System.out.println(resultSet.getDouble("salary"));
//	    	  System.out.println("_".repeat(50));
//	      }	    
//
//
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
		
		
		
		
		
		

}
}
