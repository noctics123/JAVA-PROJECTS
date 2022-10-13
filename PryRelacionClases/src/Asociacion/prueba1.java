/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Asociacion;

/**
 *
 * @author Ruben
 */
public class prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chofer c1 = new Chofer("32723", "Juan Diaz");
        Chofer c2 = new Chofer("85045","Luis Perez");
        Taxi t1  = new Taxi("Pq-327","Toyota Yaris",c1);
        Taxi t2  = new Taxi("Bq-3784","Hyundai",c2);
        t2.print();
        System.out.println("=======");
        t1.print();
    }
    
}
