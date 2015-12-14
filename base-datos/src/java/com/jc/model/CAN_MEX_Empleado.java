/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.model;

import java.sql.Date;

/**
 *
 * @author joropies
 */
public class CAN_MEX_Empleado {
    
    private int ID_EMPLEADO;
    private int ID_DOMICILIO;
    private int ID_CARGO;
    private String NOMBRE;
    private Date FECHA_LLEGADA;
    private Date FECHA_SALIDA;

    public int getID_EMPLEADO() {
        return ID_EMPLEADO;
    }

    public void setID_EMPLEADO(int ID_EMPLEADO) {
        this.ID_EMPLEADO = ID_EMPLEADO;
    }

    public int getID_DOMICILIO() {
        return ID_DOMICILIO;
    }

    public void setID_DOMICILIO(int ID_DOMICILIO) {
        this.ID_DOMICILIO = ID_DOMICILIO;
    }

    public int getID_CARGO() {
        return ID_CARGO;
    }

    public void setID_CARGO(int ID_CARGO) {
        this.ID_CARGO = ID_CARGO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public Date getFECHA_LLEGADA() {
        return FECHA_LLEGADA;
    }

    public void setFECHA_LLEGADA(Date FECHA_LLEGADA) {
        this.FECHA_LLEGADA = FECHA_LLEGADA;
    }

    public Date getFECHA_SALIDA() {
        return FECHA_SALIDA;
    }

    public void setFECHA_SALIDA(Date FECHA_SALIDA) {
        this.FECHA_SALIDA = FECHA_SALIDA;
    }
    
}
