package com.myparqueadero.modelo;

import java.sql.Timestamp;

public class Ticket {
    
    private int idTicket;
    private String placa;
    private String propietario;
    private Timestamp horaEntrada;
    private Timestamp horaSalida;
    private String estado;
    
    public Ticket(){
        
    }
    //Constructor
    public Ticket(int idTicket, String placa, String propietario, Timestamp horaEntrada, Timestamp horaSalida, String estado) {
        this.idTicket = idTicket;
        this.placa = placa;
        this.propietario = propietario;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.estado = estado;
    }
    
    //Getters y Setters
    public int getidTicket() {return idTicket;}
    public void setidTicket(int idTicket) {this.idTicket = idTicket;}
    public String getplaca() {return placa;}
    public void setplaca(String placa) {this.placa = placa;}
    public String getpropietario() {return propietario;}
    public void setpropietario(String propietario) {this.propietario = propietario;}
    public Timestamp gethoraEntrada() {return horaEntrada;}
    public void sethoraEntrada(Timestamp horaEntrada) {this.horaEntrada = horaEntrada;}
    public Timestamp gethoraSalida() {return horaSalida;}
    public void sethoraSalida(Timestamp horaSalida) {this.horaSalida = horaSalida;}
    public String getestado() {return estado;}
    public void setestado(String estado) {this.estado = estado;}
}