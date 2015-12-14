/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author joropies
 */
public class DAO_CAN_MEX_BuscarTodosProveedores {
    
    public ArrayList<CAN_MEX_Proveedor> buscarTodos() throws Exception{
    //primero invocamos a la conexion
    
    Connection con = Conexion.conectarse();
    
    //agregamos una consulta
    Statement st = con.createStatement();
    
    ResultSet res = st.executeQuery("SELECT * FROM CAN_MEX_PROVEEDORES");
    
    ArrayList<CAN_MEX_Proveedor> proveedores = new ArrayList<CAN_MEX_Proveedor>();
    
    while(res.next()){
    
        Integer ID_PROVEEDOR = res.getInt(1);
        // el numero indica el numero de columna
        String RAZON_SOCIAL = res.getString(2);
        
        CAN_MEX_Proveedor pro = new CAN_MEX_Proveedor();
        pro.setID_PROVEEDOR(ID_PROVEEDOR);
        pro.setRAZON_SOCIAL(RAZON_SOCIAL);
       
        proveedores.add(pro);
    
    }
        // agregar el return
        return proveedores;
    
    }

    
}

