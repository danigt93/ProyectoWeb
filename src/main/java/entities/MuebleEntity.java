package entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DIS", discriminatorType=DiscriminatorType.STRING)
@Table(name="TB_MUEBLES")
public abstract class MuebleEntity {
	
	@Id
	@SequenceGenerator(name = "MUEBLEGEN", sequenceName = "MUEBLESEQ", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MUEBLEGEN")
	@Column(name = "ID", nullable = false, updatable = false)
    private long id;
	@Column(name="NOMBRE_MUEBLE" ,length = 15, nullable = false)
	private String nombre;
	private double precio;
	
	public MuebleEntity() {
		
	}
	
	public MuebleEntity(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
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
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Mueble [" + (nombre != null ? "nombre=" + nombre + ", " : "") + "precio=" + precio + "]";
	}
	
	
}