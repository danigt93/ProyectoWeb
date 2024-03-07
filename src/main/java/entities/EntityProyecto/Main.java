package entities.EntityProyecto;

import pojos.DaosProyecto.UsuarioProyectoDAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsuarioEntity user = new UsuarioEntity("dani", "tor", "1234", "Hombre", "1", "456789", "d@gmail.com", 6714325, "09/07/93", null);
		
		UsuarioProyectoDAO userdao = new UsuarioProyectoDAO();
		
		userdao.insertarUsuario(user);
		
		
	}

}
