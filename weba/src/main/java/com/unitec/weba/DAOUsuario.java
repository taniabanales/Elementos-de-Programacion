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

/**
 *
 * @author TANIA
 */
public class DAOUsuario {
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    
   // public static void abrirTodo(){
   static{
        factory= HibernateUtilidades .getSessionFactory();
        session= factory.openSession();
        tranza=session.beginTransaction();
    }
    
    public static void cerrarTodo(){
        tranza.commit ();
        session.close();
        
    }
    public DAOUsuario(){
        
    }
   //Creamos el insert 
    public void guardar(Usuario u)throws Exception{
        //Pner el codigo de guardado
        //Save Hibernate
        //Despues de terminar invocar el método cerrarTodo
        
        session.save(u);
        cerrarTodo();
        
    }
    //Creamos el update
    public void axtualizar (Usuario u)throws Exception{
        
    }
    //Creamos el buscarTodos
    public List<Usuario>buscarTodos () throws Exception{
        return null;
    }
    
   //Creamos el buscar por ID
    public Usuario buscarPorId(Integer Id)throws Exception{
        return null;
    }
    //Creamos el autenticar
    public boolean autenticar (Usuario u)throws Exception{
        return false;
    }
}
