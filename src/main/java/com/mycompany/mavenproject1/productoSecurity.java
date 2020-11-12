/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.conexion.Componentes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author salvador
 */
public class productoSecurity {
    
    
    public List<Componentes> getList(String producto){
        
        List<Componentes> lista = new ArrayList<Componentes>();
        
        switch(producto){
            case "RAM":
               lista.add(new Componentes("2GB", "150", false, "hyperX", "RAM"));
               lista.add(new Componentes("8GB", "500", false, "hyperX", "RAM"));
               lista.add(new Componentes("8GB", "400", true, "Fury", "RAM"));
               lista.add(new Componentes("2GB", "100", true, "Fury", "RAM"));
               lista.add(new Componentes("4GB", "250", true, "hyperX", "RAM"));
               lista.add(new Componentes("4GB", "200", false, "Fury", "RAM"));
            break;
            case "Discos duros":
               lista.add(new Componentes("1T", "1500", false, "ADATA", "Discos duros"));
               lista.add(new Componentes("500GB", "800", false, "ADATA", "Discos duros"));
               lista.add(new Componentes("2T", "1800", true, "WD", "Discos duros"));
               lista.add(new Componentes("1T", "1000", true, "WD", "Discos duros"));
               lista.add(new Componentes("250GB", "500", true, "KAPERSKY", "Discos duros"));
               lista.add(new Componentes("1T", "1200", true, "KAPERSKY", "Discos duros"));
            break;
            case "Procesador":
               lista.add(new Componentes("Corei3", "2500", false, "CORE", "Procesador"));
               lista.add(new Componentes("RAYZEN3", "1800", false, "RAYZEN", "Procesador"));
               lista.add(new Componentes("Corei5", "5000", true, "CORE", "Procesador"));
               lista.add(new Componentes("Corei7", "7000", true, "CORE", "Procesador"));
               lista.add(new Componentes("RAYZEN5", "4000", true, "RAYZEN", "Procesador"));
               lista.add(new Componentes("RAYZEN7", "5900", true, "RAYZEN", "Procesador"));
            break;
        }
        return lista;
    }
    
}
