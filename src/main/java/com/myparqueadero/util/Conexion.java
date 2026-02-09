package com.myparqueadero.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/parqueoseguro?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn =  DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexion exitosa");
            return cn;
        } catch (Exception e) {
            System.out.println("Error de conexion: " + e.getMessage());
            return null;
        }
    }
}