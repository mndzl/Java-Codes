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

/**
 *
 * @author mendez
 */

@Controller
public class EmpleadosController {
    ModelAndView mv = new ModelAndView();
    
    
    @RequestMapping(value="empleados.htm");
    public ModelAndView listar(){
        try{
            List<Empleados>empleados = empleadosDAO.listar();
            mv.setViewName("Empleados");
            mv.addObject("Empleados",empleados);
        }catch(Exception e){
            System.out.println("Hubo un error en el controlador");
            e.printStackTrace();
        }
        
        return mv;
    }
    
    
    
}
