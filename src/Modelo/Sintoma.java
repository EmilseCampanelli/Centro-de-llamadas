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
    
    public Sintoma(String nombre){
        sintomas= new ArrayList<String>();
        
    }
    public void agregarSintoma(){
        sintomas.add(nombre);
    }
    public void generarSintoma(){
        sintomas.add("Fiebre");
        sintomas.add("Tos seca");
        sintomas.add("Fatiga");
        sintomas.add("Disnea");
        sintomas.add("Flema");
        sintomas.add("Dolor muscular o en las articulaciones");
        sintomas.add("Dolor de garganta");
        sintomas.add("Dolor de cabeza");
        sintomas.add("Escalofrios");
        sintomas.add("Nauseas o Vomitos");
        sintomas.add("Congestion nasal");
        sintomas.add("Dificultas para respirar");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
