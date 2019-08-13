/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author Alumno
 */
abstract public class Juego {
    protected int vidas;
    abstract protected void juega();
    abstract protected boolean QuitaVida();
    
    Juego(int vidas){
        this.vidas = vidas;
    }
    
}
