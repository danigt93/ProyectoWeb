package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.curso.java.ClasesProyecto.UsuarioProyecto;
import es.curso.java.ddbb.ConexionBaseDeDatos;
import es.curso.java.hibernate.basics.daos.AlumnoHibernateDAO;
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
    public void init() {
        // Inicializar la conexión a la base de datos
        Connection connection = ConexionBaseDeDatos.getConnection();
        usuarioProyectoDAO = new UsuarioProyectoDAO(connection);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            // Obtener la lista de usuarios desde la base de datos
            List<UsuarioProyecto> usuarios = usuarioProyectoDAO.getAllUsuarios();

            // Configurar atributos en el request para mostrar en la página JSP
            request.setAttribute("usuarios", usuarios);

            // Enviar la solicitud a la página de gestión de usuarios (gestionUsuarios.jsp)
            request.getRequestDispatcher("ProyectoLeMans/ListaUsuarios.jsp").forward(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Error al obtener la lista de usuarios");
        }
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

        try {
            // Insertar el nuevo usuario en la base de datos
            usuarioProyectoDAO.insertUsuario(nuevoUsuario);
            response.getWriter().println("Usuario registrado con éxito");

        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Error al registrar el usuario");
        }
        
//        public void insertarUsuario(String nombre, String apellidos, String dni, String sexo,
//                String idUsuario, String contrasena, String email,
//                String telefono, String fechaNacimiento) {
//        	
//        		Connection conexion = obtenerConexion();
//        	
//			if (conexion != null) {
//				
//				try {
//					
//				// Crear la sentencia SQL para la inserción
//				String sql = "INSERT INTO Usuario (Nombre, Apellidos, Dni, Sexo, idUsuario, Contraseña, Email, Teléfono, FechaNacimiento) " +
//				      "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
//				PreparedStatement preparedStatement = conexion.prepareStatement(sql);
//				
//				// Establecer los parámetros
//				preparedStatement.setString(1, nombre);
//				preparedStatement.setString(2, apellidos);
//				preparedStatement.setString(3, dni);
//				preparedStatement.setString(4, sexo);
//				preparedStatement.setString(5, idUsuario);
//				preparedStatement.setString(6, contrasena);
//				preparedStatement.setString(7, email);
//				preparedStatement.setString(8, telefono);
//				preparedStatement.setString(9, fechaNacimiento);
//				
//				// Ejecutar la inserción
//				preparedStatement.executeUpdate();
//				System.out.println("Usuario insertado correctamente");
//				} catch (SQLException e) {
//					
//			System.err.println("Error al insertar usuario: " + e.getMessage());
//			
//				} finally {
//					
//					cerrarConexion(conexion);
//				}
//			 }
//        }
        
    }

    // Otros métodos para manejar actualizaciones, eliminaciones, etc.
}