/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglo;
import java.util.ArrayList;
import Clase.Trabajador;
/**
 *
 * @author Ruben
 */
public class ArregloTrabajadores {
    
     ArrayList<Trabajador> lis=new ArrayList();
    
    public ArregloTrabajadores(){
        lis.add(new Trabajador("Diaz",3000));
        lis.add(new Trabajador("Garcia",2000));
        lis.add(new Trabajador("Vera",3500));
        lis.add(new Trabajador("Avila",1800));
        lis.add(new Trabajador("Perez",5600));
    }
    
    public void adicion(Trabajador ep){
        lis.add(ep);
    }
    public void cambia(Trabajador ep, int pos){
        lis.set(pos, ep);
    }
    public void borra(int pos){
        lis.remove(pos);
    }
    public ArrayList<Trabajador> getLis() {
        return lis;
    }
    public double sumaSueldos(){
        
        double precioTotal = 0;

        for(Trabajador t : lis) {
         precioTotal += t.total();
        }
       /*double precioTotal= lis.stream().mapToDouble(o -> o.total().sum();*/
       return precioTotal;
    }
    public double mayorSueldoNeto(){
        
        double mayor=0;
        
        for(Trabajador t : lis) {
         if(t.total()>mayor){
          mayor = t.total();   
         }
        }
        return mayor;
    }
    public int mayora2800(){
        int cant=0;
         for(Trabajador t : lis) {
         if(t.total()>2800){
          cant++;  
         }
        }
         return cant;
    }

    public void setLis(ArrayList<Trabajador> lis) {
        this.lis = lis;
    }
    
}
