
package transacciones;
import java.util.Scanner;

public class Controller {
    public static Scanner scanner = new Scanner(System.in);
    public static char flag;
    // ArrayList<Usuario>usuarios = new ArrayList<>();
    
    public static void main(String[] args) {
        flag = 's';
        while(flag == 's'){
            int opcion;
            opcion = showMenu();

            switch(opcion){
                case 1: createUser();break;
                /*
                case 2: addElement();break;
                case 3: makeTransaction();break;
                case 4: viewCrosses();break;*/
                case 5: System.out.println("Gracias por usar nuestro gestor.");
            }
        }
    }
    public static void clean(){
        for(int i=0; i<15; i++)System.out.println("");
    }
    
    public static int verifyEntry(int opcion, int max){
        while(opcion>max || opcion<0){
            System.out.print("Opcion errónea, ingrese otra: "); opcion = scanner.nextInt();
        }
        return opcion;
    }
    
    public static void createUser(){
        String ID,IDis,IP,Doc,TC;

        clean();
        System.out.print("Ingrese el identificador de usuario: "); ID = scanner.next();
        System.out.print("Ingrese el identificador de dispositivo: "); IDis = scanner.next();
        System.out.print("Ingrese la dirección IP: "); IP = scanner.next();
        System.out.print("Ingrese el numero de documento: "); Doc = scanner.next();
        System.out.print("Ingrese el numero de tarjeta de crédito: "); TC = scanner.next();
        
        // usuarios.add(new Usuario(ID,IDis,IP,Doc,TC));
        System.out.println("Se ha creado una nueva cuenta.");
        System.out.println("Desea realizar otro movimiento? (s/n)"); flag = scanner.next().charAt(0);
        clean();
    }
    public static int showMenu(){
        int opcion;
        System.out.println("BIENVENIDO AL GESTOR DE TRANSACCIONES");

        System.out.println("\nCrear un usuario (1)");
        System.out.println("Añadir un elemento al usuario (2)");
        System.out.println("Realizar una transacción (3)");
        System.out.println("Ver cruces de operaciones (4)");
        System.out.println("Salir (5)");
        System.out.print("Opcion: "); opcion = scanner.nextInt();
        return verifyEntry(opcion,5);

    }
}
