package pojos.DaosProyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import es.curso.java.ClasesProyecto.UsuarioProyecto;



public class UsuarioProyectoDAO {

	    private Connection connection;

	    public UsuarioProyectoDAO(Connection connection) {
	        this.connection = connection;
	    }

	    // Método para insertar un usuario en la base de datos
	    
	    public void insertUsuario(UsuarioProyecto usuario) throws SQLException {
	        String sql = "INSERT INTO TB_USUARIOLEMANS (nombre, apellidos, dni, sexo, contraseña, email, telefono, fecha_nacimiento) " +
	                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

	        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	            preparedStatement.setString(1, usuario.getNombre());
	            preparedStatement.setString(2, usuario.getApellidos());
	            preparedStatement.setString(3, usuario.getDni());
	            preparedStatement.setString(4, usuario.getSexo());
	            preparedStatement.setString(5, usuario.getContraseña());
	            preparedStatement.setString(6, usuario.getEmail());
	            preparedStatement.setInt(7, usuario.getTelefono());
	            preparedStatement.setString(8, usuario.getFechaNacimiento());

	            preparedStatement.executeUpdate();
	        }
	    }

	    // Método para obtener todos los usuarios de la base de datosç
	    
	    public List<UsuarioProyecto> getAllUsuarios() throws SQLException {
	        List<UsuarioProyecto> usuarios = new ArrayList<>();
	        String sql = "SELECT * FROM TB_USUARIOLEMANS";

	        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
	             ResultSet resultSet = preparedStatement.executeQuery()) {

	            while (resultSet.next()) {
	            	UsuarioProyecto usuario = new UsuarioProyecto();
	                usuario.setIdUsuario(resultSet.getInt("idUsuario"));
	                usuario.setNombre(resultSet.getString("nombre"));
	                usuario.setApellidos(resultSet.getString("apellidos"));
	                usuario.setDni(resultSet.getString("dni"));
	                usuario.setSexo(resultSet.getString("sexo"));
	                usuario.setContraseña(resultSet.getString("contraseña"));
	                usuario.setEmail(resultSet.getString("email"));
	                usuario.setTelefono(resultSet.getInt("telefono"));
	                usuario.setFechaNacimiento(resultSet.getString("fecha_nacimiento"));

	                usuarios.add(usuario);
	                
		            }
		        }

	        return usuarios;
	    }

	    public void update(UsuarioProyecto usuario) throws SQLException {
	        String sql = "UPDATE usuarios SET nombre=?, apellidos=?, dni=?, sexo=?, contraseña=?, " +
	                     "email=?, telefono=?, fecha_nacimiento=? WHERE idUsuario=?";

	        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	            preparedStatement.setString(1, usuario.getNombre());
	            preparedStatement.setString(2, usuario.getApellidos());
	            preparedStatement.setString(3, usuario.getDni());
	            preparedStatement.setString(4, usuario.getSexo());
	            preparedStatement.setString(5, usuario.getContraseña());
	            preparedStatement.setString(6, usuario.getEmail());
	            preparedStatement.setInt(7, usuario.getTelefono());
	            preparedStatement.setString(8, usuario.getFechaNacimiento());
	            preparedStatement.setInt(9, usuario.getIdUsuario());

	            preparedStatement.executeUpdate();
	        }
	    }

	    public void delete(int idUsuario) throws SQLException {
	        String sql = "DELETE FROM TB_USUARIOLEMANS WHERE idUsuario=?";

	        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	            preparedStatement.setInt(1, idUsuario);
	            preparedStatement.executeUpdate();
	        }
	    }

	    public List <UsuarioProyecto> getById(int idUsuario) throws SQLException {
	        String sql = "SELECT * FROM TB_USUARIOLEMANS WHERE idUsuario=?";
	        UsuarioProyecto usuario = null;

	        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	            preparedStatement.setInt(1, idUsuario);
	            try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                if (resultSet.next()) {
	                	
	                    usuario = new UsuarioProyecto();
	                    
	                    usuario.setIdUsuario(resultSet.getInt("idUsuario"));
	                    usuario.setNombre(resultSet.getString("nombre"));
	                    usuario.setApellidos(resultSet.getString("apellidos"));
	                    usuario.setDni(resultSet.getString("dni"));
	                    usuario.setSexo(resultSet.getString("sexo"));
	                    usuario.setContraseña(resultSet.getString("contraseña"));
	                    usuario.setEmail(resultSet.getString("email"));
	                    usuario.setTelefono(resultSet.getInt("telefono"));
	                    usuario.setFechaNacimiento(resultSet.getString("fecha_nacimiento"));
	                }
	            }
	        }
	        return (List<UsuarioProyecto>) usuario;
	    }
	 }
	

