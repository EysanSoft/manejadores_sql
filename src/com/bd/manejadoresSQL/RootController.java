package com.bd.manejadoresSQL;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RootController {

    @FXML
    private Button botonAlumnos;

    @FXML
    private Button botonCiudades;

    @FXML
    private TextField textAlumnos;

    @FXML
    private TextField textCiudades;

    @FXML
    void botonAlumnosOnMouseClicked(MouseEvent event) {
    	AlumnosDAO dao = new AlumnosDAO();
    	String cadenaAlumnos =  textAlumnos.getText();
    	int numAlumnos = Integer.parseInt(cadenaAlumnos);
    	
    	if(textAlumnos.getText().length() !=0) {
    		
    		//Ingreso de datos MySQL
    		double tiempoMySQL;
    		tiempoMySQL = dao.insertarMySQL(numAlumnos);
    		System.out.println("Tiempo total de MySQL = " + tiempoMySQL);
    		
        	//Ingreso de datos Postgress
    		double tiempoPostgres;
    		tiempoPostgres = dao.insertarPostgres(numAlumnos);
    		System.out.println("Tiempo total de PostgresSQL = " + tiempoPostgres);
    		
        	//Ingreso de datos SQLServer
    		double tiempoSQLServer;
    		tiempoSQLServer = dao.insertarSQLServer(numAlumnos);
    		System.out.println("Tiempo total de PostgresSQL = " + tiempoSQLServer);
  
			textAlumnos.clear();
    		System.out.println("Ingreso Exitoso");
    	}
    	else {
    		System.out.println("Por favor rellene todos los campos para agregar un nuevo usuario");
    		textAlumnos.clear();
    	}
    }

    @FXML
    void botonCiudadesOnMouseClicked(MouseEvent event) {
    	CiudadesDAO dao = new CiudadesDAO();
    	String cadenaCiudades =  textCiudades.getText();
    	int numCiudades = Integer.parseInt(cadenaCiudades);
    	
    	if(textCiudades.getText().length() !=0) {
    		//Ingreso de datos MySQL
    		double tiempoMySQL;
    		tiempoMySQL = dao.insertarMySQL(numCiudades);
    		System.out.println("Tiempo total de MySQL = " + tiempoMySQL);
    		
        	//Ingreso de datos Postgress
    		double tiempoPostgres;
    		tiempoPostgres = dao.insertarPostgres(numCiudades);
    		System.out.println("Tiempo total de PostgresSQL = " + tiempoPostgres);
    		
        	//Ingreso de datos SQLServer
    		double tiempoSQLServer;
    		tiempoSQLServer = dao.insertarSQLServer(numCiudades);
    		System.out.println("Tiempo total de PostgresSQL = " + tiempoSQLServer);
        	
			textCiudades.clear();
    		System.out.println("Ingreso Exitoso");
    	}
    	else {
    		System.out.println("Por favor rellene todos los campos para agregar un nuevo usuario");
    		textCiudades.clear();
    	}
    }

}