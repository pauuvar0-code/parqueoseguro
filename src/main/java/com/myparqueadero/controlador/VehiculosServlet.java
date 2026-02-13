package com.myparqueadero.controlador;

import com.myparqueadero.dao.VehiculosDAO;
import com.myparqueadero.modelo.Vehiculos;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/VehiculosServlet")
public class VehiculosServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion = request.getParameter("accion");
        
        System.out.println("ACCION = " + accion);
        
        String placa = request.getParameter("placa");
        String marca = request.getParameter("marca");
        String modelo = request.getParameter("modelo");
        String color = request.getParameter("color");
        int anio = Integer.parseInt(request.getParameter("anio"));
        String documentoPropietario = request.getParameter("documentoPropietario");
        int idCategoria = Integer.parseInt(request.getParameter("idCategoria"));
      
        Vehiculos vehiculo = new Vehiculos();
        vehiculo.setplaca(placa);
        vehiculo.setmarca(marca);
        vehiculo.setmodelo(modelo);
        vehiculo.setcolor(color);
        vehiculo.setanio(anio);
        vehiculo.setdocumentoPropietario(documentoPropietario);
        vehiculo.setidCategoria(idCategoria);
        
        VehiculosDAO dao = new VehiculosDAO();
        boolean exito = false;
        
        if ("registrar".equals(accion)) {
            exito = dao.insertar(vehiculo);
            
        } else if ("actualizar".equals(accion)) {
            int idVehiculo = Integer.parseInt(request.getParameter("idVehiculo"));
            vehiculo.setidVehiculo(idVehiculo);
            exito = dao.actualizar(vehiculo);
            
            response.sendRedirect(request.getContextPath() + "/VehiculosServlet");
            return;
        }
        
        request.setAttribute("exito", exito);
        request.setAttribute("vehiculo", vehiculo);
        
        response.sendRedirect(request.getContextPath() + "/VehiculosServlet");

    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion = request.getParameter("accion");
        
        VehiculosDAO dao = new VehiculosDAO();
        
        if("editar".equals(accion)) {
            
            int idVehiculo = Integer.parseInt(request.getParameter("idVehiculo"));
            Vehiculos vehiculo = dao.buscarPorId(idVehiculo);
            
            request.setAttribute("vehiculo", vehiculo);
            request.getRequestDispatcher("Vehiculos.jsp").forward(request, response);
        } else if("eliminar".equals(accion)) {
            
            int idVehiculo = Integer.parseInt(request.getParameter("idVehiculo"));
            dao.eliminar(idVehiculo);
            
            response.sendRedirect(request.getContextPath() + "/VehiculosServlet");
        }else if("buscar".equals(accion)){
            
            String placa = request.getParameter("placa");
            
            List<Vehiculos> lista = dao.buscarPorPlaca(placa);
            
            request.setAttribute("listaVehiculos", lista);
            request.getRequestDispatcher("/listarVehiculos.jsp").forward(request, response);
        }else {
            List<Vehiculos> lista = dao.listar();
            
            System.out.println("Cantidad de vehiculos: " + lista.size());
            
            request.setAttribute("listaVehiculos", lista);
            request.getRequestDispatcher("/listarVehiculos.jsp")
                    .forward(request, response);
        }
    }
}