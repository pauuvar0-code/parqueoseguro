package com.myparqueadero.dao;

import com.myparqueadero.modelo.Camaras;
import com.myparqueadero.util.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CamarasDAO {
    
    public boolean insertar(Camaras c) {
        String sql = "INSERT INTO Camaras(ubicacion, estado, grabando) VALUES(?, ?, ?)";
        try (Connection cn = Conexion.conectar();
            PreparedStatement ps = cn.prepareStatement(sql)) {
            
            ps.setString(1, c.getubicacion());
            ps.setString(2, c.getestado());
            ps.setBoolean(3, c.isgrabando());
            
            ps.executeUpdate();
            return true;
            
        }catch(Exception e) {
            System.out.println("Error CamarasDAO: " + e.getMessage());
            return false;
        }
    }
}