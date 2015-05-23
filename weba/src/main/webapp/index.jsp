<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Introduce tus datos</h1>
        
        <!--empieza el formulario
        
        (%)Simbolo para poder programar como si estuvieramos en java
        *Scriptlet
        -->
        <% 
        int edad=20;
        out.println("Tu edad es:"+edad);
        
        
        %>
        
        <form action="autenticar" method="post">
            login<br>
            <input type="text" name="login">
            <br>
            password
            <br>
            <input type="password" name="password">
            <br>
            <input type="submit" vale="ingresar">
            <br>
        
        </form>
     
    </body>
</html>
