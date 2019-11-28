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
import org.hibernate.Transaction;
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

    
       public static void agregar(Empleados e){
           try{
               Session session = HibernateUtil.getSessionFactory().openSession();
               Transaction tx = session.beginTransaction();
               session.save(e);
               tx.commit();
           }catch(Exception ex){
               ex.printStackTrace();
           }
       }

    public static List editar(int id) {
       List datos = null;
       
       try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "from Empleados where ID="+id;
            Query query = session.createQuery(hql);
            datos = query.list();
            session.close();
       }catch(Exception ex){
          ex.printStackTrace();
       }
       
       return datos;
    }
    
}
