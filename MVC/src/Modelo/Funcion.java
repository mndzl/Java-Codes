package Modelo;

public class Funcion{
	private String horario;
	private int ventas;
	private Pelicula proyectada;
	private Sala sala;
	
	public Funcion(String horario, Pelicula proyectada, Sala sala){
		this.horario = horario;
		this.proyectada = proyectada;
		this.sala = sala;
	}

	public String getHorario() {
		return this.horario;
	}

	public int getVentas() {
		return this.ventas;
	}

	public Pelicula getProyectada() {
		return this.proyectada;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public void setProyectada(Pelicula proyectada) {
		this.proyectada = proyectada;
	}
	
	public boolean comprarEntrada(Cliente c) {
		if(ventas+1>sala.getnButacas()) {
			System.out.println("Compra no realizada, sala llena.");
			return false;
		}
		if(this.proyectada.edadValida(c)) {
			ventas+=1;
			c.nuevaCompra();
			System.out.println("Compra realizada, sala " + sala.getNumero() + ".");
			return true;
		}else {
			return false;
		}
	}
		
	
}
