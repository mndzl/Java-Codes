/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import model.dao.empleadosDAO;
import model.pojo.Empleados;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mendez
 */

@Controller
public class EmpleadosController {
    ModelAndView mv = new ModelAndView();
    
    
    @RequestMapping(value="empleados.htm")
    public ModelAndView listar(){
        try{
            List<Empleados>empleados = empleadosDAO.listar();
            mv.setViewName("empleados");
            mv.addObject("Empleados",empleados);
        }catch(Exception e){
            System.out.println("Hubo un error en el controlador");
            e.printStackTrace();
        }
        
        return mv;
    }
    
    @RequestMapping(value="nuevoEmpleado.htm", method=RequestMethod.GET)
       public ModelAndView agregar(){
           mv.addObject(new Empleado());
           mv.setViewName("nuevoEmpleado");
        
        return mv;
    }
    
    @RequestMapping(value="nuevaNoticia.htm",method=RequestMethod.POST)
    public ModelAndView agregar(Empleado n){
        ModelAndView mv = new ModelAndView("nuevaNoticia");
        
        try{
            EmpleadosDAO.agregar(n);
            return mv;
        }catch(Exception e){
            e.printStackTrace();   
        }
        
        return new ModelAndView("redirect:/empleados.htm");
    }
    
    
}
