/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alumno
 */
public class PersonaVo {
    private String nombre;
    private int edad;
    private String DNI;
    public PersonaVo(String nombre, int edad, String DNI){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    void setEdad(int edad){
        this.edad = edad;
    }
    void setDNI(String DNI){
        this.DNI = DNI;
    }
    String getNombre(){
        return this.nombre;
    }
    int getEdad(){
        return this.edad;
    }
    String getDNI(){
        return this.DNI;
    }
}
