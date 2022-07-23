/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author danyj
 */
public class Conexion {
     
String url = "C:\\Users\\danyj\\OneDrive\\Documentos\\NetBeansProjects\\SoftwareFactura\\BD\\BD_SoftwareFactura.db";
Connection connect;

public void conectar(){
 try {
     connect = DriverManager.getConnection("jdbc:sqlite:"+url);
     if (connect!=null) {
         System.out.println("Conectado");
     }
 }catch (SQLException ex) {
     System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
 }
}
 public void cerrar(){
        try {
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    public Connection Conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}