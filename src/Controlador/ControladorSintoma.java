/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vistas.VPrincipal;
import Vistas.VistaSintoma;
import static Vistas.VistaSintoma.BTN_Agregar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author facundo
 */
public class ControladorSintoma implements ActionListener{
    
     
    static VistaSintoma vistaSint = new VistaSintoma();
    
    public static void mostrar(){        
        vistaSint.setVisible(true);
    }
    public void ejecutar(){
        vistaSint.setControlador(this);
        vistaSint.ejecutar();
        
    }
    
   @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals(vistaSint.BTN_Agregar)){
            
            DefaultTableModel tabla = new DefaultTableModel();
            tabla = (DefaultTableModel) vistaSint.getjTable1().getModel();
            
            String linea[] = new String[1];
            
            linea[0]=vistaSint.getnombre();          
            tabla.addRow(linea);
            vistaSint.getjTable1().setModel(tabla);
            
            /*for(){
                
            }*/
           
           
        
    }
  }
    
}
