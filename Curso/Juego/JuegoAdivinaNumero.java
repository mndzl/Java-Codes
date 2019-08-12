/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

public abstract class JuegoAdivinaNumero extends Juego{

    protected int n;
    private int nUsuario;
    private int record;
    JuegoAdivinaNumero(int vidas, int n){
        super.vidas = vidas;
        this.n = n;
    }
    
    @Override
    void juega(){
        System.out.print("Adivine un numero del 1 al 10: ");
        nUsuario = scanner.nextInt();
        if(nUsuario==n){
            System.out.println("Acertaste!!");
            ActualizaRecord(nUsuario); //This
            return;
        }else{
            if(QuitaVida()){ //Heredado Boolean
                if(nUsuario>n){
                    System.out.println("El numero a adivinar es menor, intentelo de nuevo.");
                }else{
                    System.out.println("El numero a adivinar es mayor, intentelo de nuevo. ");
                }
            }else return;
        }
    }
   void ActualizaRecord(int record){
           
    }    
}
