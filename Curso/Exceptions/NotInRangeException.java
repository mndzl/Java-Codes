/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions2;

/**
 *
 * @author Alumno
 */
public class NotInRangeException extends Exception{
    public NotInRangeException(){
        super("El numero ingresado es mayor a la longitud de la cadena.");
    }
}
