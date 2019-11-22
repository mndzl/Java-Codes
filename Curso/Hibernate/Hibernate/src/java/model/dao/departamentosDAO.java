package model.dao;

import java.util.List;
import model.pojo.Departamentos;
import model.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mendez
 */
public class departamentosDAO {
        public static List<Departamentos> listar(){
        List<Departamentos>departamentos = null;
        
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            
            String hql = "from Departamentos";
            Query query = session.createQuery(hql);
            departamentos = query.list();
            session.close();
         
        }catch(HibernateException e){
            System.out.println("Error al conectar con Hibernate");
            e.printStackTrace();
        }
        return departamentos;
    }
}
