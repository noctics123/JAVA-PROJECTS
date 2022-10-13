/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;
import java.util.*;
/**
 *
 * @author Ruben
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Documento> doc = new ArrayList();
        doc.add(new Boleta("12-01-22", 300, "Juan"));
        doc.add(new Factura("14-01-22", 140, "Lili"));
        doc.add(new Boleta("17-01-22", 300, "Juan"));
        doc.add(new Factura("22-01-22",200,"2222"));
        doc.add(new Factura("18-01-22",400,"3333"));
        String msg;
        for(Documento x:doc){
            msg=x instanceof Boleta?"Boleta":"Factura";
            System.out.println(msg+"\n"+x.print()+"\n=======");
        }
    }
    
}
