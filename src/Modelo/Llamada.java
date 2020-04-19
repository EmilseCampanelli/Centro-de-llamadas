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
    Recurso nuevoRecurso;
    Nivel nivelGravedad;
    ArrayList<Sintoma> sintoma;
    //private ArrayList<Object> listadeLLamadas;

    public Llamada(Date fecha,Date hora){
        this.fecha=fecha;
        this.hora=hora;
    }
    
    public void agregarPersona(int dni, String nombre, String apellido,String domicilio, String telefono){
        persona=new Persona(dni,nombre,apellido,domicilio,telefono);
        
    }
    public void agregarLlamada(){
             
    }

    
       
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Recurso getNuevoRecurso() {
        return nuevoRecurso;
    }

    public void setNuevoRecurso(Recurso nuevoRecurso) {
        this.nuevoRecurso = nuevoRecurso;
    }

    public Nivel getNivelGravedad() {
        return nivelGravedad;
    }

    public void setNivelGravedad(Nivel nivelGravedad) {
        this.nivelGravedad = nivelGravedad;
    }

    public ArrayList<Sintoma> getSintoma() {
        return sintoma;
    }

    public void setSintoma(ArrayList<Sintoma> sintoma) {
        this.sintoma = sintoma;
    }
    
    
    
    
    
}
