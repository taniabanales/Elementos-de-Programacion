/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;


public class Usuario {
    private Integer id;
    private String nombre;
    private String email;
    private String login;
    private String password;

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + ", login=" + login + ", password=" + password + '}';
    }

    public Usuario(Integer id, String nombre, String email, String login, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.login = login;
        this.password = password;
    }
    

    public Usuario(Integer id) {
        this.id = id;
    }
    

    public Usuario() {
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
