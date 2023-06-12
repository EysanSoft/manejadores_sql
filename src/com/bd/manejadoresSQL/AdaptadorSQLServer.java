package com.bd.manejadoresSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdaptadorSQLServer {
	
	public Connection getConnection() {
		Connection connection = null;
		String url="jdbc:sqlserver://localhost:1433;databaseName=E193286";
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
