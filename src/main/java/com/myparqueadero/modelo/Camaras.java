package com.myparqueadero.modelo;

public class Camaras {
    
    private int idCamara;
    private String ubicacion;
    private String estado;
    private boolean grabando;
    
    //Constructor
    public Camaras(int idCamara, String ubicacion, String estado, boolean grabando) {
        this.idCamara = idCamara;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.grabando = grabando;
    }
    
    //Getters y Setters
    public int getidCamara() {return idCamara;}
    public void setidCamara(int idCamara) {this.idCamara = idCamara;}
    public String getubicacion() {return ubicacion;}
    public void setubicacion(String ubicacion) {this.ubicacion = ubicacion;}
    public String getestado() {return estado;}
    public void setestado(String estado) {this.estado = estado;}
    public boolean isgrabando() {return grabando;}
    public void setgrabando(boolean grabando) {this.grabando = grabando;}
}