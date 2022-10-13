/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso2;
import java.util.*;
/**
 *
 * @author Ruben
 */
public class Negocio {
    private List<Empleado>lis=new ArrayList();

    public Negocio() {
    lis.add(new Empleado("Perez Juan",2300));
    lis.add(new Empleado("Gonzales Ana",2800));
    lis.add(new Empleado("Alva Mario",3100));
    lis.add(new Empleado("Caceres Luis",3300));
    lis.add(new Empleado("Perez Alex",2400));
    lis.add(new Empleado("Castillo Jose",2400));
    lis.add(new Empleado("Avila Rosa",2400));
    }
    public void ordNombre(){
        lis.sort(new orden1());
    }

    public List<Empleado> getLis() {
        return lis;
    }

    public void setLis(List<Empleado> lis) {
        this.lis = lis;
    }
    
    class orden1 implements Comparator<Empleado>{

        @Override
        public int compare(Empleado o1, Empleado o2) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    
}
