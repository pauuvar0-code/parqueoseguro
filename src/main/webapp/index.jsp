<%@page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Parqueadero</title>
</head>
<body>
    <h2>Sistema de Parqueadero</h2>
    
    <a href="<%= request.getContextPath() %>/Vehiculos.jsp">
        Gestion de vehiculos
    </a>
    <br><br>
    
    <a href="<%= request.getContextPath() %>/VehiculosServlet">
        Lista de vehiculos
    </a>
</body>
</html>