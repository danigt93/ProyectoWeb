package pojos.UsuariosProyecto;


public class UsuarioNew {

	private String nombre;
	private String apellidos;
	private String dni;
	private String sexo;
	private String idUsuario;
	private String contraseña;
	private String email;
	private int telefono;
	private String fechaNacimiento;
	
	public UsuarioNew() {
		super();
	}
	
	
	public UsuarioNew(String nombre, String apellidos, String dni, String sexo, String idUsuario, String contraseña,
			String email, int telefono, String fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sexo = sexo;
		this.idUsuario = idUsuario;
		this.contraseña = contraseña;
		this.email = email;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
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


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	@Override
	public String toString() {
		return "UsuarioNew [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", sexo=" + sexo
				+ ", idUsuario=" + idUsuario + ", contraseña=" + contraseña + ", email=" + email + ", telefono="
				+ telefono + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
}
