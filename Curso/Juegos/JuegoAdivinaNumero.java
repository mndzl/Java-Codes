/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class JuegoAdivinaNumero extends Juego{
    Scanner scanner = new Scanner(System.in);
    private int nObjetivo;
    private int n;
    private int vidasActuales;
    private int record;
    private boolean hayVidas;
    JuegoAdivinaNumero(int maxVidas, int nObjetivo){
        super(maxVidas);
        this.nObjetivo = nObjetivo;
        this.vidasActuales = maxVidas;
    }
    @Override
    protected void juega(){
        ReiniciaPartida();
        while(hayVidas){
            System.out.print("Ingrese un numero del 1 al 10: ");
            n = scanner.nextInt();
            if(ValidaNumero(n)){
                if(this.nObjetivo == n){
                    System.out.println("Acertaste!!");
                    ActualizaRecord();
                    return;
                }else{
                    hayVidas = QuitaVida();
                }
            }else{
                System.out.println("Numero no vàlido.");
            }
        }
    }
    @Override
    protected boolean QuitaVida(){
        super.vidas -= 1;
        if(super.vidas>0){
            if(this.nObjetivo>n){
                System.out.println("Intentelo de nuevo, el numero es mayor.");
            }else{
                System.out.println("Intentelo de nuevo, el numero es menor.");
            }
            return true;
        }else{
            return false;
        }
    }
    
    void ActualizaRecord(){
        int nuevoRecord = super.vidas - vidasActuales;
        if(this.record>nuevoRecord)this.record = nuevoRecord;
    }
    
    boolean ValidaNumero(int n){
        return true;
    }
    
    void ReiniciaPartida(){
        this.hayVidas = true;
    }
}
