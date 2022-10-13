/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P1;

import java.util.*;

/**
 *
 * @author Ruben
 */
public class Proyecto {
    
    List<Registro>lista = new ArrayList();
    
    
     public void adiciona(Registro re){
        lista.add(re);
    }
    public Registro consulta(int num){
        for(Registro x:lista){
            if(x.getCod()==num){
                return x;
            }
        }
        return null;
    }

    public List<Registro> getLista() {
        return lista;
    }

    public void setLista(List<Registro> lista) {
        this.lista = lista;
    }
  
    
}
