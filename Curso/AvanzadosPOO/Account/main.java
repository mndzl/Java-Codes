/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author Alumno
 */
public class main {
    public static void main(String[] args){
        Account one = new Account("21" ,"Alejandro",20000);
        Account two = new Account("13", "Luis", 100220);
        one.transferTo(two, 5000);
        System.out.println("Balance one: " + one.getBalance());
        System.out.println("Balance two: " + two.getBalance());
    }
}
