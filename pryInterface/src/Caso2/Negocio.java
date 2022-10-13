/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso2;

/**
 *
 * @author Ruben
 */
import java.util.*;
public class Negocio {
    List <Empleado> lis = new ArrayList();

    public Negocio() {
        lis.add(new Empleado("Juan Perez",2300));
        lis.add(new Empleado("Ana Gonzales",2800));
        lis.add(new Empleado("Mario Alva",3100));
        lis.add(new Empleado("Luis caceres",3300));
        lis.add(new Empleado("Alex Perez",2400));
    }

    public void ordNombre(){
        lis.sort(new orden1());
    }
    
    public void ordCodigo(){
        lis.sort(new orden2());
    }
    public void ordSueldo(){
        lis.sort(new orden3());
    }
    
    //ordenar*nombre
    
    class orden1 implements Comparator<Empleado>{

        @Override
        public int compare(Empleado o1, Empleado o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        } 
    }
    
    class orden2 implements Comparator<Empleado>{

        @Override
        public int compare(Empleado o1, Empleado o2) {
            return o1.getCode()-o2.getCode();
        }
        
    }
    
    class orden3 implements Comparator<Empleado>{

        @Override
        public int compare(Empleado o1, Empleado o2) {
            if(o1.getSueldo()>o2.getSueldo())
                return -1;
            else if (o1.getSueldo()<o2.getSueldo())
                return 1;
            else
                return 0;
        }
        
    }

    public List<Empleado> getLis() {
        return lis;
    }

    public void setLis(List<Empleado> lis) {
        this.lis = lis;
    }
    
    
    
}
