import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class test{
	public static void main(String args[]) {
		String options[] = {"Masculino","Femenino"};
		int seleccion = JOptionPane.showOptionDialog(null, "Defina su sexo", "Sexo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,options, options[0]);
		if(seleccion == 0)System.out.println("Hombre");
		else System.out.println("Mujer");
	}
}
