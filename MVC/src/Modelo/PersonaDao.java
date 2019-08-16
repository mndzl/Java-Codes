/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class PersonaDao {
    static ArrayList<PersonaVo> personas;
    PersonaDao(){
        personas = new ArrayList<>();
        personas = ConnectionClass.personas;
    }
    void registrarPersona(String nombre, int edad, String DNI){
        PersonaVo personaNueva;
        personaNueva = new PersonaVo(nombre,edad,DNI);
        Logica.validarRegistro(personaNueva);
    }
    PersonaVo buscarPersona(String DNI){
        for(PersonaVo p:personas){
            if(p.getDNI().equals(DNI)){
                return p;
            }
        }
        return null;
    }
    static void modificarPersona(PersonaVo persona){
        for(PersonaVo p:personas){
            if(p.getDNI().equals(persona.getDNI())){
                p.setNombre(persona.getNombre());
                p.setEdad(persona.getEdad());
            }
        }
    }
    static void eliminarPersona(String DNI){
        for(PersonaVo p:personas){
            if(p.getDNI().equals(DNI)){
                personas.remove(p);
            }
        }
    }
}
