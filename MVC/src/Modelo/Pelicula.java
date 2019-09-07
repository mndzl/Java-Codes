package Modelo;

public class Pelicula {
	private String nombre;
	private String clasificacion;
	private String duracion;
	private double preciothis;
	public static double precio = 200;
	
	public Pelicula(String nombre, String clasificacion, String duracion) {
		this.nombre = nombre;
		this.clasificacion = clasificacion;
		this.duracion = duracion;
		preciothis = precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String getClasificacion() {
		return this.clasificacion;
	}
	public String getDuracion() {
		return this.duracion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public void setPrecio(int precio) {
		this.preciothis = precio;
	}
	public double getPrecio() {
		return this.preciothis;
	}
	
	public boolean edadValida(Cliente c) {
		if(this.clasificacion.equalsIgnoreCase("JUVENIL")) {
			if(c.getEdad()<16) {
				System.out.println("La pelicula es para mayores de 16 años.");
				return false;
			}
		}
		if(this.clasificacion.equalsIgnoreCase("ADULTOS")) {
			if(c.getEdad()<18) {
				System.out.println("La pelicula es para mayores de 18 años.");
				return false;
			}
		}
		return true;
	}
}
