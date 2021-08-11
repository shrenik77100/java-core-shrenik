package com.shrenik;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.shrenik.database.DbConfig;

public class MainApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Connection conn = DbConfig.connectMySQL();
		
		//Read Operation
		String query = "SELECT flightcode, flightname FROM Flight";
		Statement stmt = conn.createStatement();
		ResultSet R = stmt.executeQuery(query);
		
		while(true)
		{
			if(R.next()==false)
				break;
			
			System.out.println(R.getInt("flightcode") + "\t" + R.getString("flightname"));
		}

	}

}
