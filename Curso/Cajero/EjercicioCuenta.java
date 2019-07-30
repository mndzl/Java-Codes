package CuentaEjercicio;
import java.util.Scanner;

public class EjercicioCuenta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cuenta nuevaCuenta;
		String titular;
		double cantidad;
		byte eleccion;
		boolean bandera=false;
		
		System.out.println("Bienvenido al gestor de cuentas.\n");
		System.out.print("Ingrese el nombre del titular: ");
		titular = scanner.next();
		System.out.print("\nSi desea ingresar una cantidad, presione 1. Caso contrario, presione 2: ");
		eleccion = scanner.nextByte();
		if(eleccion==1) {
			System.out.print("Ingrese la cantidad: ");
			cantidad = scanner.nextDouble();
			nuevaCuenta = new Cuenta(titular,cantidad);
		}else{
			if(eleccion != 2) {
				System.out.println("No se ha dado una cantidad. ");
			}
			nuevaCuenta = new Cuenta(titular);
			
		}

		eleccion = -1;
		System.out.print("\nSi desea realizar una transaccion, presione 1. Caso contrario, presione 2: ");
		eleccion = scanner.nextByte();
		
		if(eleccion == 1) {
			while(!bandera){
				do {
					System.out.println("\nSi desea ingresar una cantidad, ingrese 1");
					System.out.println("Si desea retirar una cantidad, ingrese 2");
					System.out.print("Opcion: ");
					eleccion = scanner.nextByte();
					if(eleccion == 1) {
						System.out.print("\nIngrese cantidad a ingresar: ");
						nuevaCuenta.ingresar(scanner.nextDouble());
					}else if(eleccion == 2) {
						System.out.print("\nIngrese cantidad a retirar: ");
						nuevaCuenta.retirar(scanner.nextDouble());
					}else {
						System.out.println("\nElección incorrecta.");
					}
				}while(eleccion != 1 && eleccion !=2);
				
				System.out.println("\nSi desea realizar otra transacción, ingrese 1.");
				System.out.println("Si desea terminar la transacción, ingrese 2.");
				System.out.print("Opcion: ");
				eleccion = scanner.nextByte();
				if(eleccion==2) {
					bandera = true;
				}
			}
		}
		System.out.println("Valores finales: ");
		System.out.println(nuevaCuenta);
		System.out.println("Gracias por usar nuestro servicio.");
	}
}
