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
public class EN_FormasPago {
    
   String Clave;
   String Descripcion;

    public EN_FormasPago(String Clave, String Descripcion) {
        this.Clave = Clave;
        this.Descripcion = Descripcion;
    }

    public String getClave() {
        return Clave;
    }

    public String getDescripcion() {
        return Descripcion;
    }
   
   
}
