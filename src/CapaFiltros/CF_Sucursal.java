/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaFiltros;

import CapaDatos.CD_Sucursal;

/**
 *
 * @author danyj
 */
public class CF_Sucursal {
    private CD_Sucursal objCapaDato = new CD_Sucursal();
        
    public CF_Sucursal(){}
    
        public Object[] Listar()
        {
            return objCapaDato.Listar();
        }
}
