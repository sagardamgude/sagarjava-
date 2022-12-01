package com.springorg.labtest13.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.springorg.labtest13.connectionprovider;
import com.springorg.labtest13.dao.userdio;

public class userimpl implements userdio {
	Connection con=connectionprovider.getConnection();

	public int createuser(String username, String password) throws SQLException {
		String query="insert into user(username,password) values(?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2,password);
			int i=ps.executeUpdate();
			return i;
		
	}

	public void displayuser(String username) throws SQLException {
		String query="Select * from user where username=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, username);
		ResultSet rs=ps.executeQuery();
		rs.next();
		System.out.println("username :"+rs.getString(1));
		System.out.println("password :"+rs.getString(2));
	
	}

	public void displayallluser() throws SQLException {
		String query="Select * from user";
		Statement ps=con.createStatement();
		ResultSet rs=ps.executeQuery(query);
		while(rs.next());
		System.out.println("username :"+rs.getString(1));
		System.out.println("password :"+rs.getString(2));
	
	}

	public int updaetpass(String username, String password) throws SQLException {
		String query="update user set password=(?) where username=(?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,password);
		ps.setString(2, username);
		int i=ps.executeUpdate();
		return i;
		
	}

	public int deleteuser(String username) throws SQLException {
		String query="delete from  user where username=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, username);
		int i =ps.executeUpdate(); 
		return i;
	}

}
