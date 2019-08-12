package EjercicioElectrodomésticos;

public class ElectroApp {
	public static void main(String[] args) {
		Electrodoméstico[] arreglo = new Electrodoméstico[10];
		arreglo[0] = new Lavarropas();
		arreglo[1] = new Lavarropas();
		arreglo[2] = new Televisión();
		arreglo[3] = new Televisión();
		arreglo[4] = new Lavarropas();
		arreglo[5] = new Televisión();
		arreglo[6] = new Lavarropas();
		arreglo[7] = new Televisión();
		arreglo[8] = new Lavarropas();
		arreglo[9] = new Lavarropas();
		
		float totalLavarropas = 0;
		float totalElectrodoméstico = 0;
		float totalTelevisión = 0;
		for(int i=0; i<10; i++) {
			System.out.println(arreglo[i].precioFinal());
			if(arreglo[i] instanceof Electrodoméstico) {
				totalElectrodoméstico+=arreglo[i].precioFinal();
			}else if((Lavarropas)arreglo[i] instanceof Lavarropas) {
				totalLavarropas+=arreglo[i].precioFinal();
			}else if((Televisión)arreglo[i] instanceof Televisión) {
				totalTelevisión+=arreglo[i].precioFinal();
			}
		}
		
		System.out.println("\nPrecios por electrodomésticos: \n");
		System.out.println("Electrodomésticos: "+totalElectrodoméstico);
		System.out.println("Lavarropas: "+totalLavarropas);
		System.out.print("Televisiones: "+totalTelevisión);
	}
}
