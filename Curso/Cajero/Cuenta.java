package CuentaEjercicio;

public class Cuenta {
	private String titular;
	private double cantidad;
	
	//Constructores
	public Cuenta(String t, double c) {
		this.titular = t;
		this.cantidad = c;
		System.out.println("\nSe ha creado una nueva cuenta.");
	}
	public Cuenta(String t) {
		this.titular = t;
		this.cantidad = 0;
		System.out.println("\nSe ha creado una nueva cuenta.");
	}
	
	//Getters y Setters
	public String getTitular() {
		return this.titular;
	}
	public double getCantidad() {
		return this.cantidad;
	}
	public void setCantidad(double c) {
		this.cantidad=c;
	}
	public void setTitular(String t) {
		this.titular=t;
	}
	
	@Override
	public String toString() {
		return "Titular: " + titular + "\nCantidad: "+cantidad;
	}
	
	//Metodos
	public void ingresar(double c) {
		if(c>0)this.cantidad += c;
		System.out.println("Se ha ingresado "+c+" pesos a la cuenta.");
	}
	public void retirar(double c) {
		this.cantidad -= c;
		if(this.cantidad<0) {
			this.cantidad = 0;
		}
		System.out.println("Se ha retirado "+c+" pesos de la cuenta.");
	}
}
