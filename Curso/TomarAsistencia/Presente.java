package TomaAsistencia;
import java.util.ArrayList;
import java.time.*;

public class Presente {
	LocalDate fecha;
	String curso;
	String materia;
	String horario;
	ArrayList <Persona> alumnosPresentes;
	
	Presente(ArrayList<Persona>presentes,String curso, String materia,String horario){
		this.curso = curso;
		this.materia = materia;
		this.fecha = LocalDate.now();
		this.alumnosPresentes = presentes;
		this.horario = horario;
	}
	public void mostrarPresentes() {
		for(Persona i:alumnosPresentes) {
			System.out.println(i.nombre);
		}
	}
}
