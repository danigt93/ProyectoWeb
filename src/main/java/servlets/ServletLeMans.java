package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import entities.EntityProyecto.UsuarioEntity;
import es.curso.java.ClasesProyecto.UsuarioProyecto;
import es.curso.java.ddbb.ConexionBaseDeDatos;
import es.curso.java.hibernate.basics.daos.AlumnoHibernateDAO;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojos.DaosProyecto.UsuarioProyectoDAO;

@WebServlet("/usuarios")
public class ServletLeMans extends HttpServlet {

    private UsuarioProyectoDAO usuarioProyectoDAO;
	private static final Logger logger = LogManager.getLogger(AlumnoHibernateDAO.class);

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // Obtener la lista de usuarios desde la base de datos
    	List<UsuarioEntity> usuarios = usuarioProyectoDAO.getAllUsuarios();

		// Configurar atributos en el request para mostrar en la página JSP
		request.setAttribute("usuarios", usuarios);

		// Enviar la solicitud a la página de gestión de usuarios (gestionUsuarios.jsp)
		request.getRequestDispatcher("ProyectoLeMans/ListaUsuarios.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Manejar la creación de nuevos usuarios
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        logger.info(email);
        logger.info(password);
        // Otros parámetros...

        UsuarioProyecto nuevoUsuario = new UsuarioProyecto();
        nuevoUsuario.setNombre(email);
        nuevoUsuario.setApellidos(password);
        // Configurar otros atributos del usuario...

        // Insertar el nuevo usuario en la base de datos
		usuarioProyectoDAO.insertarUsuario(nuevoUsuario);
		response.getWriter().println("Usuario registrado con éxito");
    }
}