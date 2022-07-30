/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaFiltros;

import CapaDatos.CD_Sucursal;
import Entidad.EN_Sucursal;
import javax.swing.JOptionPane;
import Modelos.CM_Recursos;
/**
 *
 * @author danyj
 */
public class CF_Sucursal {
    private CD_Sucursal objCapaDato = new CD_Sucursal();
    CM_Recursos cmR = new CM_Recursos();   
    public CF_Sucursal(){}
            
        public void Registrar(EN_Sucursal sucursal){
            
           if(sucursal.getRazonSocial().length()==0||sucursal.getRazonSocial()==null){
            JOptionPane.showMessageDialog(null, "El campo Razon Social esta vacio");
           }else if(sucursal.getRFC().length()==0||sucursal.getRFC()==null){
            JOptionPane.showMessageDialog(null, "El campo RFC esta vacio");
           }else if(cmR.validador(sucursal.getRFC(),"[A-Z]{4}[0-9]{6}[A-Z0-9]{3}")==false){
            JOptionPane.showMessageDialog(null, "El campo RFC no cumple con el formato");
           }else if(sucursal.getTel().length()==0){
            JOptionPane.showMessageDialog(null, "El campo Telefono esta vacio");
           }else if(cmR.validador(sucursal.getTel(),"[0-9]{10}")==false||sucursal.getTel().length()>10){
            JOptionPane.showMessageDialog(null, "El campo Telefono no cumple con el formato");
           }else if(sucursal.getCorreo().length()==0||sucursal.getCorreo()==null){
            JOptionPane.showMessageDialog(null, "El campo Correo esta vacio");
           }else if(cmR.validador(sucursal.getCorreo(),"^[\\w]+(\\.[\\w]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")==false){
            JOptionPane.showMessageDialog(null, "El campo Correo no cumple con el formato");
           }else if(sucursal.getDomicilio().length()==0||sucursal.getDomicilio()==null){
              JOptionPane.showMessageDialog(null, "El campo Direccion esta vacio"); 
           }else if(sucursal.getLogo()==null){
              JOptionPane.showMessageDialog(null, "Agrega un logo"); 
           }else if(sucursal.getCP().length()==0){
              JOptionPane.showMessageDialog(null, "El campo C.P. esta vacio"); 
           }else if(cmR.validador(sucursal.getCP(),"[0-9]{5}")==false||sucursal.getCP().length()>5){
              JOptionPane.showMessageDialog(null, "El campo C.P. no cumple con el formato"); 
           }else{
               objCapaDato.Registrar(sucursal);
           }
        }
        
        
}
