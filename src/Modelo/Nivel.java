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
public class Nivel {
    private String descripcion;
    ArrayList<Sintoma> sintomanivel1= new ArrayList<Sintoma>();
    ArrayList<Sintoma> sintomanivel2= new ArrayList<Sintoma>();
    ArrayList<Sintoma> sintomanivel3= new ArrayList<Sintoma>();
    public Nivel(){
        
    }
    public void agregarSinomasNivel1(){
        sintomanivel1.add(new Sintoma("Tos seca"));
        sintomanivel1.add(new Sintoma("Dolor muscular o en las articulaciones"));
        sintomanivel1.add(new Sintoma("Dolor de garganta"));
        sintomanivel1.add(new Sintoma("Fatiga"));
    }
      public void agregarSinomasNivel2(){
        sintomanivel2.addAll(sintomanivel1);
        sintomanivel2.add(new Sintoma("fiebre"));
        sintomanivel2.add(new Sintoma("Nauseas o Vomito"));
        sintomanivel2.add(new Sintoma("Dolor de cabeza"));
        sintomanivel2.add(new Sintoma("Escalofrios"));
        
    }
      public void agregarSinomasNivel3(){
        sintomanivel3.addAll(sintomanivel2);
        sintomanivel3.add(new Sintoma("Dificultad para respirar"));
        
    }
      
    public Nivel(String descripcion) {
        this.descripcion = descripcion;
    }
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Sintoma> getSintomanivel1() {
        return sintomanivel1;
    }

    public void setSintomanivel1(ArrayList<Sintoma> sintomanivel1) {
        this.sintomanivel1 = sintomanivel1;
    }

    public ArrayList<Sintoma> getSintomanivel2() {
        return sintomanivel2;
    }

    public void setSintomanivel2(ArrayList<Sintoma> sintomanivel2) {
        this.sintomanivel2 = sintomanivel2;
    }

    public ArrayList<Sintoma> getSintomanivel3() {
        return sintomanivel3;
    }

    public void setSintomanivel3(ArrayList<Sintoma> sintomanivel3) {
        this.sintomanivel3 = sintomanivel3;
    }

  

    
    
    
}
