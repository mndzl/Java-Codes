/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import model.dao.empleadosDAO;
import model.pojo.Empleados;
import org.hibernate.HibernateException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author mendez
 */

@Controller
public class EmpleadosController {
    private ModelAndView mv = new ModelAndView();
    private int id;
    
    
    @RequestMapping(value="empleados.htm")
    public ModelAndView listar(){
        try{
            List<Empleados>empleados = empleadosDAO.listar();
            mv.setViewName("empleados");
            mv.addObject("Empleados",empleados);
            return mv;
        }catch(Exception e){
            System.out.println("Hubo un error en el controlador");
            e.printStackTrace();
        }
        
        return null;
    }
    
    @RequestMapping(value="nuevoEmpleado.htm", method=RequestMethod.GET)
       public ModelAndView agregar(){

           mv.addObject(new Empleados());
           mv.setViewName("nuevoEmpleado");
           
        return mv;
    }
    
    @RequestMapping(value="nuevoEmpleado.htm",method=RequestMethod.POST)
    public ModelAndView agregar(Empleados e){
        ModelAndView mv = new ModelAndView("nuevoEmpleado");
        
        try{
            empleadosDAO.agregar(e);
        }catch(HibernateException h){
            System.out.println("Fallo en el controller");
            h.printStackTrace();
        }
        
        return new ModelAndView("redirect:/empleados.htm");

    }
    
    @RequestMapping(value="editarEmpleado.htm", method=RequestMethod.GET)
      public ModelAndView editar(HttpServletRequest req){
           id = Integer.parseInt(req.getParameter("id"));
           List datos = empleadosDAO.editar(id);
           mv.addObject("datos",datos);
           mv.setViewName("editarEmpleado");
           
        return mv;
    }
      
    @RequestMapping(value="editarEmpleado.htm",method=RequestMethod.POST)
    public ModelAndView editar(Empleados e){
        ModelAndView mv = new ModelAndView("editarEmpleado");
        
        try{
            empleadosDAO.editar(e);
        }catch(HibernateException h){
            System.out.println("Fallo en el controller");
            h.printStackTrace();
        }
        
        return new ModelAndView("redirect:/empleados.htm");
    }
    
      @RequestMapping("eliminar.htm")
      public ModelAndView eliminar(HttpServletRequest req){
           id = Integer.parseInt(req.getParameter("id"));
           empleadosDAO.eliminar(id);
           return new ModelAndView("redirect:/empleados.htm");
    }
    
}
