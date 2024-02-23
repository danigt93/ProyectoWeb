import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import es.curso.java.ddbb.ConexionBaseDeDatos;

public class conexionProyecto extends ConexionBaseDeDatos {
	
	
	private void conecta() {
		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
		String username = "root";
		String password = "password";

		Connection connection = null;//Conexion con la base de datos
		Statement stmt = null;//Lanzar consulta
		ResultSet rs = null;//Recoger datos de la consulta
		try {

			System.out.println("Estableciendo conexión");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Conexión establecida");
			stmt = connection.createStatement();

			rs = stmt.executeQuery("SELECT * FROM TB_USUARIOLEMANS");
			
			while (rs.next()) {
				System.out.println(rs.getString("nombre"));
				System.out.println(rs.getString("apellidos"));
				System.out.println(rs.getString("dni"));
				System.out.println(rs.getString("sexo"));
				System.out.println(rs.getString("idUsuario"));
				System.out.println(rs.getString("password"));
				System.out.println(rs.getString("email"));
				System.out.println(rs.getInt("tlf"));
				System.out.println(rs.getString("fechaNac"));
				System.out.println("===============================");
			}

		} catch (SQLException e) {
			System.err.println("Ha habido un error " + e.getMessage());
//			e.printStackTrace();
		} finally {
			
			try {
				if (connection!=null) {
					connection.close();
				}
				if (stmt!=null)
					stmt.close();
				if (rs!=null)
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
}
