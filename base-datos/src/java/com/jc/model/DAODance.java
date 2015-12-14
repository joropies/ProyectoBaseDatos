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
public class DAODance {
    
    
    
    public ArrayList<Dance> buscarTodos() throws Exception{
    //primero invocamos a la conexion
    
    Connection con = Conexion.conectarse();
    
    //agregamos una consulta
    Statement st = con.createStatement();
    
    ResultSet res = st.executeQuery("SELECT * FROM DANCE");
    
    ArrayList<Dance> dances = new ArrayList<Dance>();
    
    while(res.next()){
    
        Integer id = res.getInt(1);
        // el numero indica el numero de columna
        String email = res.getString(2);
        Integer edad = res.getInt(3);
        
        Dance d = new Dance();
        d.setId(id);
        d.setEmail(email);
        d.setEdad(edad);
        
        dances.add(d);
    
    }
        // agregar el return
        return dances;
    
    }
}
