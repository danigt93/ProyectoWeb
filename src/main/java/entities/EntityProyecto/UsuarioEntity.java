package entities.EntityProyecto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "TB_USUARIOLEMANS")

public class UsuarioEntity {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		
		@Column(length = 9, name = "DNI_USUARIO", unique = true, nullable = false)
		
		private String nombre;
		private String apellidos;
		private String dni;
		private String sexo;
		private String idUsuario;
		private String password;
		private String email;
		private int tlf;
		private String fechaNac;
		
		
	
		public UsuarioEntity(Long id, String nombre, String apellidos, String dni, String sexo, String idUsuario,
			String password, String email, int tlf, String fechaNac) {
			super();
			
			this.id = id;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.dni = dni;
			this.sexo = sexo;
			this.idUsuario = idUsuario;
			this.password = password;
			this.email = email;
			this.tlf = tlf;
			this.fechaNac = fechaNac;
		}



		public Long getId() {
			return id;
		}



		public void setId(Long id) {
			this.id = id;
		}



		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public String getApellidos() {
			return apellidos;
		}



		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}



		public String getDni() {
			return dni;
		}



		public void setDni(String dni) {
			this.dni = dni;
		}



		public String getSexo() {
			return sexo;
		}



		public void setSexo(String sexo) {
			this.sexo = sexo;
		}



		public String getIdUsuario() {
			return idUsuario;
		}



		public void setIdUsuario(String idUsuario) {
			this.idUsuario = idUsuario;
		}



		public String getPassword() {
			return password;
		}



		public void setPassword(String password) {
			this.password = password;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		public int getTlf() {
			return tlf;
		}



		public void setTlf(int tlf) {
			this.tlf = tlf;
		}



		public String getFechaNac() {
			return fechaNac;
		}



		public void setFechaNac(String fechaNac) {
			this.fechaNac = fechaNac;
		}



		@Override
		public String toString() {
			return "UsuarioEntity [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni
					+ ", sexo=" + sexo + ", idUsuario=" + idUsuario + ", password=" + password + ", email=" + email
					+ ", tlf=" + tlf + ", fechaNac=" + fechaNac + "]";
		}
		
		
	}
