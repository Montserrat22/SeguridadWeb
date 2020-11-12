/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;

/**
 *
 * @author salvador
 */
public class Conexion {
    
    Connection cn = null;
    String pass= "123456";
    String user = "irving";
    
    public Conexion(){
        
    }
    
    public void conectarse(){
        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("conectarse");
            cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/web", user, pass);
            System.out.println("Conexion exitosa");
        }catch(SQLException ex){
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean ingresaUsuario(String script){
        PreparedStatement p = null;
        conectarse();
        try{
            p = cn.prepareStatement(script);
            p.executeUpdate();
            return true;
        }catch(Exception ex){
            System.out.println(ex);
        }
        return false;
    }
    
    public boolean select (String script){
        Statement p = null;
        boolean ban = false;
        conectarse();
        try{
            p = cn.createStatement();
            ResultSet result = p.executeQuery(script);
            
            while (result.next()) {
                ban = true;
            }

            result.close();
            p.close();
            cn.close();

            return ban;
            
        }catch(SQLException ex){
            System.out.println(ex);
        }  
        return false;
    }
    public ResultSet selectReturn(String script){
        ResultSet resultSet=null;
        Statement p=null;
        conectarse();
        try{
            p=cn.createStatement();
            resultSet = p.executeQuery(script);
            if(resultSet.next()){
                System.out.println("Tiene");
            }else{
                System.out.println("No tiene");
            }
            return resultSet;
        }catch(Exception e){
            System.out.println("Exepcion: "+e.toString());
            return resultSet;
        }
    }
}
