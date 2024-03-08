package pojos.DaosProyecto;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import entities.EntityProyecto.UsuarioEntity;
import es.curso.java.ClasesProyecto.UsuarioProyecto;
import es.curso.java.hibernate.ejercicios.ejercicio1.entity.UserEntity;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;



public class UsuarioProyectoDAO{

	 private static final Logger logger = LogManager.getLogger(UsuarioProyectoDAO.class);
	
	    private EntityManager em ;

	    
	    public UsuarioProyectoDAO() {
			this.em = JpaUtil.getEM("hibernateMySQL");
		}
	    
	    // Método para insertar un usuario en la base de datos
	    
	    
	    public void insertarUsuario (UsuarioProyecto nuevoUsuario) {
			
	    	EntityTransaction et = em.getTransaction();
	    	
	    		et.begin();
			 try {
				 em.persist(nuevoUsuario);
				 
				et.commit();
				logger.info("Usuario insertado correctamente: " + nuevoUsuario.toString());
			 }catch(Exception e) {
				et.rollback();
				 logger.error("Error al insertar usuario: " + e.getMessage(), e);
			 }
		     
		}
	    

	    // Método para obtener todos los usuarios de la base de datosç
	    
	    public List<UsuarioEntity> getAllUsuarios(){
	    	
	    	em = JpaUtil.getEM("hibernateMySQL");
	    	
	    	List<UsuarioEntity> usuarios;
	    		
	    	usuarios = em.createQuery("from UsuarioEntity", UsuarioEntity.class)
	    			  .getResultList();
	    		
	    		return usuarios;
	    	}
	    

	    public void update(Long long1, UsuarioEntity userModified) {
	    		
	    		TypedQuery <UsuarioEntity> query = em.createQuery(
	    				"from UsuarioEntity where id=?1",
	    				UsuarioEntity.class);
	    		query.setParameter(1, long1);
	    		
	    		try {
	    			UsuarioEntity usuario = query.getSingleResult();
	    			em.getTransaction().begin();
	    			//user.setId(userModified.getId());
	    			usuario.setNombre(userModified.getNombre());
	    			usuario.setApellidos(userModified.getApellidos());

	    			em.merge(usuario);
	    			
	    			em.getTransaction().commit();
	    			logger.info("Usuario actualizado correctamente: " + userModified.toString());
	    			
	    		}catch (NoResultException nre) {
	    			System.out.println("Dni "+ long1 + " no encontrado");
	    			logger.warn("DNI " + long1 + " no encontrado");
	    		}catch (Exception e) {
	    			logger.error("Error al actualizar usuario: " + e.getMessage(), e); ''
	    			System.out.println(e.getMessage());
	    			e.printStackTrace();
	    			em.getTransaction().rollback();
	    		}
	    		
	    	}

	    public UsuarioEntity getUsuarioId(Long long1) {
	    	UsuarioEntity usuario = null;
	    	
	    	
    		TypedQuery <UsuarioEntity> query = em.createQuery(
    				"from UsuarioEntity where id=?1",
    				UsuarioEntity.class);
    		query.setParameter(1, long1);
    		
    		try {
    			usuario = query.getSingleResult();
   
    		}catch (NoResultException nre) {
    			System.out.println("ID "+ long1 + " no encontrado");
    		}catch (Exception e) {
    			System.out.println(e.getMessage());
    			e.printStackTrace();
    			em.getTransaction().rollback();
    		}
			return usuario;
    			
	    }
    			
	    public void borrarUsuarioPorNombre (String nombre) {
			 em.getTransaction().begin();
			 try {
				List<UsuarioEntity> usuarios = getUsuarioByName(nombre);
	            
	            for (UsuarioEntity userEntity : usuarios) {
	            	em.remove(userEntity);
				}
	            
	            em.getTransaction().commit();
			 }catch(Exception e) {
				 em.getTransaction().rollback();
			 }
		     
		} 
	    
	    
		    public List<UsuarioEntity> getUsuarioByName (String name){
				List<UsuarioEntity> usuarios;
				
				Query query = em.createQuery(
						"from UsuarioEntity ue where ue.nombre=?1", 
						UserEntity.class);
				
				query.setParameter(1, name);
				usuarios = query.getResultList();
				
				return usuarios;
			}
}
	

