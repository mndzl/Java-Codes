/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.dao.departamentosDAO;
import model.pojo.Departamentos;
import model.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author mendez
 */
public class DepartamentosController {
    ModelAndView mv = new ModelAndView();
    
    @RequestMapping(value="departamentos.htm")
    public ModelAndView listar(){
        try{
            List<Departamentos>departamentos = departamentosDAO.listar();
            mv.setViewName("departamentos.htm");
            mv.addObject("departamentos",departamentos);
            
            return mv;
        }catch(HibernateException h){
            h.printStackTrace();
        }
        
        return null;
    }
}
