package entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "LAMP")
public class Lampara extends MuebleEntity {
	private double potencia;

	public Lampara () {
		
	}
	
	public Lampara(String nombre, double precio, double potencia) {
		super(nombre, precio);
		this.potencia = potencia;
	}

	/**
	 * @return the potencia
	 */
	public double getPotencia() {
		return potencia;
	}

	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	
}