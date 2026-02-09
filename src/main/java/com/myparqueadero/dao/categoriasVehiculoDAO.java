package com.myparqueadero.dao;

import com.myparqueadero.modelo.categoriasVehiculo;
import com.myparqueadero.util.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class categoriasVehiculoDAO {
    
    public boolean insertar(categoriasVehiculo c) {
        String sql = "INSERT INTO cateforiasVehiculo(nombre, tarifaHora) VALUES(?,?)";
        try (Connection cn = Conexion.conectar();
            PreparedStatement ps = cn.prepareStatement(sql)) {
                
            ps.setString(1, c.getnombre());
            ps.setBigDecimal(2, c.gettarifaHora());
            
            ps.executeUpdate();
            return true;
            
        }catch (Exception e) {
            System.out.println("Error CategoriaDAO: " + e.getMessage());
            return false;
        }
    }
}