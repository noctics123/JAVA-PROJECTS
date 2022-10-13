/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asociacion;

/**
 *
 * @author Ruben
 */
public class Chofer {
    
    String brevete;
    String nombre;
    
    public Chofer(){
        
    }
    
    public Chofer(String brevete, String nombre){
        this.brevete=brevete;
        this.nombre=nombre;
        
    }

    public String getBrevete() {
        return brevete;
    }

    public void setBrevete(String brevete) {
        this.brevete = brevete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
