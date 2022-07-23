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
public class EN_Categoria {
    
   int IdCategoria;
   String Descripcion;
   int Activo;
   String FechaReg;

    public EN_Categoria(int IdCategoria, String Descripcion, int Activo, String FechaReg) {
        this.IdCategoria = IdCategoria;
        this.Descripcion = Descripcion;
        this.Activo = Activo;
        this.FechaReg = FechaReg;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
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

    public String getFechaReg() {
        return FechaReg;
    }

    public void setFechaReg(String FechaReg) {
        this.FechaReg = FechaReg;
    }
   
   
}
