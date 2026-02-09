package com.myparqueadero.modelo;

import java.sql.Timestamp;

public class Reportes {
    private int idReporte;
    private String tipo;
    private Timestamp fechaGeneracion;
    private String descripcion;
    
    //Constructor
    public Reportes(int idReporte, String tipo, Timestamp fechaGeneracion, String descripcion) {
        this.idReporte = idReporte;
        this.tipo = tipo;
        this.fechaGeneracion = fechaGeneracion;
        this.descripcion = descripcion;
    }
    
    //Getters y Setters
    public int getidReporte() {return idReporte;}
    public void setidReporte(int idReporte) {this.idReporte = idReporte;}
    public String gettipo() {return tipo;}
    public void settipo(String tipo) {this.tipo = tipo;}
    public Timestamp getfechaGeneracion() {return fechaGeneracion;}
    public void setfechaGeneracion(Timestamp fechaGeneracion) {this.fechaGeneracion = fechaGeneracion;}
    public String getdescripcion() {return descripcion;}
    public void setdescripcion(String descripcion) {this.descripcion = descripcion;}
}