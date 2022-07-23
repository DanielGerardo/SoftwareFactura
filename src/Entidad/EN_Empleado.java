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
public class EN_Empleado {
    int IdEmpleado;
    String Nombre;
    String Apellidos;
    String FechaNacimiento;
    String Domicilio;
    int CP;
    char Sexo;
    String RFC;
    String CURP;
    String FechaRegistro;
    int IdSucursal;

    public EN_Empleado(int IdEmpleado, String Nombre, String Apellidos, String FechaNacimiento, String Domicilio, int CP, char Sexo, String RFC, String CURP, String FechaRegistro, int IdSucursal) {
        this.IdEmpleado = IdEmpleado;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.FechaNacimiento = FechaNacimiento;
        this.Domicilio = Domicilio;
        this.CP = CP;
        this.Sexo = Sexo;
        this.RFC = RFC;
        this.CURP = CURP;
        this.FechaRegistro = FechaRegistro;
        this.IdSucursal = IdSucursal;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
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

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
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

    public String getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(String FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    public int getIdSucursal() {
        return IdSucursal;
    }

    public void setIdSucursal(int IdSucursal) {
        this.IdSucursal = IdSucursal;
    }
    
    
}
