/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author joropies
 */
public class ServletGuardarDance extends HttpServlet {

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
        out.println("Mi servletcito bonito ");
        
        DAOGuardarDance dao = new DAOGuardarDance();
        
        //en cualquier formulario siempre manda un string por eso hay que hacer casting
        int id = Integer.parseInt(request.getParameter("id"));
        String email = request.getParameter("email");
        int edad = Integer.parseInt(request.getParameter("edad"));
        
        // el metodo guardar se ponen con try catch
        try {
            out.println(dao.Guardar(id, email, edad));
        } catch (Exception ex) {

            out.println(ex.getMessage());
            
        }
    }}