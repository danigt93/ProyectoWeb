package entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "MESA")
public class Mesa extends MuebleEntity {
	
	private String estilo;

	public Mesa() {
		
	}
	
	public Mesa(String nombre, double precio, String estilo) {
		super(nombre, precio);
		this.estilo = estilo;
	}

	/**
	 * @return the estilo
	 */
	public String getEstilo() {
		return estilo;
	}

	/**
	 * @param estilo the estilo to set
	 */
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	
}
