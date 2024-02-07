package pojos;

public class Sofa extends Muebles{

	private String color;
	
	
	public Sofa(String nombre, double precio, String color) {
		super(nombre, precio);
		this.color = color;
	}

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	
	@Override
	public String toString() {
		return "Muebles [color=" + color + "]";
	}
	
	
	
}
