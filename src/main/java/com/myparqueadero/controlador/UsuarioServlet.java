package com.myparqueadero.controlador;

import com.myparqueadero.dao.UsuarioDAO;
import com.myparqueadero.modelo.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String nombreCompleto = request.getParameter("nombreCompleto");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        String documento = request.getParameter("documento");
        
        Usuario usuario = new Usuario();
        usuario.setNombreCompleto(nombreCompleto);
        usuario.setCorreo(correo);
        usuario.setTelefono(telefono);
        usuario.setDocumento(documento);
        
        UsuarioDAO dao = new UsuarioDAO();
        boolean exito = dao.insertar(usuario);
        
        request.setAttribute("exito", exito);
        request.setAttribute("usuario", usuario);
        
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
