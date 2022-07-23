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
public class EN_Producto {
    
    int IdProducto;
    String Nombre;
    String Descripcion;
    String Unidad;
    double Precio;
    int Stock;
    Image Imagen;
    String RutaImagen;
    int IdCategoria;
    int IdMarca;
    int Activo;
    String FechaRegistro;

    public EN_Producto(int IdProducto, String Nombre, String Descripcion, String Unidad, double Precio, int Stock, Image Imagen, String RutaImagen, int IdCategoria, int IdMarca, int Activo, String FechaRegistro) {
        this.IdProducto = IdProducto;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Unidad = Unidad;
        this.Precio = Precio;
        this.Stock = Stock;
        this.Imagen = Imagen;
        this.RutaImagen = RutaImagen;
        this.IdCategoria = IdCategoria;
        this.IdMarca = IdMarca;
        this.Activo = Activo;
        this.FechaRegistro = FechaRegistro;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getUnidad() {
        return Unidad;
    }

    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public Image getImagen() {
        return Imagen;
    }

    public void setImagen(Image Imagen) {
        this.Imagen = Imagen;
    }

    public String getRutaImagen() {
        return RutaImagen;
    }

    public void setRutaImagen(String RutaImagen) {
        this.RutaImagen = RutaImagen;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public int getIdMarca() {
        return IdMarca;
    }

    public void setIdMarca(int IdMarca) {
        this.IdMarca = IdMarca;
    }

    public int getActivo() {
        return Activo;
    }

    public void setActivo(int Activo) {
        this.Activo = Activo;
    }

    public String getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(String FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }
    
    
}
