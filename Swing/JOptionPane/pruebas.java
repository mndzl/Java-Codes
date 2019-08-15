import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class test{
	public static void main(String args[]) {
		
		// MessageDialog
		JOptionPane.showMessageDialog(null, "Hello World", "Titulo",JOptionPane.INFORMATION_MESSAGE);
		
		// OptionDialog
		String options[] = {"Masculino","Femenino"};
		int seleccion = JOptionPane.showOptionDialog(null, "Defina su sexo", "Sexo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,options, options[0]);
		if(seleccion == 0)System.out.println("Hombre");
		else System.out.println("Mujer");
		
		// InputDialog
		String entrada;
		entrada = JOptionPane.showInputDialog("Ingrese su nombre");
		
		// ConfirmDialog
		int eleccion;
		eleccion = JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Titulo",JOptionPane.YES_NO_CANCEL_OPTION);
		
		
	}
}
