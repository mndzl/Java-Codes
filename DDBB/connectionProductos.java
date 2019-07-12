package ConnectDDBB;

import java.sql.*; 

public class connectionProductos {

	public static void main(String[] args) {
		try {
			
			// 1. Establecer conexión con la base de datos "pruebasMySql" en el puerto 3306.
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebasMySql","root","");
			
			// 2. Creación del objeto Statement
			Statement objetoStatement = conexion.createStatement();
			
			// 3. Ejecución de consulta SQL
			ResultSet query = objetoStatement.executeQuery("SELECT * FROM PRODUCTOS");
			
			// 4. Recorrer el ResultSet (resultados de consulta SQL)
			while(query.next()) {
				System.out.println(query.getString("CÓDIGOARTÍCULO") + " " + query.getString("NOMBREARTÍCULO") + " " + query.getString("PRECIO"));
			}
			
		}catch(Exception e) {
			System.out.println("No se ha realizado la conexión correctamente.");
			e.printStackTrace();
			
		}

	}

}
