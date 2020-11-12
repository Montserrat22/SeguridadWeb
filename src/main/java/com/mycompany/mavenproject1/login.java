/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import com.mycompany.mavenproject1.perfil;
/**
 *
 * @author salvador
 */
@Named("applogin")
@SessionScoped
public class login implements Serializable {

    private String username;
    private String tag = "Ingresar";
    private String invalid = "btn-outline-primary";
    private String password;
    private String bol = "true";
    perfil perfil1 = new perfil();
   
    /**
     * @return the bol
     */
    public String getBol() {
        return bol;
    }

    /**
     * @param bol the bol to set
     */
    public void setBol(String bol) {
        this.bol = bol;
    }

    /**
     * @return the invalid
     */
    public String getInvalid() {
        return invalid;
    }

    /**
     * @param invalid the invalid to set
     */
    public void setInvalid(String invalid) {
        this.invalid = invalid;
    }

    /**
     * @return the tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * @param tag the tag to set
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * @return the userName
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the userName to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String logeo() {

        loginSecurity po = new loginSecurity();

        System.out.println("hola");

        if(username.equals("")||password==""||(username==""&&password=="")){
            tag = "Campos vacios";
            invalid = "btn-outline-danger";
            username = "";
            password = "";
            return "index.xhtml";
        }else{
            if (!po.valitedUP(username, password)) {
            tag = "Usuario o contraseña incorrecta";
            invalid = "btn-outline-danger";
            username = "";
            password = "";
        } else {
            return "start.xhtml";
        }
        return "index.xhtml";
        }
        
    }

    public String reg() {
        return "register.xhtml";
    }
   
}
