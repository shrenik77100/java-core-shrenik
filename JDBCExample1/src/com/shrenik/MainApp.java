package com.shrenik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Step1: Register Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step2: Create Database Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","manager");
		
		if(conn==null) {
			System.out.println("Connection Failed");
		}
		else
		{
			System.out.println("Connection Succeed");
		}
	}

}
