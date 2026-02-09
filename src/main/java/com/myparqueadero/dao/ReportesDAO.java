package com.myparqueadero.dao;

import com.myparqueadero.modelo.Reportes;
import com.myparqueadero.util.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ReportesDAO {
    
    public boolean insertar(Reportes r) {
        String sql = "INSERT INTO Reportes(tipo, descripcion) VALUES(?, ?)";
        try (Connection cn = Conexion.conectar();
            PreparedStatement ps = cn.prepareStatement(sql)) {
            
            ps.setString(1, r.gettipo());
            ps.setString(2, r.getdescripcion());
            
            ps.executeUpdate();
            return true;
            
        }catch(Exception e) {
            System.out.println("Error ReportesDAO: " + e.getMessage());
            return false;
        }
    }
}