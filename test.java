public class test{
	public static void main(String args[]) {
		Personas arrayPersonas[] = new Personas[4];
		for(int i=0; i<4; i++){
			Personas persona = new Personas();
			arrayPersonas[i]=persona;
		}
		arrayPersonas[2].setNombre("Luis");
		System.out.println("Nombre: "+arrayPersonas[2].getNombre());
		}
}