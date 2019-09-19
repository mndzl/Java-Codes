/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TanqueException;

/**
 *
 * @author Alumno
 */
public class main {
    public static void main(String[] args){
        try{
            Tanque tanqueNafta = new Tanque(2500,500);
            tanqueNafta.agregar(200);
            tanqueNafta.retirar(50000);
        }catch(TanqueVacioException | TanqueLlenoException e){
            e.printStackTrace();
        }
    }
}
