package entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "SOFA")
public class Sofa extends MuebleEntity {
	private String color;

	public Sofa () {
		
	}
	
	public Sofa(String nombre, double precio, String color) {
		super(nombre, precio);
		this.color = color;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
}
