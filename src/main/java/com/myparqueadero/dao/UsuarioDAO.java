package com.myparqueadero.dao;

import com.myparqueadero.modelo.Usuario;
import com.myparqueadero.util.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UsuarioDAO {

    public boolean insertar(Usuario u) {
        String sql = "INSERT INTO usuario (nombreCompleto, correo, telefono, documento) VALUES (?, ?, ?, ?)";

        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, u.getNombreCompleto());
            ps.setString(2, u.getCorreo());
            ps.setString(3, u.getTelefono());
            ps.setString(4, u.getDocumento());

            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error UsuarioDAO: " + e.getMessage());
            return false;
        }
    }
}
