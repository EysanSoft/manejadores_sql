package com.bd.manejadoresSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdaptadorMySQL {
	
	public Connection getConnection() {
		Connection connection = null;
		String url="jdbc:mysql://localhost:3306/e193286?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";
		String user="root";
		String password="081601";
		
		try {
			connection=DriverManager.getConnection(url, user, password);
			System.out.println(connection);
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
