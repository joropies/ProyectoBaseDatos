/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.model;

import com.jc.model.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author joropies
 */
public class DAOGuardarDance {
    //agregamos los parametros al metodo Guardar
    // este es una plantilla para conectar
    // se cambia el void por String
    public String Guardar(int id, String email, int edad) throws Exception {
    
        Conexion c=new Conexion();
        Connection con=c.conectarse();
        CallableStatement callate=con.prepareCall("call GUARDAR_DANCE(?,?,?)");
        //callate.registerOutParameter(1,java.sql.Types.INTEGER); SOLO SI FUERA PRIMARY KEY
        callate.setInt(1,id);
        callate.setString(2,email);
        callate.setInt(3,edad);
      
        callate.execute();
        int pk=callate.getInt(1);
        
        return "DANCE guardado con éxito";
    
    }
    
}
