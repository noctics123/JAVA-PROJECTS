/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglo;
import java.util.ArrayList;
import Clase.Venta;
/**
 *
 * @author Ruben
 */
public class ArregloVentas {
    
    ArrayList<Venta> lis=new ArrayList();
    
      public ArregloVentas(){
        lis.add(new Venta(1,80,80000,4,"Anibal"));
        lis.add(new Venta(2,90,90000,4,"Pedro"));
        lis.add(new Venta(3,120,120000,4,"Estacio"));
        lis.add(new Venta(4,150,180000,4,"Rodrigo"));
        lis.add(new Venta(2,90,90000,4,"Laura"));
    }
     public void adicion(Venta ep){
        lis.add(ep);
     }
    public ArrayList<Venta> getlis() {
        return lis;
    }
   
}
