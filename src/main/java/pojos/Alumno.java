package pojos;

import java.util.Arrays;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String sex;
	private String [] asignaturas;
	private String descripcion;
	
	public Alumno(String nombre, String apellidos, String sex, String[] asignaturas, String descripcion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sex = sex;
		this.asignaturas = asignaturas;
		this.descripcion = descripcion;
	}
	public Alumno(String nombre, String apellidos, String sex, String[] asignaturas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sex = sex;
		this.asignaturas = asignaturas;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the asignaturas
	 */
	public String[] getAsignaturas() {
		return asignaturas;
	}
	/**
	 * @param asignaturas the asignaturas to set
	 */
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Alumno [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos + ", " : "") + (sex != null ? "sex=" + sex + ", " : "")
				+ (asignaturas != null ? "asignaturas=" + Arrays.toString(asignaturas) + ", " : "")
				+ (descripcion != null ? "descripcion=" + descripcion : "") + "]";
	}
	
	
	
}
