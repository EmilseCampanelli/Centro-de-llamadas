/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vistas.VPrincipal;

/**
 *
 * @author facundo
 */
public class ControladorInicio {
    
    static VPrincipal vista = new VPrincipal();
    
    public static void mostrar(){
        vista.setVisible(true);
    }
    
}
