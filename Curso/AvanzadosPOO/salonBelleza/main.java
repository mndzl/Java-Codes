/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonBelleza;
import java.time.LocalDate;
/**
 *
 * @author Alumno
 */
public class main {
    public static void main(String[] args){
        LocalDate a = LocalDate.now();
        Customer c = new Customer("Luna");
        
        Visit v = new Visit("Jose",a);
        v.setCustomer(c);
        
        v.setProductExpense(250);
        v.setServiceExpense(125);
        
        System.out.println("Sin membresia: " + v.getTotalExpense());
      
        c.setMemberType("Gold");
        System.out.println("Con membresia: " + v.getTotalExpense());
    }
}
