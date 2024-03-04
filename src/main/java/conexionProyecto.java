import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import es.curso.java.ddbb.ConexionBaseDeDatos;

public class conexionProyecto extends ConexionBaseDeDatos {
	
		
		public static class ConexionBD {
		    // Detalles de la conexión (pueden leerse desde un archivo .properties)
		    private static final String URL = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
		    private static final String USUARIO = "root";
		    private static final String CONTRASENA = "password";

		    public static Connection obtenerConexion() {
		        Connection conexion = null;
		        try {
		            // Cargar el controlador JDBC
		            Class.forName("com.mysql.cj.jdbc.Driver");

		            // Establecer la conexión
		            Properties props = new Properties();
		            props.setProperty("user", USUARIO);
		            props.setProperty("password", CONTRASENA);
		            conexion = DriverManager.getConnection(URL, props);
		            System.out.println("Conexión exitosa a la base de datos");
		        } catch (ClassNotFoundException | SQLException e) {
		            System.err.println("Error en la conexión a la base de datos: " + e.getMessage());
		        }
		        return conexion;
		    }

		    
		    public static void cerrarConexion(Connection conexion) {
		        try {
		            if (conexion != null && !conexion.isClosed()) {
		                conexion.close();
		                System.out.println("Conexión cerrada");
		            }
		        } catch (SQLException e) {
		            System.err.println("Error al cerrar la conexión: " + e.getMessage());
		        }
		    }

		    public static void insertarUsuario(String nombre, String apellidos, String dni, String sexo,
		                                       String idUsuario, String contrasena, String email,
		                                       String telefono, String fechaNacimiento) {
		        Connection conexion = obtenerConexion();
		        if (conexion != null) {
		            try {
		                // Crear la sentencia SQL para la inserción
		                String sql = "INSERT INTO Usuario (Nombre, Apellidos, Dni, Sexo, idUsuario, Contraseña, Email, Teléfono, FechaNacimiento) " +
		                             "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		                PreparedStatement preparedStatement = conexion.prepareStatement(sql);

		                // Establecer los parámetros
		                preparedStatement.setString(1, nombre);
		                preparedStatement.setString(2, apellidos);
		                preparedStatement.setString(3, dni);
		                preparedStatement.setString(4, sexo);
		                preparedStatement.setString(5, idUsuario);
		                preparedStatement.setString(6, contrasena);
		                preparedStatement.setString(7, email);
		                preparedStatement.setString(8, telefono);
		                preparedStatement.setString(9, fechaNacimiento);

		                // Ejecutar la inserción
		                preparedStatement.executeUpdate();
		                System.out.println("Usuario insertado correctamente");
		            } catch (SQLException e) {
		                System.err.println("Error al insertar usuario: " + e.getMessage());
		            } finally {
		                cerrarConexion(conexion);
		            }
		        }
		    }

		    public static void main(String[] args) {
		        // Ejemplo de uso: insertar un usuario
		        insertarUsuario("Juan", "Perez", "12345678A", "M", "juan123", "contrasena123", "juan@example.com", "123456789", "2000-01-01");
		    }
		}

		
		
//		private void conecta() {
//		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
//		String username = "root";
//		String password = "password";
//
//		Connection connection = null;//Conexion con la base de datos
//		Statement stmt = null;//Lanzar consulta
//		ResultSet rs = null;//Recoger datos de la consulta
//		try {
//
//			System.out.println("Estableciendo conexión");
//			connection = DriverManager.getConnection(url, username, password);
//			System.out.println("Conexión establecida");
//			stmt = connection.createStatement();
//
//			rs = stmt.executeQuery("SELECT * FROM TB_USUARIOLEMANS");
//			
//			while (rs.next()) {
//				System.out.println(rs.getString("nombre"));
//				System.out.println(rs.getString("apellidos"));
//				System.out.println(rs.getString("dni"));
//				System.out.println(rs.getString("sexo"));
//				System.out.println(rs.getString("idUsuario"));
//				System.out.println(rs.getString("password"));
//				System.out.println(rs.getString("email"));
//				System.out.println(rs.getInt("tlf"));
//				System.out.println(rs.getString("fechaNac"));
//				System.out.println("===============================");
//			}
//
//		} catch (SQLException e) {
//			System.err.println("Ha habido un error " + e.getMessage());
////			e.printStackTrace();
//		} finally {
//			
//			try {
//				if (connection!=null) {
//					connection.close();
//				}
//				if (stmt!=null)
//					stmt.close();
//				if (rs!=null)
//					rs.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
		
	}

