/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions2;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class DivisionNumero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1,n2;
        
        try{
            System.out.println("Ingrese n1: ");
            n1 = scanner.nextInt();
            System.out.println("Ingrese n2: ");
            n2 = scanner.nextInt();
            System.out.println("La division es: "+n1/n2);
        }catch(ArithmeticException e ){
            System.out.println("Division por cero.");
            e.printStackTrace();
        }catch(NumberFormatException e){
            System.out.println("Se han ingresado caracteres no numericos.");
            e.printStackTrace();
        }catch(Exception e){
            System.out.println("Hubo un error desconocido.");
            e.printStackTrace();
        }
    }

}
