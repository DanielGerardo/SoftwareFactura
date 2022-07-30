/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import Entidad.EN_Sucursal;
import Modelos.CM_Recursos;
import Modelos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Vistas.NuevaSucursal;
import static Vistas.NuevaSucursal.tablaSucursal;
import javax.swing.table.DefaultTableModel;







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
        DefaultTableModel model;
    public void Listar(){
               
        Object[] Sucursal = null;
        try {
            acceso = con.conectar();
            String sql = "SELECT * FROM Sucursal";
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();
             String[] titulos = {"ID","RazonSocial","RFC","Telefono","Correo","Domicilio","CP","FechaRegistro"};
            model = new DefaultTableModel(null, titulos);        
       
            while (rs.next()) {
                
                Sucursal = new Object[8];
                Sucursal[0] = rs.getInt("IdSucursal");
                Sucursal[1] = rs.getString("RazonSocial");
                Sucursal[2] = rs.getString("Telefono");
                Sucursal[3] = rs.getString("Correo");
                Sucursal[4] = rs.getString("RFC");
                Sucursal[5] = rs.getString("Domicilio");
                Sucursal[6] = rs.getInt("CP");                                              
                Sucursal[7] = rs.getString("FechaRegistro");
                model.addRow(Sucursal);
                tablaSucursal.setModel(model); 
            }
            rs.close();
           
        } catch (SQLException e) {   
            System.out.println(e);
              
        }       
         
    }
    
    public void Registrar(EN_Sucursal sucursal) {
        String sql = "INSERT INTO Sucursal (RazonSocial,Telefono,Correo,RFC,Domicilio,CP,Logo,FechaRegistro) Values (?,?,?,?,?,?,?,date('now'))";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
                       
            ps.setString(1, sucursal.getRazonSocial());
            ps.setString(2, sucursal.getTel());
            ps.setString(3, sucursal.getCorreo());
            ps.setString(4, sucursal.getRFC());
            ps.setString(5, sucursal.getDomicilio());
            ps.setString(6, sucursal.getCP());
            ps.setBytes(7, sucursal.getLogo());            
            rr = ps.executeUpdate();
            if(rr>0){
            JOptionPane.showMessageDialog(null, "Se registro con exito!");
            }
                            
        } catch (SQLException e) {
            System.out.println(""+e);
            JOptionPane.showMessageDialog(null, "Error de conexion" + e);
        }        
    }

   
    public void Actualizar(EN_Sucursal sucursal) {
     
       String sql = "UPDATE Sucursal SET RazonSocial=?,Telefono=?,Correo=?, RFC=?, Domicilio=?, CP=?, Logo=?, FechaRegistro=date('now')"
               + " WHERE Id_Sucursal=?";
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            
            
            ps.setString(1, sucursal.getRazonSocial());
            ps.setString(2, sucursal.getTel());
            ps.setString(3, sucursal.getCorreo());
            ps.setString(4, sucursal.getRFC());
            ps.setString(5, sucursal.getDomicilio());
            ps.setString(6, sucursal.getCP());
            ps.setBytes(7, sucursal.getLogo()); 
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
