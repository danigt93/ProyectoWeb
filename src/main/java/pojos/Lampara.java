package pojos;

public class Lampara extends Muebles {

	private double potencia;
	
	
	public Lampara(String nombre, double precio, double potencia) {
		super(nombre, precio);
		this.potencia = potencia;
	}


	public double getPotencia() {
		return potencia;
	}


	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}


	@Override
	public String toString() {
		return "Muebles [potencia=" + potencia + "]";
	}
	
	
	
}
