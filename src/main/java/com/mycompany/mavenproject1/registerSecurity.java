/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.conexion.Conexion;
import java.sql.ResultSet;

/**
 *
 * @author salvador
 */
public class registerSecurity {

    Conexion cn = new Conexion();
    private int id = 0;

    /**
     * Metodo para insertar registro en la base de datos
     *
     * @param user usuario
     * @param password contrasenia
     * @return true si la condicion se cumple
     */
    public boolean insertUser(String user, String password, String apellido, String correo) {
        return cn.ingresaUsuario("insert into usuario "
                + "(id,id_rol,id_direccion,correo,nombre,pass,telefono,status) values "
                + "(" + generaid() + "," + 2 + "," + 0 + ",'" + correo + "','" + user + "', '" + password + "'," + 0 + "," + 1 + ")");
    }

    public boolean correo(String correo) {

        return cn.select("select id from usuario where correo = '" + correo + "'");
    }

    private int generaid() {

        id = (int) (Math.random() * 999);
        String script = "select id from usuario where id=" + id;
        if (cn.select(script)) {
            id = (int) (id * (Math.random() * 999));
        }
        return id;
    }
}
