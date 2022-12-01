package com.springorg.labtest13.dao;

import java.sql.SQLException;

public interface userdio {
	// create user 
	int createuser(String username ,String password) throws SQLException;
	//to display user
	void displayuser(String  disp) throws SQLException;;
	//to display all user
	void displayallluser() throws SQLException;
	//update password
	int updaetpass(String username ,String password) throws SQLException;
	//to delete user
	int deleteuser(String username)throws SQLException;
	
}
