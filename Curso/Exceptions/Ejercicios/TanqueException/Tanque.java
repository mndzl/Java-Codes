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
public class Tanque {
    int capacidad;
    int carga;
    public Tanque(int capacidad, int carga)throws TanqueLlenoException{
        this.capacidad = capacidad;
        this.carga = 0;
        this.agregar(carga);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCarga() {
        return carga;
    }

    public void agregar(int carga) throws TanqueLlenoException{
        int a = this.carga + carga;
        if(a>this.capacidad)throw new TanqueLlenoException("No se le puede cargar mas al tanque.");
        else this.carga += carga;
    }
    public void retirar(int carga)throws TanqueVacioException{
        int a = this.carga - carga;
        if(a<0)throw new TanqueVacioException("El tanque está vacio.");
        else this.carga -= carga;
    }
    
    
}
