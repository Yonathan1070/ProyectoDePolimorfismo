/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercico4;

import java.util.HashMap;

/**
 *
 * @author Juan Daniel Fetecua
 * @author Yonathan Camilo Bohorquez
 */
public class Persona {
    
    private Integer id;
    private String nombre;
    private String apellido;
    private HashMap <Integer,Persona> familia;

    public Persona(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        familia=new HashMap<>();
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public HashMap<Integer, Persona> getFamilia() {
        return familia;
    }

    public void setFamilia(HashMap<Integer, Persona> familia) {
        this.familia = familia;
    }
    
    
    
}
