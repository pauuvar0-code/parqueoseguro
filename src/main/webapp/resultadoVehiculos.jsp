<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultado Registro Vehículo</title>
</head>
<body>
    
    <h2>Resultado del Registro Vehiculo</h2>
    
    <%
        Boolean exito = (Boolean) request.getAttribute("exito");
    %>
    
    <% if (exito != null && exito) { %>
        <p style="color:green;">Vehículo registrado correctamente.</p>
        
        <p><strong>Placa:</strong> ${vehiculo.placa}</p>
        <p><strong>Marca:</strong> ${vehiculo.marca}</p>
        <p><strong>Modelo:</strong> ${vehiculo.modelo}</p>
        <p><strong>Color:</strong> ${vehiculo.color}</p>
        <p><strong>Año:</strong> ${vehiculo.anio}</p>
    
    <%} else { %>
       <p style="color:red;">
           Error: el vehículo no pudo ser registrado.
           Verifique que la placa no esté duplicada y que el propietario exista.
        </p>
    <% } %>

    <br>
    <a href="Vehiculos.jsp">Registrar otro vehículo</a><br>
    <a href="index.jsp">Volver al inicio</a>

</body>