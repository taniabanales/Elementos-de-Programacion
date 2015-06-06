/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author T-107
 */
public class TestPojos {

   
    public static void main(String[] args) {
        System.out.print("Probaremos todas las operaciones SQL");
    //Primer paso para creal El Session Factory
        SessionFactory factory=HibernateUtilidades.getSessionFactory();
        
        //obtenemos la apertura actual
        Session sesion=factory.openSession();
        
        //creamos la transaccion
    Transaction tranza=sesion.beginTransaction();
   /*
    //hacer una transacccion
    Usuario u=new Usuario();
    u.setEmail("taniabanales@hotmail.com;");
    u.setNombre("Tania Banales");
    u.setLogin("java");
    u.setPassword("java123");
    sesion.save(u);
    tranza.commit();
    sesion.close();
    */
   
    /*Usuario u=new Usuario();
            u.setIdUsuario(1);
            u.setLogin("raton");
            u.setPassword("vaquero");
            u.setNombre("Tania");
            u.setEmail("tan@hotmail.com");
            sesion.update(u);
            tranza.commit();
            sesion.close();
            
     System.out.println("Se Actializo corecctamente");
            */
    
    //Select todo por id
   /* Usuario u=(Usuario) sesion.createCriteria(Usuario.class).add(Restrictions.idEq(1)).uniqueResult();
            */
    
    //Buscar todos los usuarios de la bas de datos
    
    List<Usuario> usuarios = sesion.createCriteria(Usuario.class).list();
            tranza.commit();
            sesion.close();
            for(Usuario u:usuarios){
       System.out.println("El usuario buscado tiene nombre:"+u.getNombre());
    }
    }
    
}
