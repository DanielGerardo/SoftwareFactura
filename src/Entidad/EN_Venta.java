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
public class EN_Venta {
   
    int IdVenta;
    int Folio;
    int IdCliente;
    int TotalProducto;
    double MontoTotal;
    String Correo;
    int Telefono;
    String Direccion;
    String IdTransaccion;
    String MetodoPago;
    String FechaVenta;

    public EN_Venta(int IdVenta, int Folio, int IdCliente, int TotalProducto, double MontoTotal, String Correo, int Telefono, String Direccion, String IdTransaccion, String MetodoPago, String FechaVenta) {
        this.IdVenta = IdVenta;
        this.Folio = Folio;
        this.IdCliente = IdCliente;
        this.TotalProducto = TotalProducto;
        this.MontoTotal = MontoTotal;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.IdTransaccion = IdTransaccion;
        this.MetodoPago = MetodoPago;
        this.FechaVenta = FechaVenta;
    }

    public int getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(int IdVenta) {
        this.IdVenta = IdVenta;
    }

    public int getFolio() {
        return Folio;
    }

    public void setFolio(int Folio) {
        this.Folio = Folio;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getTotalProducto() {
        return TotalProducto;
    }

    public void setTotalProducto(int TotalProducto) {
        this.TotalProducto = TotalProducto;
    }

    public double getMontoTotal() {
        return MontoTotal;
    }

    public void setMontoTotal(double MontoTotal) {
        this.MontoTotal = MontoTotal;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getIdTransaccion() {
        return IdTransaccion;
    }

    public void setIdTransaccion(String IdTransaccion) {
        this.IdTransaccion = IdTransaccion;
    }

    public String getMetodoPago() {
        return MetodoPago;
    }

    public void setMetodoPago(String MetodoPago) {
        this.MetodoPago = MetodoPago;
    }

    public String getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(String FechaVenta) {
        this.FechaVenta = FechaVenta;
    }
    
    
}
