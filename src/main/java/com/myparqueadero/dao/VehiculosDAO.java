package com.myparqueadero.dao;

import com.myparqueadero.modelo.Vehiculos;
import com.myparqueadero.util.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VehiculosDAO {
    public boolean insertar(Vehiculos v) {
        String sql = "INSERT INTO Vehiculos(placa, marca, modelo, color, anio, documentoPropietario, idCategoria) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try (Connection cn = Conexion.conectar();
            PreparedStatement ps = cn.prepareStatement(sql)) {
            
            ps.setString(1, v.getplaca());
            ps.setString(2, v.getmarca());
            ps.setString(3, v.getmodelo());
            ps.setString(4, v.getcolor());
            ps.setInt(5, v.getanio());
            ps.setString(6, v.getdocumentoPropietario());
            ps.setInt(7, v.getidCategoria());
            
            ps.executeUpdate();
            return true;
            
        }catch (Exception e) {
            System.out.println("Eror VehiculosDAO: " + e.getMessage());
            return false;
        }
    }
    public List<Vehiculos> listar() {
        List<Vehiculos> lista = new ArrayList<>();
        String sql = "SELECT v.*, c.nombreCategoria " +
                     "FROM vehiculos v " +
                     "INNER JOIN categoriasVehiculos c ON v.idCategoria = c.idCategoria";
        
        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
           while (rs.next()) {
               Vehiculos v = new Vehiculos();
               v.setplaca(rs.getString("placa"));
               v.setmarca(rs.getString("marca"));
               v.setmodelo(rs.getString("modelo"));
               v.setcolor(rs.getString("color"));
               v.setanio(rs.getInt("anio"));
               v.setdocumentoPropietario(rs.getString("documentoPropietario"));
               v.setidCategoria(rs.getInt("idCategoria"));
               v.setidVehiculo(rs.getInt("idVehiculo"));
               v.setnombreCategoria(rs.getString("nombreCategoria"));
               
               lista.add(v);
           }
           
           System.out.println("Cantidad de vehiculos: " + lista.size());
           
        } catch (SQLException e) {
        System.out.println("Error listar vehiculos: " + e.getMessage());
        }
        
        return lista;
    }
    
    public Vehiculos buscarPorId(int idVehiculo) {
        
        Vehiculos v = null;
        String sql = "SELECT * FROM vehiculos WHERE idVehiculo = ?";
        
        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            
            ps.setInt(1, idVehiculo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                v = new Vehiculos();
                v.setidVehiculo(rs.getInt("idVehiculo"));
                v.setplaca(rs.getString("placa"));
                v.setmarca(rs.getString("marca"));
                v.setmodelo(rs.getString("modelo"));
                v.setcolor(rs.getString("color"));
                v.setanio(rs.getInt("anio"));
                v.setdocumentoPropietario(rs.getString("documentoPropietario"));
                v.setidCategoria(rs.getInt("idCategoria"));
            }
        }catch (Exception e) {
            System.out.println("Error buscar vehiculo: " + e.getMessage());
        }
        
        return v;
    }
    
    public boolean actualizar(Vehiculos v) {
        
        String sql = "UPDATE vehiculos SET marca=?, modelo=?, color=?, anio=?, documentoPropietario=?, idCategoria=? WHERE idVehiculo=?";
        
        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            
            ps.setString(1, v.getmarca());
            ps.setString(2, v.getmodelo());
            ps.setString(3, v.getcolor());
            ps.setInt(4, v.getanio());
            ps.setString(5, v.getdocumentoPropietario());
            ps.setInt(6, v.getidCategoria());
            ps.setInt(7, v.getidVehiculo());
            
            return ps.executeUpdate() > 0;
            
        } catch(Exception e) {
            System.out.println("Error actualizar vehiculo: " + e.getMessage());
            return false;
        }
    }
    
    public boolean eliminar(int idVehiculo) {
        String sql = "DELETE FROM vehiculos WHERE idVehiculo = ?";
        
        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            
            ps.setInt(1, idVehiculo);
            
            return ps.executeUpdate() > 0;
            
        } catch(Exception e) {
            System.out.println("Error al eliminar vehiculo: " + e.getMessage());
            return false;
        }
    }
}

