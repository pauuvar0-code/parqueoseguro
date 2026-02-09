package com.myparqueadero.dao;

import com.myparqueadero.modelo.Ticket;
import com.myparqueadero.util.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TicketDAO {
    
    public boolean insertar(Ticket t) {
        String sql = "INSERT INTO Ticket(placa, propietario, horaEntrada) VALUES(?, ?, ?)";
        try (Connection cn = Conexion.conectar();
            PreparedStatement ps = cn.prepareStatement(sql)) {
            
            ps.setString(1, t.getplaca());
            ps.setString(2, t.getpropietario());
            ps.setTimestamp(3, t.gethoraEntrada());
            
            ps.executeUpdate();
            return true;
        
        }catch (Exception e) {
            System.out.println("Error TicketDAO: " + e.getMessage());
            return false;
        }
    }
}