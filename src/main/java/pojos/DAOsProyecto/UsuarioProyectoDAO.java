package pojos.DAOsProyecto;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import pojos.UsuariosProyecto.UsuarioNew;

public class UsuarioProyectoDAO {
	private static final Logger logger = LogManager.getLogger(UsuarioProyectoDAO.class);
	private static EntityManager em;

	public UsuarioProyectoDAO() {
		em = JpaUtil.getEM("hibernateMySQL");
	}
	
	public UsuarioProyectoDAO(String persitenceUnitName) {
		em = JpaUtil.getEM("hibernateMySQL");
	}
	
	
	public static void cargaInicial() {
		logger.debug("Empezando carga inicial de datos");

		UsuarioNew [] newUser = {};
		try {
			em.getTransaction().begin();
			for (UsuarioNew news : newUser) {
				UsuarioNew nuevos = new UsuarioNew(news.getNombre(), 
						news.getApellidos(), 
						news.getDni(),
						news.getSexo(),
						news.getIdUsuario(),
						news.getContraseña(),
						news.getEmail(),
						news.getTelefono(),
						news.getFechaNacimiento());
				em.persist(nuevos);
			}
			em.getTransaction().commit();

		} catch (Exception e) {
			logger.error("Error al insertar alumnos " + e.getMessage());
			em.getTransaction().rollback();
		}

		logger.debug("Termina");
	}

	public static List<UsuarioNew> listarAlumnos() {
		logger.debug("Listando alumnos");
		List<UsuarioNew> usuarios = em.createQuery("from Alumno", UsuarioNew.class).getResultList();
//		usuarios.forEach(usuarios -> logger.trace(usuarios));// Método Referencia

		logger.debug("Numero de usuarios" + usuarios.size());
		return usuarios;
	}

	public static UsuarioNew buscarPorId(Long id) {
		logger.debug("buscarPorId " + id);
		UsuarioNew usuario = em.find(UsuarioNew.class, id);

		logger.debug("Alumno encontrado " + usuario);
		return usuario;
	}

	public static UsuarioNew buscarPorDni(String dni) {
		logger.debug("buscarPorDni " + dni);
		Query query = em.createQuery("from Alumno a where a.dni=?1", UsuarioNew.class);
		query.setParameter(1, dni);

		UsuarioNew usuario = null;
		try {
			usuario = (UsuarioNew) query.getSingleResult();
		}catch(NoResultException nre) {
			logger.error("No se ha econtrado al usuario con Dni "+ dni);
		}
		
		return usuario;

	}

}
