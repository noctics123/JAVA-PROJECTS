/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Caso1;
import java.util.*;
/**
 *
 * @author Ruben
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Alumno> lis = new ArrayList();
        lis.add(new Pregrado("Diaz Juan",14,10));
        lis.add(new Postgrado("Vera Luis",14,10));
        lis.add(new Pregrado("Ana Abregu",8,14));
        lis.add(new Postgrado("Jose Ortiz",8,14));
        
        for(Alumno x:lis){
            x.print();
            System.out.println("==================");
        }
    }
    
}
