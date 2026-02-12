package com.myparqueadero.modelo;

import java.sql.Timestamp;

public class Vehiculos {
    private int idVehiculo;
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private int anio;
    private String documentoPropietario;
    private int idCategoria;
    private Timestamp fechaIngreso;
    private String nombreCategoria;
    
    
    public Vehiculos(){
        
    }
    
    //Constructor
    public Vehiculos(int idVehiculo, String placa, String marca, String modelo, String color, int anio, String documentoPropietario, int idCategoria, Timestamp fechaIngreso) {
        this.idVehiculo = idVehiculo;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.documentoPropietario = documentoPropietario;
        this.idCategoria =idCategoria;
        this.fechaIngreso = fechaIngreso;
    }
    
    //Getters y Setters
    public int getidVehiculo() {return idVehiculo;}
    public void setidVehiculo(int idVehiculo) {this.idVehiculo = idVehiculo;}
    public String getplaca() {return placa;}
    public void setplaca(String placa) {this.placa = placa;}
    public String getmarca() {return marca;}
    public void setmarca(String marca) {this.marca = marca;}
    public String getmodelo(){return modelo;}
    public void setmodelo(String modelo) {this.modelo = modelo;}
    public String getcolor() {return color;}
    public void setcolor(String color) {this.color = color;}
    public int getanio() {return anio;}
    public void setanio(int anio) {this.anio = anio;}
    public String getdocumentoPropietario() {return documentoPropietario;}
    public void setdocumentoPropietario(String documentoPropietario) {this.documentoPropietario = documentoPropietario;}
    public int getidCategoria() {return idCategoria;}
    public void setidCategoria(int idCategoria) {this.idCategoria = idCategoria;}
    public Timestamp getfechaIngreso() {return fechaIngreso;}
    public void setfechaIngreso(Timestamp fechaIngreso) {this.fechaIngreso = fechaIngreso;}
    public String getnombreCategoria() {return nombreCategoria;}
    public void setnombreCategoria(String nombreCategoria) {this.nombreCategoria = nombreCategoria;}
}