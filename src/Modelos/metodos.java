/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author danyj
 */
public interface metodos {
    Object[] objServicio = new Object[6];
    
   public static void agregar(String concepto,double precio,int cantidad,double descuento,int factura,JTable tabla){
     DefaultTableModel model = (DefaultTableModel) tabla.getModel();
         
     if(concepto != null&&cantidad>0&&factura>0&&precio>0){
         switch(factura){
             case 1:                      
                        
                        objServicio[0] = concepto;
                        objServicio[1] = precio;
                        objServicio[2] = cantidad;
                        objServicio[3] = "";
                        objServicio[4] = ""; 
                        objServicio[5] = "";
                        model.addRow(objServicio);
                        tabla.setModel(model); 
                                                                                                                                   
                       break;
             case 2: 
                     if(descuento<=precio){
                     objServicio[0] = concepto;
                     objServicio[1] = precio;
                     objServicio[2] = cantidad;
                     objServicio[3] = "";
                     objServicio[4] = descuento;
                     objServicio[5] = ""; 
                     model.addRow(objServicio);
                     tabla.setModel(model);  
                     }else{
                         JOptionPane.showMessageDialog(null,"El Descuento es mayor que el precio");
                     }
                       break; 
             case 3: 
                     if(descuento<=precio){
                     objServicio[0] = concepto;
                     objServicio[1] = precio;
                     objServicio[2] = cantidad;
                     objServicio[3] = "";
                     objServicio[4] = descuento;
                     objServicio[5] = ""; 
                     model.addRow(objServicio);
                     tabla.setModel(model); }
                     else{
                         JOptionPane.showMessageDialog(null,"El Descuento es mayor que el precio");
                     }
                     break;
         }
     }
   }
   
   public static void calcularFacturaAlimentos(JLabel total,JLabel txtsubtotal,JLabel txtImpRetenidos, JTable tabla){
    double tpagar;
    double subtotal = 0;
    double ivaProducto;
    int cat;
    double preci;
    double totalIva = 0;
       tpagar = 0;
        for (int i = 0; i < tabla.getRowCount(); i++) {
            cat = Integer.parseInt(tabla.getValueAt(i, 2).toString());
            preci = Double.parseDouble(tabla.getValueAt(i, 1).toString());
            tpagar = tpagar + (cat * preci);
            ivaProducto = cat * preci;
            ivaProducto = (ivaProducto * 16)/100;
            tabla.setValueAt(ivaProducto, i, 3);
            subtotal = subtotal+ivaProducto;
            totalIva = tpagar +subtotal;
        }
       txtImpRetenidos.setText("$"+subtotal);
       txtsubtotal.setText("$"+tpagar);
     
       total.setText( "$" + totalIva);
   }
   public static void calcularFacturaDescuento(JLabel total,JLabel txtsubtotal,JLabel txtImpRetenidos,JLabel txtDescuento, JTable tabla){
    double tpagar;
    double subtotal = 0;
    int cat;
    double preci;
    double descuento;   
    double sumDescuento=0;
    double totalIva = 0;
    double ivaProducto;
       tpagar = 0;
        for (int i = 0; i < tabla.getRowCount(); i++) {
            cat = Integer.parseInt(tabla.getValueAt(i, 2).toString());
            preci = Double.parseDouble(tabla.getValueAt(i, 1).toString());
            descuento = Double.parseDouble(tabla.getValueAt(i, 4).toString());
            tpagar = tpagar + (cat * preci);                                
            
            ivaProducto = (cat * preci)-descuento;
            ivaProducto = (ivaProducto * 16)/100;
            tabla.setValueAt(ivaProducto, i, 3);
            subtotal = subtotal+ivaProducto;          
            sumDescuento = sumDescuento+descuento;
            totalIva = tpagar-sumDescuento +subtotal;
           
        }
       txtImpRetenidos.setText("$"+subtotal);
       txtsubtotal.setText("$"+tpagar);
       txtDescuento.setText(""+sumDescuento);
       total.setText( "$" + totalIva);
   }
   public static void calcularFacturaTraslado(JLabel total,JLabel txtsubtotal,JLabel txtImpRetenidos,JLabel txtDescuento, JTable tabla){
    double tpagar;
    double sumImps =0;
    double sumieps;
    double sumiva;
    int cat;
    double preci;
    double descuento;
    double sumDescuento=0;
    double totalIva = 0;
    double ieps;
    double iva;
    double precioXProducto;
    
       tpagar = 0;
        for (int i = 0; i < tabla.getRowCount(); i++) {
            cat = Integer.parseInt(tabla.getValueAt(i, 2).toString());
            preci = Double.parseDouble(tabla.getValueAt(i, 1).toString());
            descuento = Double.parseDouble(tabla.getValueAt(i, 4).toString());
            
            tpagar = tpagar + (cat * preci);                                
            
            precioXProducto = cat * preci;
            ieps = precioXProducto-descuento;
            ieps = (ieps * 30)/100;
            tabla.setValueAt(ieps, i, 5);
            ieps = ieps+precioXProducto-descuento;
            iva = (ieps*16)/100;
            tabla.setValueAt(iva, i, 3);
            
            sumieps = Double.parseDouble(tabla.getValueAt(i, 3).toString());
            sumiva = Double.parseDouble(tabla.getValueAt(i, 5).toString());
            sumImps = sumImps+(sumieps+sumiva);
           
            sumDescuento = sumDescuento+descuento;
            totalIva = tpagar-sumDescuento +sumImps;
           
        }
       txtImpRetenidos.setText("$"+sumImps);
       txtsubtotal.setText("$"+tpagar);
       txtDescuento.setText(""+sumDescuento);
       total.setText( "$" + totalIva);
   }
}
