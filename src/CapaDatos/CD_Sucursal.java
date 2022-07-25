/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import Entidad.EN_Sucursal;
import Modelos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;








/**
 *
 * @author danyj
 */
public class CD_Sucursal {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion con = new Conexion();
        Connection acceso;
        int rr = 0;
    public Object[] Listar(){
               
        Object[] Sucursal = null;
        try {
            acceso = con.conectar();
            String sql = "SELECT * FROM Sucursal";
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();           
            while (rs.next()) {               
                Sucursal = new Object[7];
                Sucursal[0] = rs.getInt("IdSucursal");
                Sucursal[1] = rs.getString("RazonSocial");
                Sucursal[2] = rs.getString("RFC");
                Sucursal[3] = rs.getString("Domicilio");
                Sucursal[4] = rs.getInt("CP");                              
                Sucursal[5] = rs.getBytes("Logo");
                Sucursal[6] = rs.getString("FechaRegistro");
            }
            rs.close();
           
        } catch (SQLException e) {   
            System.out.println(e);
            Sucursal = new Object[7];      
        }       
        return Sucursal;  
    }
    
    public void Registrar(EN_Sucursal sucursal) {
        String sql = "INSERT INTO Sucursal (RazonSocial,RFC,Domicilio,CP,Logo,FechaRegistro) Values (?,?,?,?,?,date('now'))";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ps.setString(1, sucursal.getRazonSocial());
            ps.setString(2, sucursal.getRFC());
            ps.setString(3, sucursal.getDomicilio());
            ps.setInt(4, sucursal.getCP());
            ps.setBytes(5, sucursal.getLogo());            
            rr = ps.executeUpdate();
            if(rr>0){
            JOptionPane.showMessageDialog(null, "Se registro con exito!");
            }
                            
        } catch (SQLException e) {
            System.out.println("Error de conexion");
            JOptionPane.showMessageDialog(null, "Error de conexion" + e);
        }        
    }

   
    public void Actualizar(EN_Sucursal sucursal) {
     
       String sql = "UPDATE Sucursal SET RazonSocial=?, RFC=?, Domicilio=?, CP=?, Logo=?, FechaRegistro=date('now')"
               + " WHERE Id_Sucursal=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ps.setString(1, sucursal.getRazonSocial());
            ps.setString(2, sucursal.getRFC());
            ps.setString(3, sucursal.getDomicilio());
            ps.setInt(4, sucursal.getCP());
            ps.setBytes(5, sucursal.getLogo());            
            ps.setInt(6, sucursal.getIdSucursal());
            rr = ps.executeUpdate();
            if(rr>0){
            JOptionPane.showMessageDialog(null, "Se actualizo con exito!");
            }
                            
        } catch (SQLException e) {
            System.out.println("Error de conexion");
            JOptionPane.showMessageDialog(null, "Error de conexion" + e);
        }  
    }

   
    public void Eliminar(EN_Sucursal sucursal) {
      String sql = "DELETE Sucursal WHERE IdSucursal=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ps.setInt(1, sucursal.getIdSucursal());
            
            rr = ps.executeUpdate();
            if(rr>0){
            JOptionPane.showMessageDialog(null, "Se actualizo con exito!");
            }
                            
        } catch (SQLException e) {
            System.out.println("Error de conexion");
            JOptionPane.showMessageDialog(null, "Error de conexion" + e);
        }  
    }

   
   

    
}
