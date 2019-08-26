package Modelo;
import java.util.ArrayList;

public class Sala {
	private int nButacas;
	private int numero;
	
	private ArrayList<Pelicula>peliculas;
	private ArrayList<ArrayList<Funcion>>funciones;
	
	public Sala(int butacas, int numero) {
		this.nButacas = butacas;
		this.numero = numero;
		funciones = new ArrayList<>();
	}
	
	public boolean addMovie(Pelicula p) {
		for(Pelicula a:peliculas)if(a==p) {
			System.out.println("La pelicula " + p.getNombre() +" ya se esta proyectando en la sala " + this.numero);
			return false;
		}
		
		peliculas.add(p);
		System.out.println("Pelicula " + p.getNombre() + " añadida a proyecciones de la sala " + this.numero);
		return true;
	}
	
	public boolean addFuncion(Pelicula p, String horario) {
		for(int i=0; i<this.peliculas.size(); i++) {
			if(this.peliculas.get(i) == p) {
				for(int j=0; j<this.funciones.size(); j++) {
					if(this.funciones.get(i).get(j).getHorario().equals(horario)) {
						System.out.println("La funcion ya existe.");
						return false;
					}
				}
				funciones.get(i).add(new Funcion(horario,p,this));
				System.out.println("Funcion agregada.");	
				break;
			}
		}
		return true;
	}

	public int getnButacas() {
		return this.nButacas;
	}

	public int getNumero() {
		return this.numero;
	}

	public ArrayList<Pelicula> getPeliculas() {
		return this.peliculas;
	}

	public ArrayList<ArrayList<Funcion>> getFunciones() {
		return this.funciones;
	}

	public void setnButacas(int nButacas) {
		this.nButacas = nButacas;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public void setFunciones(ArrayList<ArrayList<Funcion>> funciones) {
		this.funciones = funciones;
	}
	
	
}
