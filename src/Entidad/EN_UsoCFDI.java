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
public class EN_UsoCFDI {
    
    String ClaveCFDI;
    String Descripcion;
    String Fisica;
    String Moral;

    public EN_UsoCFDI(String ClaveCFDI, String Descripcion, String Fisica, String Moral) {
        this.ClaveCFDI = ClaveCFDI;
        this.Descripcion = Descripcion;
        this.Fisica = Fisica;
        this.Moral = Moral;
    }

    public String getClaveCFDI() {
        return ClaveCFDI;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getFisica() {
        return Fisica;
    }

    public String getMoral() {
        return Moral;
    }
    
    
}
