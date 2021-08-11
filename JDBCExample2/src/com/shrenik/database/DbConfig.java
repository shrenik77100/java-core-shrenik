package com.shrenik.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
	
	public static Connection connectMySQL() throws SQLException, ClassNotFoundException
	{
		//step1: Register Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step2: Create Connection
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "manager");
	}
}
