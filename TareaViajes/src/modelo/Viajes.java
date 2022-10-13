/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.*;
import javax.swing.JTextArea;

/**
 *
 * @author Ruben
 */
public class Viajes {
    int nroviaje;
    String ruta;
    double costo;
    int can_dis;
    List<Pasajero>lista;
    static int con=100;
    static int cantd = 21;
    public Viajes(String ruta, double costo) {
        this.can_dis=cantd--;
        this.nroviaje = con++;
        this.ruta = ruta;
        this.costo = costo;
        this.lista = new ArrayList();
    }

    public Viajes() {
        
    }
    
      public void adicion(Pasajero ps){
          
        if(can_dis<0){
           return; 
        }else{
            lista.add(ps);
        }  
    }
    
      
     public void consulta(JTextArea at){
        at.setText("nro Viaje "+nroviaje);
        at.append("\nRuta "+ruta);
        at.append("\nNombre\tTipo");
        for(Pasajero x:lista){
            at.append("\n"+x.getNombre()+"\t"+x.getTipo());
        }
        
    } 

     
    public String getNombre(int nro){
        
        String name="";

        for(Pasajero x:lista){
            if(nroviaje == nro)
            name= x.getNombre();
        }
        return name;
    } 
    
    public int getTipo(int nro){
        int t=0;
         for(Pasajero x:lista){
            if(nroviaje == nro)
            t= x.getTipo();
        }
         return t;
    }
    
     public int getBoleto(int nro){
        int t=0;

         for(Pasajero x:lista){
            if(nroviaje == nro)
            t=x.getBoleto();
        }
         return t;
    }
    
     
    public int getNroviaje() {
        return nroviaje;
    }

    public void setNroviaje(int nroviaje) {
        this.nroviaje = nroviaje;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCan_dis() {
        return can_dis;
    }

    public void setCan_dis(int can_dis) {
        this.can_dis = can_dis;
    }


    public List<Pasajero> getLista() {
        return lista;
    }

    public void setLista(List<Pasajero> lista) {
        this.lista = lista;
    }
    
}
