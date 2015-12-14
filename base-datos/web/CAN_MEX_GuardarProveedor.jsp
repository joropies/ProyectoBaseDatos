<%-- 
    Document   : CAN_MEX_GuardarProveedor
    Created on : 10/12/2015, 10/12/2015 11:09:51 PM
    Author     : joropies
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CAN_MEX_Proveedores</title>
        <style>
            body {
                margin: 18px;
                padding: 10px;
                background: #f7c942;
            }
        </style>
    </head>
    <body>
        <h1>GUARDAR PROVEEDOR DE LA EMBAJADA DE CANADA EN MEXICO</h1>
        <form action="buscar-proveedor" method="GET">
            <h1>Introduce los valores que se solicitan: </h1>
            <input type="text" name="razon_social" placeholder="Razón Social: "><br>
            <input type="submit" value="Guardar Proveedor"><br>
        </form>
    </body>
</html>
