package pojos;

public class Mesa extends Muebles {

	private String estilo;
	
	
	public Mesa(String nombre, String precio, String estilo) {
		super("Mesa","Precio");
		this.estilo = estilo;
	}

	public String getEstilo() {
		return estilo;
	}


	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	@Override
	public String toString() {
		return "Mesa [estilo=" + estilo + "]";
	}


}
