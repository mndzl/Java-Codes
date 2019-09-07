package Controlador;
import Modelo.*;
import java.util.ArrayList;
import java.sql.*;
import Vista.*;

public class Main {
	static ArrayList<Pelicula>peliculasEnCartelera;
	static ConnectionProtocol database = new ConnectionProtocol("jdbc:mysql://localhost:3306/Cines","root","");
	/*static PantallaPrincipal principal = new PantallaPrincipal();
	static AdminPrincipal adminPrincipal= new AdminPrincipal();
	static ClientePrincipal clientePrincipal = new ClientePrincipal();*/
	
	
	public static void main(String[] args) {
		// Updating Movies
			updateDatabase();
		// etc
		
			
	}
	
	
	
	
	
	
	
	
	
	private static void updateDatabase() {
		ArrayList<String>peliculas = new ArrayList<>();
		ArrayList<String>clasificaciones = new ArrayList<>();
		ArrayList<String>duraciones = new ArrayList<>(); 
		
		try {
			ResultSet tabla = database.getTable();	
			while(tabla.next()) {

				peliculas.add(tabla.getString("NOMBRE"));
				clasificaciones.add(tabla.getString("CLASIFICACION"));
				duraciones.add(tabla.getString("DURACION"));
			}
		
		}catch(Exception e){
			System.out.println("Hubo un error en la toma de datos.");
			System.out.println(e);
		}
	
		peliculasEnCartelera = new ArrayList<>();
		
		for(int i=0; i<peliculas.size(); i++) {
			peliculasEnCartelera.add( new Pelicula(peliculas.get(i),clasificaciones.get(i),duraciones.get(i)) );
		}
		
	}
	
}
