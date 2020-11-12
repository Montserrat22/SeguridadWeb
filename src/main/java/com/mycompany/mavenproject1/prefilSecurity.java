package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class prefilSecurity {
    Conexion cn = new Conexion();
    ResultSet resultSet;
     register register1 = new register();
        public void llenaSec(String correo) {
            try { resultSet=null;
            String script ="select * from usuario where correo = '"+correo+"'";
            resultSet = cn.selectReturn(script);
           
            if (resultSet != null) {
                System.out.println("Nombre: "+resultSet.getString("nombre"));                
                System.out.println("direccion "+resultSet.getInt("id_direccion"));
                                System.out.println("rol "+resultSet.getInt("id_rol"));

                register1.setNombre(resultSet.getString("nombre"));
                register1.setId_direccion(resultSet.getInt("id_direccion"));
                //register1.setTelefono(resultSet.getInt("telefono"));
                register1.setId_rol(resultSet.getInt("id_rol"));
               //System.out.println("Telefono"+resultSet.getInt("telefono")); 
            }else{
                System.out.println("Siiiii");
            }

        } catch (SQLException ex) {
            Logger.getLogger(perfil.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Cagada");
        }
            
        }
    
    
    
}
