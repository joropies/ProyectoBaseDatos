/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.controladores;

import com.jc.model.DAO_CAN_MEX_BuscarTodosProveedores;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author joropies
 */
public class Servlet_CAN_MEX_BuscarTodos_Proveedores extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        DAO_CAN_MEX_BuscarTodosProveedores dcmp = new DAO_CAN_MEX_BuscarTodosProveedores();
        try{
        out.println(dcmp.buscarTodos().size());
        
        } catch (Exception ex) {
            out.println(ex.getMessage());
        }
        
        
        
    }
    }

  