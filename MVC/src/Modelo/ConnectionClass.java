/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.ArrayList;
/**
 *
 * @author Alumno
 */
public class ConnectionClass {
    static ArrayList<PersonaVo> personas;
    ConnectionClass(){
        personas = new ArrayList<>();
        personas.add(new PersonaVo("Daniel",21,"4512312"));
        personas.add(new PersonaVo("Juan",20,"2341231"));
        personas.add(new PersonaVo("Andres",22,"123123"));
        personas.add(new PersonaVo("Julio",19,"3241232"));
        personas.add(new PersonaVo("Sebastian",16,"1231232"));
    }
    static void añadirPersona(PersonaVo persona){
        personas.add(persona);
    }
}
