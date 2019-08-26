package Controlador;
import Modelo.*;
import java.util.ArrayList;
import java.sql.*;
import javax.sql.*;

public class Main {

	public static void main(String[] args) {
		ConnectionProtocol conexion = new ConnectionProtocol("jdbc:mysql://localhost:3306/Cines","root","");
		
		ArrayList<String>peliculas = new ArrayList<>();
		ArrayList<String>clasificaciones = new ArrayList<>();
		ArrayList<String>duraciones = new ArrayList<>(); 
		
		ResultSet tabla = conexion.getTable();
		
		try {
			while(tabla.next()) {

				peliculas.add(tabla.getString("NOMBRE"));
				clasificaciones.add(tabla.getString("CLASIFICACION"));
				duraciones.add(tabla.getString("DURACION"));
			}
		
		}catch(Exception e){
			System.out.println("Hubo un error en la toma de datos.");
			System.out.println(e);
		}
	
		ArrayList<Pelicula>peliculasEnCartelera = new ArrayList<>();
		
		for(int i=0; i<peliculas.size(); i++) {
			peliculasEnCartelera.add( new Pelicula(peliculas.get(i),clasificaciones.get(i),duraciones.get(i)) );
		}
		
		
		
		
	}
	
}
