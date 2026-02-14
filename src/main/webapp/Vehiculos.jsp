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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    
    <div class="container mt-5">
        <div class="card shadow">
            <div class="card-header bg-dark text-white">
                <h4 class="mb-0">
                    <%= vehiculo != null ? "Atualizar vehiculo" : "Registrar vehiculo" %>
                </h4>
            </div>
            <div class="card-body">
                
                <form action="<%= request.getContextPath() %>/VehiculosServlet" method="post">
                    <input type="hidden" name="idVehiculo" value="<%= vehiculo != null ? vehiculo.getidVehiculo() : "" %>">
                    
                    <input type="hidden" name="accion" value="<%= vehiculo != null ? "actualizar" : "registrar" %>">
                    
                    <div class="mb-3">
                        <label class="form-label">Placa</label>
                        <input type="text" class="form-control" name="placa" required value="<%= vehiculo != null ? vehiculo.getplaca() : "" %>" <%=vehiculo != null ? "readonly" : "" %>>
                    </div>
                    
                    <div class="mb-3">
                        <label class="form-label">Marca</label>
                        <input type="text" class="form-control" name="marca" required value="<%=vehiculo !=null ? vehiculo.getmarca() : "" %>">
                    </div>
                    
                    <div class="mb-3">
                        <label class="form-label">Modelo</label>
                        <input type="text" class="form-control" name="modelo" required value="<%=vehiculo !=null ? vehiculo.getmodelo() : "" %>">
                    </div>
                    
                    <div class="mb-3">
                        <label class="form-label">Color</label>
                        <input type="text" class="form-control" name="color" required value="<%=vehiculo !=null ? vehiculo.getcolor() : "" %>">
                    </div>
                    
                    <div class="mb-3">
                        <label class="form-label">Año</label>
                        <input type="number" class="form-control" name="anio" required min="1900" max="2099" value="<%=vehiculo !=null ? vehiculo.getanio() : "" %>">
                    </div>
                    
                    <div class="mb-3">
                        <label class="form-label">Documento del propietario</label>
                        <input type="text" class="form-control" name="documentoPropietario" required value="<%=vehiculo !=null ? vehiculo.getdocumentoPropietario() : "" %>">
                    </div>
                    
                    <div class="mb-3">
                        <label class="form-label">Categoria</label>
                        <select name="idCategoria" class="form-select" required>
                            <option value="">Seleccione</option>
                            <option value="1" <%= vehiculo != null && vehiculo.getidCategoria() == 1 ? "selected" : ""%>>Automovil</option>
                            <option value="2" <%= vehiculo != null && vehiculo.getidCategoria() == 2 ? "selected" : ""%>>SUV</option>
                            <option value="3" <%= vehiculo != null && vehiculo.getidCategoria() == 3 ? "selected" : ""%>>Motocicleta</option>
                            <option value="4" <%= vehiculo != null && vehiculo.getidCategoria() == 4 ? "selected" : ""%>>Bicicleta</option>
                        </select>
                    </div>
                        
                    <div class="d-flex gap-2">
                        <button type="submit" class="btn btn-primary">
                            <%=vehiculo !=null ? "Actualizar" : "Registrar" %>
                        </button>
                        
                        <a href="<%= request.getContextPath() %>/index.jsp" class="btn btn-secondary">
                            Volver
                        </a>
                    </div>
                </form>
            </div>
        </div>            
    </div>
    <br>
    <script src="htps://cdn.jsdelivr.vnet/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>