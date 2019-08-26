package Modelo;
import java.sql.*;
import javax.sql.*;

public class ConnectionProtocol {
	private Connection conn; 
	private String username;
	private String password;
	private String url;
	private Statement stat;
	private ResultSet tabla;
	private boolean connected;
	
	public ConnectionProtocol(String url, String username, String password){
		this.url = url;
		this.username = username;
		this.password = password;
		if(startConnection(url,username,password)) {
			System.out.println("Conexion con base de datos realizada correctamente.");
			connected = true;
		}else System.out.println("No se ha podido establecer una conexion con la base de datos");
			connected = false;
	}
	
	private boolean startConnection(String url,String username,String password) {
		try {
			this.conn = DriverManager.getConnection(url,username,password);
			stat = conn.createStatement();
			return true;
		}catch (Exception e){
			System.out.println(e);
			return false;
		}
	}
	
	public ResultSet getTable() {
		try {
			return stat.executeQuery("SELECT * FROM PELICULAS");
		}catch(Exception e) {
			System.out.println("Error al conectar con base de datos");
			System.out.println(e);
			return null;
		}
	}
	
}
