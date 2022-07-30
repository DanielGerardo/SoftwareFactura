/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.awt.Image;
import javax.swing.Renderer;

/**
 *
 * @author danyj
 */
public class EN_Sucursal {
    int IdSucursal;
    String RazonSocial;
    String Tel;
    String Correo;
    String RFC;
    String Domicilio;
    String CP;
    byte[] Logo;
    String FechaRegistro;

    public EN_Sucursal(){}

    public EN_Sucursal(String RazonSocial, String Tel, String Correo, String RFC, String Domicilio, String CP, byte[] Logo, String FechaRegistro) {
        this.RazonSocial = RazonSocial;
        this.Tel = Tel;
        this.Correo = Correo;
        this.RFC = RFC;
        this.Domicilio = Domicilio;
        this.CP = CP;
        this.Logo = Logo;
        this.FechaRegistro = FechaRegistro;
    }
    
    public int getIdSucursal() {
        return IdSucursal;
    }

    public void setIdSucursal(int IdSucursal) {
        this.IdSucursal = IdSucursal;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public byte[] getLogo() {
        return Logo;
    }

    public void setLogo(byte[] Logo) {
        this.Logo = Logo;
    }

    public String getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(String FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }
      /*public List<EN_Sucursal> Listar(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion con = new Conexion();
        Connection acceso;
        
        List<EN_Sucursal> lista = new ArrayList<EN_Sucursal>();
        EN_Sucursal Sucursal = null;
        try {
            acceso = con.conectar();
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
           
        } catch (SQLException e) {   
            System.out.println(e);
            lista = new ArrayList<EN_Sucursal>();
        }       
        return lista; 
}  */    

    

}