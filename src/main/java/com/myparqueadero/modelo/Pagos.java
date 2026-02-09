package com.myparqueadero.modelo;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Pagos {
    
    private int idPagos;
    private String placa;
    private BigDecimal monto;
    private String metodoPago;
    private String banco;
    private String correoPagador;
    private Timestamp fechaPago;
    
    //Constructor
    public Pagos(int idPagos, String placa, BigDecimal monto, String metodoPago, String banco, String correoPagador, Timestamp fechaPago) {
        this.idPagos = idPagos;
        this.placa = placa;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.banco = banco;
        this.correoPagador = correoPagador;
        this.fechaPago = fechaPago;
    }
    
    //Getters y Setters
    public int getidPagos() {return idPagos;}
    public void setidPagos(int idPagos) {this.idPagos = idPagos;}
    public String getplaca() {return placa;}
    public void setplaca(String placa) {this.placa = placa;}
    public BigDecimal getmonto() {return monto;}
    public void setmonto(BigDecimal monto) {this.monto = monto;}
    public String getmetodoPago() {return metodoPago;}
    public void setmetodoPago(String metodoPago) {this.metodoPago = metodoPago;}
    public String getbanco() {return banco;}
    public void setbanco(String banco) {this.banco = banco;}
    public String getcorreoPagador() {return correoPagador;}
    public void setcorreoPagador(String correoPagador) {this.correoPagador = correoPagador;}
    public Timestamp getfechaPago() {return fechaPago;}
    public void setfechaPago(Timestamp fechaPago) {this.fechaPago = fechaPago;}
    
}