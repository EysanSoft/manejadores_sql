package com.bd.manejadoresSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CiudadesDAO {
	
	long inicio;
	long fin;
	long tiempofinal;
	private Connection connection = null;
	private final int ACCEPT = 1;
	int id;
	String ciudad;
	
	public double insertarPostgres(int num) {
		double segundos;
		AdaptadorPostgresSQL conector = new AdaptadorPostgresSQL();
		connection = conector.getConnection();
			
		if (connection != null) {
			String sql = "insert into \"ciudad\" values(?,?)";
			try {
				PreparedStatement statement = connection.prepareStatement(sql);
				inicio = System.currentTimeMillis();
				for (int i = 1; i < num; i++) {
					id = i;
					ciudad = "Ciudad" + i;
					statement.setInt(1, id);
					statement.setString( 2, ciudad);
					statement.executeUpdate();
				}
				System.out.println("listo");
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		fin = System.currentTimeMillis();
		tiempofinal = inicio-fin;
		segundos = (double) tiempofinal/1000;
		return segundos;
	}
	
	public double insertarSQLServer(int num) {
		double segundos;
		AdaptadorSQLServer conector = new AdaptadorSQLServer();
			connection = conector.getConnection();
			
			if (connection != null) {
				String sql = "insert into CIUDAD values(?,?)";
				
				try {
					PreparedStatement statement = connection.prepareStatement(sql);
					inicio = System.currentTimeMillis();
					for (int i = 1; i < num; i++) {
						id = i;
						ciudad="ciudad"+i;
						statement.setInt(1, id);
						statement.setString( 2,ciudad);
						statement.executeUpdate();
					}
					System.out.println("listo");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		fin=System.currentTimeMillis();
		tiempofinal=inicio-fin;
		segundos=(double) tiempofinal/1000;
		return segundos;
	}
	
	public double insertarMySQL(int num) {
		 double segundos;
		 AdaptadorMySQL conector = new AdaptadorMySQL();
			connection = conector.getConnection();
			
			if (connection != null) {
				String sql = "insert into ciudad values(?,?)";
				
				try {
					PreparedStatement statement = connection.prepareStatement(sql);
					inicio=System.currentTimeMillis();
					for (int i = 1; i < num; i++) {
						id=i;
						ciudad="ciudad"+i;
						statement.setInt(1, id);
						statement.setString( 2,ciudad);
						statement.executeUpdate();
					}
					System.out.println("listo");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		fin=System.currentTimeMillis();
		tiempofinal=inicio-fin;
		segundos=(double) tiempofinal/1000;
		return segundos;
	}
	
}
