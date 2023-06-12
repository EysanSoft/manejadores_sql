package com.bd.manejadoresSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdaptadorPostgresSQL {
	
	public Connection getConnection() {
		Connection connection = null;
		String url="jdbc:postgresql://localhost:5432/E193286";
		String user="ivan";
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
