package com.bd.manejadoresSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Adaptadores {
	public Connection coneccionMySQL() {
		Connection connection_MySQL = null;
		String url = "jdbc:mysql://localhost:3306/e193286?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";
		String user = "root";
		String password = "081601";
		try {
			connection_MySQL = DriverManager.getConnection(url, user, password);
			System.out.println("esta conectado a mysql desde "+connection_MySQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection_MySQL;
	}
	
	public Connection coneccionSQLServer() {
		Connection connection_SQLServer = null;
		String url = "jdbc:sqlserver://localhost:1433;databaseName=E193286";
		String user ="sa";
		String password = "eyssy6180";
		try {
			connection_SQLServer = DriverManager.getConnection(url,user,password);
			System.out.println("esta conectado a sqlserver desde "+connection_SQLServer);
		} catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		return connection_SQLServer;
	}
	
	public Connection coneccionPostgresql() {
		Connection connection_PostgreSql = null;
		String url = "jdbc:postgresql://localhost:5432/E193286";
		String user = "postgres";
		String password = "081601";
		try{
			connection_PostgreSql = DriverManager.getConnection(url, user, password);
			System.out.println("esta conectado a postresql desde "+connection_PostgreSql);
		}catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		return connection_PostgreSql;
	}

}
