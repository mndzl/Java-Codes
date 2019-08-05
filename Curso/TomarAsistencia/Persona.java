package TomaAsistencia;

public class Persona {
	String nombre;
	int edad;
	int legajo;
	static int ID=0;
	Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
		legajo=++ID;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
