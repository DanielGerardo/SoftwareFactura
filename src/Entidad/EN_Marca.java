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
public class EN_Marca {
     
    int IdMarca;
    String Descripcion;
    int Activo;
    String FechaRegistro;

    public EN_Marca(int IdMarca, String Descripcion, int Activo, String FechaRegistro) {
        this.IdMarca = IdMarca;
        this.Descripcion = Descripcion;
        this.Activo = Activo;
        this.FechaRegistro = FechaRegistro;
    }

    public int getIdMarca() {
        return IdMarca;
    }

    public void setIdMarca(int IdMarca) {
        this.IdMarca = IdMarca;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
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
