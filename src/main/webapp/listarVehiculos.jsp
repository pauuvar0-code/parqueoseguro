<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.util.List" %>
<%@page import="com.myparqueadero.modelo.Vehiculos" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Vehiculos</title>
</head>
<body>
    
    <h2>Vehiculos Registrados</h2>
    
    <%
        List<Vehiculos> lista = (List<Vehiculos>) request.getAttribute("listaVehiculos");
    %>
    
    <p><strong>Total registros:</strong> <%= (lista != null ? lista.size() : 0) %></p>
    


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
            <td><%= v.getidCategoria() %></td>
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
    
    
</body>
</html>