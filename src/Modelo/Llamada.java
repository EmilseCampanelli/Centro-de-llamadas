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
public class Llamada {
    private Date fecha;
    private Date hora;
    Persona persona ;
    Recurso nuevoRecurso=new Recurso();
    Nivel nivelGravedad= new Nivel();
    ArrayList<Sintoma> sintoma= new ArrayList<Sintoma>();
    private ArrayList<Object> listadeLLamadas;
    
    public Llamada(){
        
    }
    public void agregarPersona(int dni, String nombre, String apellido,String domicilio, String telefono){
        persona=new Persona(dni,nombre,apellido,domicilio,telefono);
        
    }
    public void agregarLlamada(){
        
    }
    
    
}
