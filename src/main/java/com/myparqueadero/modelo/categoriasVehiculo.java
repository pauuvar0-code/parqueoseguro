package com.myparqueadero.modelo;

import java.math.BigDecimal;

public class categoriasVehiculo {
    
    private int idCategoria;
    private String nombre;
    private BigDecimal tarifaHora;
    
    public categoriasVehiculo() {
        
    }
    
    //Constructor
    public categoriasVehiculo(int idCategoria, String nombre, BigDecimal tarifaHora) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.tarifaHora = tarifaHora;
    }
    
    //Getters y Setters
    public int getidCategoria() {return idCategoria;}
    public void setidCategoria(int idCategoria) {this.idCategoria = idCategoria;}
    public String getnombre() {return nombre;}
    public void setnombre(String nombre) {this.nombre = nombre;}
    public BigDecimal gettarifaHora() {return tarifaHora;}
    public void settarifaHora(BigDecimal tarifaHora) {this.tarifaHora = tarifaHora;}
}