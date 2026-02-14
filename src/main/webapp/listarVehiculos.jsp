<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.util.List" %>
<%@page import="com.myparqueadero.modelo.Vehiculos" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Vehiculos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    
    <h2>Vehiculos Registrados</h2>
    
    <%
        String mensaje = (String) request.getParameter("mensaje");
        
        if("guardado".equals(mensaje)) {
    %>        
        <p style="color: green;"><strong>Vehiculo registrado exitosamente</strong></p>
    <%    
        } else if("actualizado".equals(mensaje)) {
    %>
        <p style="color: blue;"><strong>Vehiculo actualizado correctamente</strong></p>
    <%
        } else if("eliminado".equals(mensaje)) {
    %>
        <p style="color: red;"><strong>Vehiculo eliminado correctamente</strong></p>
    <%
        }
    %>
    
    <%
        List<Vehiculos> lista = (List<Vehiculos>) request.getAttribute("listaVehiculos");
    %>
    
    <p><strong>Total registros:</strong> <%= (lista != null ? lista.size() : 0) %></p>
    
    <form action="<%= request.getContextPath() %>/VehiculosServlet" method="get">
        
        <input type="hidden" name="accion" value="buscar">
        <input type="text" name="placa" placeholder="Buscar por placa">
        <button type="submit">Buscar</button>
        <a href="<%= request.getContextPath() %>/VehiculosServlet">
    </form>
    
    <table border="1">
        <tr>
            <th>Placa</th>
            <th>Marca</th>
            <th>Modelo</th>
            <th>Color</th>
            <th>Anio</th>
            <th>Propietario</th>
            <th>Categoria</th>
            <th>Editar</th>
            <th>Acciones</th>
        </tr>
        
    <%
        if(lista != null) {
            for (Vehiculos v: lista) {
    %>
    
        <tr>
            <td><%= v.getplaca() %></td>
            <td><%= v.getmarca() %></td>
            <td><%= v.getmodelo() %></td>
            <td><%= v.getcolor() %></td>
            <td><%= v.getanio() %></td>
            <td><%= v.getdocumentoPropietario() %></td>
            <td><%= v.getnombreCategoria() %></td>
            <td>
                <a href="<%= request.getContextPath() %>/VehiculosServlet?accion=editar&idVehiculo=<%= v.getidVehiculo() %>">
                    Editar
                </a>
                    
                |
                
                <a href="<%= request.getContextPath() %>/VehiculosServlet?accion=eliminar&idVehiculo=<%= v.getidVehiculo() %>"
                  onclick="return confirm('¿Está segura que desea eliminar este vehículo?');">
                   Eliminar
                </a>
            </td>
        </tr>
    <%        
            }
        }
    %>
    </table>
    
    <br>
    <a href="Vehiculos.jsp">Registro nuevo vehiculo</a>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>