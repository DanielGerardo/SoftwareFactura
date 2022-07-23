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
public class EN_DetalleVenta {
    
    int IdDetalleVenta;
    int Folio;
    int IdProducto;
    int Cantidad;
    double Total;

    public EN_DetalleVenta(int IdDetalleVenta, int Folio, int IdProducto, int Cantidad, double Total) {
        this.IdDetalleVenta = IdDetalleVenta;
        this.Folio = Folio;
        this.IdProducto = IdProducto;
        this.Cantidad = Cantidad;
        this.Total = Total;
    }

    public int getIdDetalleVenta() {
        return IdDetalleVenta;
    }

    public void setIdDetalleVenta(int IdDetalleVenta) {
        this.IdDetalleVenta = IdDetalleVenta;
    }

    public int getFolio() {
        return Folio;
    }

    public void setFolio(int Folio) {
        this.Folio = Folio;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    
    
}
