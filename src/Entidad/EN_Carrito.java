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
public class EN_Carrito {
    int IdCarrito;
    int IdCliente;
    int IdProducto;
    int Cantidad;

    public EN_Carrito(int IdCarrito, int IdCliente, int IdProducto, int Cantidad) {
        this.IdCarrito = IdCarrito;
        this.IdCliente = IdCliente;
        this.IdProducto = IdProducto;
        this.Cantidad = Cantidad;
    }

    public int getIdCarrito() {
        return IdCarrito;
    }

    public void setIdCarrito(int IdCarrito) {
        this.IdCarrito = IdCarrito;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
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
    
    
}
