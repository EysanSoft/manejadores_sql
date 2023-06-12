package com.bd.manejadoresSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class AlumnosDAO {
	
	Random r = new Random();
	long inicio, fin, tiempofinal;
	private Connection connection = null;
	private final int ACCEPT = 1;
	
	public double insertarPostgres(int num) {
		double segundos;
		AdaptadorPostgresSQL conector = new AdaptadorPostgresSQL();
			connection = conector.getConnection();
			
			if (connection != null) {
				String sql = "insert into \"alumno\" values(?,?,?)";
				
				try {
					PreparedStatement statement = connection.prepareStatement(sql);
					inicio=System.currentTimeMillis();
					for (int i = 1; i < num; i++) {
						statement.setInt(1, i);
						statement.setString(2, "nombre"+i);
						statement.setInt(3,r.nextInt(101));
						statement.executeUpdate();
					}
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		fin=System.currentTimeMillis();
		tiempofinal=inicio-fin;
		segundos=(double) tiempofinal/1000;
		return segundos;
	}
	
	public double insertarSQLServer(int num) {
		double segundos;
		AdaptadorSQLServer conector = new AdaptadorSQLServer();
			connection = conector.getConnection();
			//insert into ALUMNO values(?,?,?)
			if (connection != null) {
				System.out.println("Entro");
				String sql = "INSERT INTO alumno (idAlumno,Nombre,idCiudad) VALUES (?,?,?)";
				System.out.println("Entro");
				try {
					PreparedStatement statement = connection.prepareStatement(sql);
					inicio=System.currentTimeMillis();
					for (int i = 1; i < num; i++) {
						statement.setInt(1, i);
						statement.setString(2, "nombre"+i);
						statement.setInt(3,r.nextInt(101));
						statement.executeUpdate();
					}
				} 
				catch (SQLException e) {
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
				String sql = "insert into alumno values(?,?,?)";
				
				try {
					PreparedStatement statement = connection.prepareStatement(sql);
					inicio=System.currentTimeMillis();
					for (int i = 1; i < num; i++) {
						statement.setInt(1, i);
						statement.setString(2, "nombre"+i);
						statement.setInt(3,r.nextInt(101));
						statement.executeUpdate();
					}
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		fin=System.currentTimeMillis();
		tiempofinal=inicio-fin;
		segundos=(double) tiempofinal/1000;
		return segundos;
	}
}
