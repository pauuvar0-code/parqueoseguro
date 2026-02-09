package com.myparqueadero.modelo;

import java.sql.Timestamp;

public class Usuario {
    
    private int idUsuario;
    private String nombreCompleto;
    private String correo;
    private String telefono;
    private String documento;
    private Timestamp fechaRegistro;
    
    //Constructor
    public Usuario(){
        
    }
    
    public Usuario(int idUsuario, String nombreCompleto, String correo, String telefono, String documento, Timestamp fechaRegistro) {
        this.idUsuario = idUsuario;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.telefono = telefono;
        this.documento = documento;
        this.fechaRegistro = fechaRegistro;
    }
    
    //Getters y Setters
    public int getIdUsuario(){return idUsuario;}
    public void setIdUsuario(int idUsuario){this.idUsuario = idUsuario;}
    public String getNombreCompleto() {return nombreCompleto;}
    public void setNombreCompleto(String nombreCompleto){this.nombreCompleto = nombreCompleto;}
    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;}
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public String getDocumento() {return documento;}
    public void setDocumento(String documento) {this.documento = documento;}
    public Timestamp getFechaRegistro() {return fechaRegistro;}
    public void setFechaRegistro(Timestamp fechaRegistro) {this.fechaRegistro = fechaRegistro;}
}
