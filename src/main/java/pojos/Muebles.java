package pojos;

public abstract class Muebles {

	private String nombre;
	private String precio;
	
	public Muebles(String nombre, String precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPrecio() {
		return precio;
	}


	public void setPrecio(String precio) {
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Muebles [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
}
