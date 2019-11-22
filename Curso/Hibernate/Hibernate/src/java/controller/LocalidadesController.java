package controller;

import java.util.List;
import model.dao.localidadesDAO;
import model.pojo.Localidades;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mendez
 */

@Controller
public class LocalidadesController {
        ModelAndView mv = new ModelAndView();
    
    
    @RequestMapping(value="localidades.htm")
    public ModelAndView listar(){
        try{
            List<Localidades>localidades = localidadesDAO.listar();
            mv.setViewName("Localidades");
            mv.addObject("Localidades",localidades);
        }catch(Exception e){
            System.out.println("Hubo un error en el controlador");
            e.printStackTrace();
        }
        
        return mv;
    }
}
