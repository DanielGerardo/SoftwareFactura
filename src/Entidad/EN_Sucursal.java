/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.awt.Image;

/**
 *
 * @author danyj
 */
public class EN_Sucursal {
    int IdSucursal;
    String RazonSocial;
    String RFC;
    String Domicilio;
    int CP;
    byte[] Logo;
    String FechaRegistro;

    public EN_Sucursal(int IdSucursal, String RazonSocial, String RFC, String Domicilio, int CP, byte[] Logo, String FechaRegistro) {
        this.IdSucursal = IdSucursal;
        this.RazonSocial = RazonSocial;
        this.RFC = RFC;
        this.Domicilio = Domicilio;
        this.CP = CP;
        this.Logo = Logo;
        this.FechaRegistro = FechaRegistro;
    }

    public EN_Sucursal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
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

}