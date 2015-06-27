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
 * @author TANIA
 */
public class DAOUsuario {

    static SessionFactory factory;
    static Session session;
    static Transaction tranza;

    public static void abrirSesion() {
        factory = HibernateUtilidades.getSessionFactory();
        session = factory.openSession();
        tranza = session.beginTransaction();
    }
   // public static void abrirTodo(){

    public static void cerrarTodo() {
        tranza.commit();
        session.close();

    }

    public DAOUsuario() {

    }

    //Creamos el insert 

    public void guardar(Usuario u) throws Exception {
        //Pner el codigo de guardado
        //Save Hibernate
        //Despues de terminar invocar el método cerrarTodo
        abrirSesion();
        session.save(u);
        cerrarTodo();

    }

    //Creamos el update

    public void actualizar(Usuario u) throws Exception {
        abrirSesion();
        session.update(u);
        cerrarTodo();
    }

    //Creamos el buscarTodos

    public List<Usuario> buscarTodos() throws Exception {
        /* List<Usuario>usuarios=session.createCriteria(Usuario.class).list();
         cerrarTodo();
        
         for(Usuario usu:usuarios){
         System.out*/
        abrirSesion();
        List<Usuario> usuarios = session.createCriteria(Usuario.class).list();
        return usuarios;

    }

    //Creamos el buscar por ID
    public Usuario buscarPorId(Integer Id) throws Exception {
        Usuario u = (Usuario) session.createCriteria(Usuario.class).add(Restrictions.idEq(1)).uniqueResult();
        cerrarTodo();
        System.out.println("El usuario buscado tiene el nombre:" + u.getNombre());

        return null;
    }

    //Creamos el autenticar

    public boolean autenticar(Usuario u) throws Exception {
        boolean autenticado = false;

        List<Usuario> usuarios = session.createCriteria(Usuario.class).list();
        cerrarTodo();
        for (Usuario usu : usuarios) {
            if (u.getLogin().equals(usu.getLogin()) && u.getPassword().equals(usu.getPassword())) {
                autenticado = true;
            }
        }
        return false;
    }
}
