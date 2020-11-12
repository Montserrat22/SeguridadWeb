/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.conexion.Conexion;


public class loginSecurity {
    
    Conexion cn = new Conexion();
    
    public boolean valitedUP(String user, String password){
        return cn.select("select * from public.\"usuario\" where correo = '"+user+"' and pass = '"+password+"';");
    }
   
}
