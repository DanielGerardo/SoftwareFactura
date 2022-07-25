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
Connection connect = null;

public Connection conectar(){
 try {
     Class.forName("org.sqlite.JDBC");
     connect = DriverManager.getConnection("jdbc:sqlite:"+url);
    
 }catch (Exception ex) {
     System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
 }
 return connect;
}
    
}