/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Agregacion;

/**
 *
 * @author Ruben
 */
public class prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Documentos d1= new Documentos("Tesis 1",120);
        Documentos d2= new Documentos("Libro java",100);
        Impresora p1= new Impresora("A color de tinta");
        Impresora p2= new Impresora("Blanco negro laser");
        
        p1.print(d1);
        System.out.println("=========");
        p2.print(d2);
    }
    
}
