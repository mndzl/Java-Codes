/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.pojo.GradosTrabajo;
import model.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author mendez
 */
public class gradosTrabajoDao {
        public static List<GradosTrabajo> listar(){
        List<GradosTrabajo>grados = null;
        
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            
            String hql = "from GradosTrabajo";
            Query query = session.createQuery(hql);
            grados = query.list();
            session.close();
         
        }catch(HibernateException e){
            System.out.println("Error al conectar con Hibernate");
            e.printStackTrace();
        }
        return grados;
    }
}
