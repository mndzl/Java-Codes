package TomaAsistencia;
import java.util.Scanner;
import java.util.ArrayList;

public class Asistencia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Persona[] personas = new Persona[5];

		personas[0] = new Persona("Daniel",21);
		personas[1] = new Persona("Dana",22);
		personas[2] = new Persona("Javier",17);
		personas[3] = new Persona("Rosalia",18);
		personas[4] = new Persona("Pedro",20);
		String curso = "111programadores";
		String materia = "POO";
		String horario = "Noche";
		
		System.out.println("Toma de asistencia\n");
		char pres;
		
		ArrayList<Persona>presentes = new ArrayList<Persona>();
		
		for(int i=0; i<5; i++) {
			System.out.print(personas[i].getNombre()+": ");
			pres = scanner.next().charAt(0);
			if(pres == 'p')presentes.add(personas[i]);
		}
		Presente listaHoy = new Presente(presentes,curso,materia,horario);
		
		System.out.println("\nAlumnos presentes: ");

		listaHoy.mostrarPresentes();
	}

}
