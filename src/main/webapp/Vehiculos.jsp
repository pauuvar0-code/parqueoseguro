<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="com.myparqueadero.modelo.Vehiculos" %>

<%
    Vehiculos vehiculo = (Vehiculos) request.getAttribute("vehiculo");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registrar Vehículo</title>
</head>
<body>
    
    <h2>Resgistro de Vehiculo</h2>
    
    <form action="VehiculosServlet" method="post">
   
        <input type="hidden" name="idVehiculo" value="<%= vehiculo != null ? vehiculo.getidVehiculo() : "" %>">
        
        <input type="hidden" name="accion" value="<%= vehiculo != null ? "actualizar" : "registrar" %>">
        
        <label>Placa:</label><br>
        <input type="text" name="placa" required value="<%= vehiculo != null ? vehiculo.getplaca() : "" %>" 
               <%= vehiculo != null ? "readonly" : "" %>><br><br>
        
        <label>Marca:</label><br>
        <input type="text" name="marca" required value="<%= vehiculo != null ? vehiculo.getmarca() : "" %>"><br><br>
        
        <label>Modelo:</label><br>
        <input type="text" name="modelo" required value="<%= vehiculo != null ? vehiculo.getmodelo() : "" %>"><br><br>
        
        <label>Color:</label><br>
        <input type="text" name="color" required value="<%= vehiculo != null ? vehiculo.getcolor() : "" %>"><br><br>
        
        <label>Año:</label><br>
        <input type="text" name="anio" required value="<%= vehiculo != null ? vehiculo.getanio() : "" %>"><br><br>
        
        <label>Documento del propietario:</label><br>
        <input type="text" name="documentoPropietario" required value="<%= vehiculo != null ? vehiculo.getdocumentoPropietario() : "" %>"><br><br>
        
        <label>Categoria del vehiculo:</label><br>
        <select name="idCategoria" required>
            <option value="">Seleccione</option>
            <option value="1" <%= vehiculo != null && vehiculo.getidCategoria() == 1 ? "selected" : ""%>>Automovil</option>
            <option value="2" <%= vehiculo != null && vehiculo.getidCategoria() == 2 ? "selected" : ""%>>SUV</option>
            <option value="3" <%= vehiculo != null && vehiculo.getidCategoria() == 3 ? "selected" : ""%>>Motocicleta</option>
            <option value="4" <%= vehiculo != null && vehiculo.getidCategoria() == 4 ? "selected" : ""%>>Bicicleta</option>
        </select><br><br>
        
        <button type="submit">
            <%= vehiculo != null ? "Actualizar Vehiculo" : "Registrar Vehiculo" %>
        </button>
    </form>
    
    <br>
    <a href="index.jsp">Volver al inicio</a>
    
</body>
</html>