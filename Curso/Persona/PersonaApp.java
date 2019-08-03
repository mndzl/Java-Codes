package personaEjercicio;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PersonaApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Persona[] personas = new Persona[3];
		String options[] = {"Masculino","Femenino"};
		
		for(int i=0; i<3; i++) {
			String DNI = JOptionPane.showInputDialog(null,"Ingrese su DNI",("Persona "+(i+1)),JOptionPane.INFORMATION_MESSAGE);
			String nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre",("Persona "+(i+1)),JOptionPane.INFORMATION_MESSAGE);
			String apellido = JOptionPane.showInputDialog(null,"Ingrese su apellido",("Persona "+(i+1)),JOptionPane.INFORMATION_MESSAGE);
			byte edad = Byte.parseByte(JOptionPane.showInputDialog(null,"Ingrese su edad",("Persona "+(i+1)),JOptionPane.INFORMATION_MESSAGE));
			
			char sexo;
			int seleccion =	JOptionPane.showOptionDialog(null, "Seleccione su sexo", ("Persona "+(i+1)), JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null, options, options[0]);
			if(seleccion==0)sexo = 'M';
			else sexo = 'H';

			float peso = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese su peso",("Persona "+(i+1)),JOptionPane.INFORMATION_MESSAGE));
			float altura = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese su altura",("Persona "+(i+1)),JOptionPane.INFORMATION_MESSAGE));
			
			personas[i] = new Persona(DNI, nombre, apellido, edad, sexo, peso, altura);
			//switch(i) {
			//case 0:personas[i] = new Persona(DNI, nombre, apellido, edad, sexo, peso, altura);break;
			//case 1:personas[i] = new Persona(DNI, nombre, apellido, edad, sexo);break;
			//case 2:personas[i] = new Persona(DNI, nombre);break;
			//}
		}
	

		
		for(int i=0; i<3; i++) {
			switch(personas[i].calcularIMC()) {
				case -1:JOptionPane.showMessageDialog(null,(personas[i].getNombre()+" está por debajo de su peso ideal y es "+(personas[i].esMayorDeEdad()?"mayor de edad":"menor de edad")),"Resultado test IMC",JOptionPane.INFORMATION_MESSAGE);break;
				case 0:JOptionPane.showMessageDialog(null,(personas[i].getNombre()+" está en su peso ideal y es "+(personas[i].esMayorDeEdad()?"mayor de edad":"menor de edad")),"Resultado test IMC",JOptionPane.INFORMATION_MESSAGE);break;
				case 1:JOptionPane.showMessageDialog(null,(personas[i].getNombre()+" tiene sobrepeso y es "+(personas[i].esMayorDeEdad()?"mayor de edad":"menor de edad")),"Resultado test IMC",JOptionPane.INFORMATION_MESSAGE);break;
			}
		}

		for(int i=0; i<3; i++)
			JOptionPane.showMessageDialog(null,personas[i].toString(),"Información de persona "+(i+1),JOptionPane.INFORMATION_MESSAGE);
	}
}
