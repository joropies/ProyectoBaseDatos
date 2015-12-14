/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.model;

/**
 *
 * @author joropies
 */
public class CAN_MEX_Pago {
    
    private int ID_PAGO;
    private int ID_PROVEEDOR;
    private int ID_DOMICILIO;
    private String LINEA_CAPTURA;
    private float MONTO;

    public int getID_PAGO() {
        return ID_PAGO;
    }

    public void setID_PAGO(int ID_PAGO) {
        this.ID_PAGO = ID_PAGO;
    }

    public int getID_PROVEEDOR() {
        return ID_PROVEEDOR;
    }

    public void setID_PROVEEDOR(int ID_PROVEEDOR) {
        this.ID_PROVEEDOR = ID_PROVEEDOR;
    }

    public int getID_DOMICILIO() {
        return ID_DOMICILIO;
    }

    public void setID_DOMICILIO(int ID_DOMICILIO) {
        this.ID_DOMICILIO = ID_DOMICILIO;
    }

    public String getLINEA_CAPTURA() {
        return LINEA_CAPTURA;
    }

    public void setLINEA_CAPTURA(String LINEA_CAPTURA) {
        this.LINEA_CAPTURA = LINEA_CAPTURA;
    }

    public float getMONTO() {
        return MONTO;
    }

    public void setMONTO(float MONTO) {
        this.MONTO = MONTO;
    }
    
}
