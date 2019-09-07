package Modelo;
import java.sql.*;
import javax.sql.*;

public class ConnectionProtocol {
	private Connection conn; 
	private String username;
	private String password;
	private String url;
	private static Statement stat;
	
	public ConnectionProtocol(String url, String username, String password){
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	private boolean startConnection() {
		try {
			this.conn = DriverManager.getConnection(this.url,this.username,this.password);
			stat = conn.createStatement();
			return true;
		}catch (Exception e){
			System.out.println(e);
			return false;
		}
	}
	
	public ResultSet getTable() {
		if(startConnection()) {
			try {
				ResultSet res = stat.executeQuery("SELECT * FROM PELICULAS");
				return res;
			}catch(Exception e) {
				System.out.println("Error al conectar con base de datos");
				System.out.println(e);
				return null;
			}
		}else return null;
	}
	public boolean addMovie(Pelicula pelicula) {
		if(startConnection()) {
			try {
				stat.executeUpdate("INSERT INTO `PELICULAS` (`NOMBRE`, `CLASIFICACION`, `DURACION`) VALUES ('" + pelicula.getNombre() + "', '" + pelicula.getClasificacion() + "', '" + pelicula.getDuracion() + "')");
				System.out.println("La pelicula \'" + pelicula.getNombre() + "\' ha sido añadida a la cartelera.");
				return true;
			}catch(Exception e) {
				System.out.println("La pelicula ya existe, no se han realizado cambios.");
				return false;
			}
		}else {
			System.out.println("Base de datos no conectada, accion no realizada.");
			return false;
		}
	}
		
		
	public boolean deleteMovie(String nombre) {
		try {
			stat.executeUpdate("DELETE FROM PELICULAS WHERE NOMBRE=\'"+ nombre + "\'");
			System.out.println("Se ha eliminado la película \'" + nombre + "\' de la cartelera.");
			return true;
		}catch(Exception e) {
			System.out.println("No se ha encontrado la película " + nombre + ": " + e);
			return false;
		}
	}
	
	
}
