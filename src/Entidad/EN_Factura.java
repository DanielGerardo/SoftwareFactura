/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author danyj
 */
public class EN_Factura {
    int IdFactura;
    String Folio;
    String UsoCFDI;
    String IdDepartamento;
    String RazonSocial;
    String EmpRFC;
    String ClienteRFC;
    String EmpDire;
    String ClienteDire;
    String Regimen;
    String FormaPago;
    String MetodoPago;
    String FechaReg;

    public EN_Factura(int IdFactura, String Folio, String UsoCFDI, String IdDepartamento, String RazonSocial, String EmpRFC, String ClienteRFC, String EmpDire, String ClienteDire, String Regimen, String FormaPago, String MetodoPago, String FechaReg) {
        this.IdFactura = IdFactura;
        this.Folio = Folio;
        this.UsoCFDI = UsoCFDI;
        this.IdDepartamento = IdDepartamento;
        this.RazonSocial = RazonSocial;
        this.EmpRFC = EmpRFC;
        this.ClienteRFC = ClienteRFC;
        this.EmpDire = EmpDire;
        this.ClienteDire = ClienteDire;
        this.Regimen = Regimen;
        this.FormaPago = FormaPago;
        this.MetodoPago = MetodoPago;
        this.FechaReg = FechaReg;
    }

    public int getIdFactura() {
        return IdFactura;
    }

    public void setIdFactura(int IdFactura) {
        this.IdFactura = IdFactura;
    }

    public String getFolio() {
        return Folio;
    }

    public void setFolio(String Folio) {
        this.Folio = Folio;
    }

    public String getUsoCFDI() {
        return UsoCFDI;
    }

    public void setUsoCFDI(String UsoCFDI) {
        this.UsoCFDI = UsoCFDI;
    }

    public String getIdDepartamento() {
        return IdDepartamento;
    }

    public void setIdDepartamento(String IdDepartamento) {
        this.IdDepartamento = IdDepartamento;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getEmpRFC() {
        return EmpRFC;
    }

    public void setEmpRFC(String EmpRFC) {
        this.EmpRFC = EmpRFC;
    }

    public String getClienteRFC() {
        return ClienteRFC;
    }

    public void setClienteRFC(String ClienteRFC) {
        this.ClienteRFC = ClienteRFC;
    }

    public String getEmpDire() {
        return EmpDire;
    }

    public void setEmpDire(String EmpDire) {
        this.EmpDire = EmpDire;
    }

    public String getClienteDire() {
        return ClienteDire;
    }

    public void setClienteDire(String ClienteDire) {
        this.ClienteDire = ClienteDire;
    }

    public String getRegimen() {
        return Regimen;
    }

    public void setRegimen(String Regimen) {
        this.Regimen = Regimen;
    }

    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String FormaPago) {
        this.FormaPago = FormaPago;
    }

    public String getMetodoPago() {
        return MetodoPago;
    }

    public void setMetodoPago(String MetodoPago) {
        this.MetodoPago = MetodoPago;
    }

    public String getFechaReg() {
        return FechaReg;
    }

    public void setFechaReg(String FechaReg) {
        this.FechaReg = FechaReg;
    }

  
}
