package com.springorg.labtest13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionprovider {
	 public static Connection getConnection()
	  {
		 try {
			 
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root","inter@143");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
		 
		  
	  }

}
