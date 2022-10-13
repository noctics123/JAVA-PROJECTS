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
public class prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ifigura f1 = new Circulo(3);
        Ifigura f2 = new Rectangulo(5,8);
        List<Ifigura> lis  = new ArrayList();
        lis.add(f2); lis.add(f1);
        lis.add(new Circulo(6));
        lis.add(new Rectangulo(4,11));
        //suma toda las areas de las figuras 
        double sm=0;
        for(Ifigura x:lis){
            sm=sm+x.area();
        }
        System.out.println("El area total es: "+sm);
    }
    
}
