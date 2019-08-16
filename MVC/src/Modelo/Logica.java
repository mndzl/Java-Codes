/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Controlador.*;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class Logica {
    Coordinador coordinador;
    ArrayList<PersonaVo> personas;
    Logica(Coordinador cord){
        this.coordinador = cord;
        personas = new ArrayList<>();
        personas = ConnectionClass.personas;
    }
    void setCoordinador(Coordinador cord){
        this.coordinador = cord;
    }
    static void validarRegistro(PersonaVo persona){
        if(persona.getEdad()<100){
            ConnectionClass.añadirPersona(persona);
        }
    }
    void validarModificacion(PersonaVo persona){
        if(persona.getEdad()<100){
            for(PersonaVo p:personas){
                if(p.getDNI().equals(persona.getDNI())){
                    PersonaDao.modificarPersona(p);
                }
            }
        }
    }
    void validarEliminacion(PersonaVo persona){
        PersonaDao.eliminarPersona(persona.getDNI());
    }
}
