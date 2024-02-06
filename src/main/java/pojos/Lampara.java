package pojos;

public class Lampara extends Muebles {

	private String potencia;
	
	
	public Lampara(String nombre, String precio, String potencia) {
		super("Lampara","Precio");
		this.potencia = potencia;
	}


	public String getPotencia() {
		return potencia;
	}


	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}


	@Override
	public String toString() {
		return "Muebles [potencia=" + potencia + "]";
	}
	
	
	
}
