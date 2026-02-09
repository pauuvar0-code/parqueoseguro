package com.myparqueadero.dao;

import com.myparqueadero.modelo.Pagos;
import com.myparqueadero.util.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PagosDAO {
    
    public boolean insertar(Pagos p) {
        String sql = "INSERT INTO Pagos(placa, monto, metodoPago, banco, correoPagador) VALUES(?, ?, ?, ?, ?)";
        try (Connection cn = Conexion.conectar();
            PreparedStatement ps = cn.prepareStatement(sql)) {
            
            ps.setString(1, p.getplaca());
            ps.setBigDecimal(2, p.getmonto());
            ps.setString(3, p.getmetodoPago());
            ps.setString(4, p.getbanco());
            ps.setString(5, p.getcorreoPagador());
            
            ps.executeUpdate();
            return true;
            
        }catch(Exception e) {
            System.out.println("Eror PagosDAO: " + e.getMessage());
            return false;
        }
    }
}