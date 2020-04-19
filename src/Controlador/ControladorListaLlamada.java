/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vistas.ListaLlamada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author facundo
 */
public class ControladorListaLlamada implements ActionListener{
    
    static ListaLlamada llamada = new ListaLlamada();
    
    public static void mostrar(){
        llamada.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel tabla = new DefaultTableModel();
        tabla= (DefaultTableModel) llamada.getjTable1().getModel();
        
        
        
        
    }
}
