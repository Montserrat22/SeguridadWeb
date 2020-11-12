/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author salvador
 */
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("appregister")
@SessionScoped
public class register implements Serializable {

    private String contrasenia;
    private String nombre;
    private String correo;
    private String apellido;
    private int id_rol, id_direccion, telefono, status;

    private String tag = "Registrar";
    private String invalid = "btn-outline-primary";

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

    /**
     * @return the tag
     */
    public void setStatus(int status) {
        this.status = status;
    }

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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
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

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void inserta() {

        registerSecurity re = new registerSecurity();
        if (nombre.equals("") || contrasenia.equals("") || apellido.equals("") || correo.equals("")) {
            tag = "Campos vacios";
            invalid = "btn-outline-danger";
        } else {
            if (re.correo(correo.trim())) {
                System.out.println("Ya hay un correo igual");
                tag = "Correo ya existente";
                invalid = "btn-outline-danger";
            } else {
                if (!re.insertUser(nombre, contrasenia, apellido, correo)) {
                    tag = "Datos incorrectos";
                    invalid = "btn-outline-danger";
                } else {
                    tag = "Datos ingresados";
                    invalid = "btn-outline-success";
                }

            }
        }/*
         */

    }

}
