<%-- 
    Document   : dance
    Created on : 18/11/2015, 18/11/2015 09:35:50 PM
    Author     : joropies
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                margin: 18px;
                padding: 10px;
                background: #f7c942;
            }
        </style>
    </head>
    <body>
        <form action="guardar-dance" method="GET">
            <h1>Introduce los valores del dance</h1>
            <input type="text" name="id" placeholder="Introduce tu id"><br>
            <input type="text" name="email" placeholder="Introduce tu nombre"><br>
            <input type="text" name="edad" placeholder="Introduce tu edad"><br>
            <input type="submit" value="Guardar Registro"><br>
        </form>

    </body>
</html>
