/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.conexion.Componentes;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
/**
 *
 * @author salvador
 */
@Named("appproducto")
@SessionScoped
public class producto implements Serializable{

    /**
     * @return the li
     */
    public List<Componentes> getLi() {
        return li;
    }

    /**
     * @param li the li to set
     */
    public void setLi(List<Componentes> li) {
        this.li = li;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
    public String submit() { 
        return "producto.xhtml";
    }
    
    public String carrito() { 
        return "compras.xhtml";
    }
    
    public void onLoad(){
        productoSecurity ps = new productoSecurity();
        li =  ps.getList(nombre);      
    }
    
    private String nombre;    
    private List<Componentes> li;
}
