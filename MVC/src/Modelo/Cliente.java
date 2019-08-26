package Modelo;

public class Cliente {
	private String nombre;
	private int edad;
	private int cantidadCompras;
	public Cliente(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return this.nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public int getCantidadCompras() {
		return this.cantidadCompras;
	}
	public void nuevaCompra() {
		this.cantidadCompras += 1;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
