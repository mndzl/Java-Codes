package TomaAsistencia;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;

public class Asistencia {

	public static void main(String[] args) {
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Asistencia","root","");
			Statement objetoStatement = conexion.createStatement();
			ResultSet query = objetoStatement.executeQuery("SELECT * FROM Sheet1");
			
			String nombre;
			int DNI;
			String curso;
			String cursoo = "111milProgramadores";
			String materia = "POO";
			String horario = "Noche";
			Presente presentesHoy = new Presente(cursoo,materia,horario);
			ArrayList<Persona>personas = new ArrayList<Persona>();
			
			while(query.next()) {
				nombre = query.getString("Nombre");
				DNI = query.getInt("DNI");
				curso = query.getString("Curso");
				Persona a = new Persona(nombre,DNI,curso);
				personas.add(a);
				
				int presencia = JOptionPane.showConfirmDialog(null, ("Presente "+a.getNombre()+"?"),"Presente",JOptionPane.YES_NO_OPTION);
				if(presencia == JOptionPane.YES_OPTION) {
					presentesHoy.addPresente(a);
				}else {
					a.añadirFalta();
				}
			}
		
			JOptionPane.showMessageDialog(null, "Se le mostrará la lista de presentes");
			JOptionPane.showMessageDialog(null, presentesHoy.mostrarPresentes());
			
		}catch(Exception e) {
			System.out.println("Operación no realizada.\n");
			e.printStackTrace();
		}
	}
}
