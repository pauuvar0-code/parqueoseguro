<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        
        <h2>Resultado del Registro</h2>

        <%
            Boolean exito = (Boolean) request.getAttribute("exito");
        %>
        
        <% if (exito != null && exito) { %>
        <p style="color:green;">Usuario registrado correctamente</p>
        <p>Nombre: ${usuario.nombreCompleto}</p>
        <p>Correo: ${usuario.correo}</p>
        <% } else {%>
        <p style="color: red;">Error: el usuario no se pudo registrar (correo duplicado)</p>
        <% } %>
        
        <a href="usuario.jsp">Volver</a>
    </body>
</html>
