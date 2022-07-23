/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import Entidad.EN_Sucursal;
import Modelos.Conexion;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;




/**
 *
 * @author danyj
 */
public class CD_Sucursal {
    public ArrayList<EN_Sucursal> Listar(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion con = new Conexion();
        Connection acceso;
        
        ArrayList<EN_Sucursal> lista = new ArrayList<EN_Sucursal>();
        EN_Sucursal Sucursal = null;
        try {
            acceso = con.Conectar();
            String sql = "SELECT * FROM Sucursal";
            ps = acceso.prepareStatement(sql);
            rs = ps.executeQuery();           
            while (rs.next()) {
                Sucursal = new EN_Sucursal();
                Sucursal.setIdSucursal(rs.getInt("IdSucursal"));
                Sucursal.setRazonSocial(rs.getString("RazonSocial"));
                Sucursal.setRFC(rs.getString("RFC"));
                Sucursal.setDomicilio(rs.getString("Domicilio"));
                Sucursal.setCP(rs.getInt("CP"));                              
                Sucursal.setLogo(rs.getBytes("Logo"));
                Sucursal.setFechaRegistro(rs.getString("FechaRegistro"));
                lista.add(Sucursal);
                
            }
            rs.close();
           con.cerrar();
        } catch (Exception e) {            
        lista = new ArrayList<EN_Sucursal>();       
        }
        return lista;
    
    }
    
}
