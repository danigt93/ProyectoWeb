package entities.EntityProyecto;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "TB_USUARIOLEMANS")

public class RolEntity {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idRol;

	    private String nombre;

	    @ManyToMany(mappedBy = "roles")
	    private Set<UsuarioEntity> usuarios;

	    
	    
		public Long getIdRol() {
			return idRol;
		}

		public void setIdRol(Long idRol) {
			this.idRol = idRol;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Set<UsuarioEntity> getUsuarios() {
			return usuarios;
		}

		public void setUsuarios(Set<UsuarioEntity> usuarios) {
			this.usuarios = usuarios;
		}
	    
	    
	}

