package pojos.DaosProyecto;

import java.util.List;

import entities.EntityProyecto.UsuarioEntity;
import es.curso.java.hibernate.ejercicios.ejercicio1.entity.UserEntity;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;



public class UsuarioProyectoDAO {

	    private EntityManager em ;

	    
	    public UsuarioProyectoDAO() {
			this.em = JpaUtil.getEM("hibernateMySQL");
		}
	    
	    // Método para insertar un usuario en la base de datos
	    
	    
	    public void insertarUsuario (UsuarioEntity user) {
			 em.getTransaction().begin();
			 try {
				 em.persist(user);
				 
				 em.getTransaction().commit();
			 }catch(Exception e) {
				 em.getTransaction().rollback();
			 }
		     
		}
	    

	    // Método para obtener todos los usuarios de la base de datosç
	    
	    public List<UsuarioEntity> getAllUsuarios(){
	        
	    	List<UsuarioEntity> usuarios;
	    		
	    	usuarios = em.createQuery("from UsuarioEntity", UsuarioEntity.class)
	    			  .getResultList();
	    		
	    		return usuarios;
	    	}
	    

	    public void update(String id, UsuarioEntity userModified) {
	    		
	    		TypedQuery <UsuarioEntity> query = em.createQuery(
	    				"from UsuarioEntity where id=?1",
	    				UsuarioEntity.class);
	    		query.setParameter(1, id);
	    		
	    		try {
	    			UsuarioEntity usuario = query.getSingleResult();
	    			em.getTransaction().begin();
	    			//user.setId(userModified.getId());
	    			usuario.setNombre(userModified.getNombre());
	    			usuario.setApellidos(userModified.getApellidos());

	    			em.merge(usuario);
	    			
	    			em.getTransaction().commit();
	    			
	    		}catch (NoResultException nre) {
	    			System.out.println("Dni "+ id + " no encontrado");
	    		}catch (Exception e) {
	    			System.out.println(e.getMessage());
	    			e.printStackTrace();
	    			em.getTransaction().rollback();
	    		}
	    		
	    	}

	    public UsuarioEntity getUsuarioId(String id) {
	    	UsuarioEntity usuario = null;
	    	
	    	
    		TypedQuery <UsuarioEntity> query = em.createQuery(
    				"from UsuarioEntity where id=?1",
    				UsuarioEntity.class);
    		query.setParameter(1, id);
    		
    		try {
    			usuario = query.getSingleResult();
   
    		}catch (NoResultException nre) {
    			System.out.println("ID "+ id + " no encontrado");
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
	

