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
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String c="s"; int n=0;
        try{
            System.out.println("Ingrese la cadena: "); c = scanner.next();
            System.out.println("Ingrese el indice: "); n = scanner.nextInt();
            System.out.println(caracterEn(c,n));
        }catch(NotInRangeException r){
            System.out.println("El elemento " + n + " de la cadena no existe.");
        }catch(Exception e){
            System.out.println("Hubo un error desconocido.");
            e.printStackTrace();
        }
    }
    
    static char caracterEn(String cadena, int numero) throws NotInRangeException{
        if(numero<cadena.length() && numero>=0){
            return cadena.charAt(numero);
        }else throw new NotInRangeException();
    }
}
