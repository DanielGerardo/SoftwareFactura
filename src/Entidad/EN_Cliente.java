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
public class EN_Cliente {
     
    int IdCliente;
    String Nombre;
    String Apellidos;
    String Direccion;
    int CP;
    String RFC;
    String CURP;
    String Correo;
    String Regimen;
    String FechaNacimiento;
    String FechaRegistro;

    public EN_Cliente(int IdCliente, String Nombre, String Apellidos, String Direccion, int CP, String RFC, String CURP, String Correo, String Regimen, String FechaNacimiento, String FechaRegistro) {
        this.IdCliente = IdCliente;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.CP = CP;
        this.RFC = RFC;
        this.CURP = CURP;
        this.Correo = Correo;
        this.Regimen = Regimen;
        this.FechaNacimiento = FechaNacimiento;
        this.FechaRegistro = FechaRegistro;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getRegimen() {
        return Regimen;
    }

    public void setRegimen(String Regimen) {
        this.Regimen = Regimen;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(String FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }
    
    
}
