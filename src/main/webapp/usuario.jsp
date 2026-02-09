<%@page contentType= "text/html" pageEncoding= "UTF-8" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Registrar Usuario</title>
</head>
<body>

    <h2>Registro de Usuario</h2>
    
    <!-- Formulario html -->
    <form action="${pageContext.request.contextPath}/UsuarioServlet" method="post">
        
    <label>Nombre completo:</label><br>
    <input type="text" name="nombreCompleto" required>
    <label>Correo:</label><br>
    <input type="email" name="correo" required>
    <label>Telefono:</label><br>
    <input type="text" name="telefono" required>
    <label>Documento:</label><br>
    <input type="text" name="documento" required>

    <button type="submit">Enviar</button>
</form>

</body>
</html>
