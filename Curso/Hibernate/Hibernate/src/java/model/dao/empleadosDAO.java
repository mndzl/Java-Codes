/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;


import java.util.List;
import model.util.HibernateUtil;
import model.pojo.*;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author mendez
 */
public class empleadosDAO {
    public static List<Empleados> listar(){
        List<Empleados>empleados = null;
        
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            
            String hql = "from Empleados";
            Query query = session.createQuery(hql);
            empleados = query.list();
            session.close();
         
        }catch(HibernateException e){
            System.out.println("Error al conectar con Hibernate");
            e.printStackTrace();
        }
        return empleados;
    }
    
}
