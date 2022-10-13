/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.*;

/**
 *
 * @author Ruben
 */
public class Negocio {
    
    List<Viajes> lista=new ArrayList();
    public Negocio(){
        
    }
    
    public void adiciona(Viajes vs){
        lista.add(vs);
    }
    public Viajes consulta(int num){
        for(Viajes x:lista){
            if(x.getNroviaje()==num){
                return x;
            }
        }
        return null;
    }
    
    public List<Viajes> getLista(){
        return lista;
    }
}
