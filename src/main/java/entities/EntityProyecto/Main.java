package entities.EntityProyecto;

import java.util.List;

import pojos.DaosProyecto.UsuarioProyectoDAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsuarioEntity user = new UsuarioEntity("dani", "tor", "1234", "Hombre", "1", "456789", "d@gmail.com", 6714325, "09/07/93", null);
		
		UsuarioProyectoDAO userdao = new UsuarioProyectoDAO();
		

	 UsuarioProyectoDAO dao = new UsuarioProyectoDAO();

     // Crear un nuevo usuario
     UsuarioEntity newUser = new UsuarioEntity();
     newUser.setNombre("Juan");
     newUser.setApellidos("Perez");
     // Añadir más campos según sea necesario...

     // Probar el método insertarUsuario
     dao.insertarUsuario(newUser);

     // Probar el método getAllUsuarios
     List<UsuarioEntity> allUsers = dao.getAllUsuarios();
     for (UsuarioEntity usuarios : allUsers) {
         System.out.println(usuarios.getNombre() + " " + usuarios.getApellidos());
     }

     // Probar el método update
     UsuarioEntity modifiedUser = new UsuarioEntity();
     modifiedUser.setNombre("Juanito");
     modifiedUser.setApellidos("Perez");
     // Añadir más campos según sea necesario...
     dao.update(newUser.getId(), modifiedUser);

     // Probar el método getUsuarioId
     UsuarioEntity fetchedUser = dao.getUsuarioId(newUser.getId());
     System.out.println(fetchedUser.getNombre() + " " + fetchedUser.getApellidos());

     // Probar el método borrarUsuarioPorNombre
     dao.borrarUsuarioPorNombre("Juanito");

     // Probar el método getUsuarioByName
     List<UsuarioEntity> usersByName = dao.getUsuarioByName("Juanito");
     for (UsuarioEntity usuario : usersByName) {
         System.out.println(usuario.getNombre() + " " + usuario.getApellidos());
     }
	}
}
