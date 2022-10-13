/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Generalizacion;

/**
 *
 * @author Ruben
 */
public class prueba3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c1= new Cliente("Abregu Lucy");
        Cliente c2= new Cliente("Dante Arias");
        Factura f1= new Factura("02-04-22",300,c1);
        new Factura("03-04-22",130,c2);
        new Factura("04-04-22",240,c1);
        new Factura("05-04-22",120,c2);
        new Factura("06-04-22",88,c1);
        c1.print();
        System.out.println("========");
        c2.print();
    }
    
}
