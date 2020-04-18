/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.*;
/**
 *
 * @author emica
 */
public class Sintoma {
    private String nombre;
    ArrayList<String> sintomas;
    
    public Sintoma(){
        sintomas= new ArrayList<String>();
        
    }
    public void GenerarSintoma(){
        sintomas.add(nombre);
        
    }
}
