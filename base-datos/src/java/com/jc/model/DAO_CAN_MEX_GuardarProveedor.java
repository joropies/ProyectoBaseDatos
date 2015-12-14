/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.model;

import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author joropies
 */
public class DAO_CAN_MEX_GuardarProveedor {
        //agregamos los parametros al metodo Guardar
    // este es una plantilla para conectar
    // se cambia el void por String
    public String GuardarProveedor(String RAZON_SOCIAL) throws Exception {
    
        Conexion c = new Conexion();
        Connection con = c.conectarse();
        CallableStatement callate = con.prepareCall("call GUARDAR_CAN_MEX_PROVEEDOR(?)");
        //callate.registerOutParameter(1,java.sql.Types.INTEGER); SOLO SI FUERA PRIMARY KEY
        callate.setString(1,RAZON_SOCIAL);
      
        callate.execute();
        //int pk = callate.getInt(1);
        
        return "Proveedor guardado con éxito";
    
    }
}
