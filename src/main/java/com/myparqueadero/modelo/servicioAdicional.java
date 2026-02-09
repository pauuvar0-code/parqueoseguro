package com.myparqueadero.modelo;

import java.math.BigDecimal;

public class servicioAdicional {
    
    private int idServicio;
    private String nombre;
    private BigDecimal costo;
    
    //Constructor
    public servicioAdicional(int idServicio, String nombre, BigDecimal costo) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.costo = costo;
    }
    
    //Getters y Setters
    public int getidServicio() {return idServicio;}
    public void setidServicio(int idServicio) {this.idServicio = idServicio;}
    public String getnombre() {return nombre;}
    public void setnombre(String nombre) {this.nombre = nombre;}
    public BigDecimal getcosto() {return costo;}
    public void setcosto(BigDecimal costo) {this.costo = costo;}
}
