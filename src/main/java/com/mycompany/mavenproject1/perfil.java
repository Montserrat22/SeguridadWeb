package com.mycompany.mavenproject1;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("appPerfil")
@SessionScoped
public class perfil implements Serializable {

    register register1 = new register();
    prefilSecurity prefilSecurity1 = new prefilSecurity();
    private String contrasenia;
    private String nombre;
    private String correo;
    private String apellido;
    private int id_rol, id_direccion, telefono, status;

    public perfil() {
    }

    public register getRegister1() {
        return register1;
    }

    public void setRegister1(register register1) {
        this.register1 = register1;
    }

    public prefilSecurity getPrefilSecurity1() {
        return prefilSecurity1;
    }

    public void setPrefilSecurity1(prefilSecurity prefilSecurity1) {
        this.prefilSecurity1 = prefilSecurity1;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
    public void llena(String correo) {
        System.out.println("Llenando con "+correo);
        prefilSecurity1.llenaSec(correo);
          
    }
}
