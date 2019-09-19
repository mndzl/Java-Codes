/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioProducto;
import java.time.LocalDate;
/**
 *
 * @author Alumno
 */
public class main {
    public static void main(String args[]){
        try{
        Producto a = new Producto("Manzana",LocalDate.parse("2011-12-21"));
        }catch(ProductoVencido e){
            e.printStackTrace();
        }
    }
}
