/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso1;
import java.util.*;
/**
 *
 * @author Ruben
 */
public class Ejemplo1 {
    interface proceso{
        double calculo(double x);
    }
    interface figura{
        double area(double a,double b, double c);
    }
    
    public static void main (String[] args){
        proceso c= (double a)-> a*a;
        proceso r= (double b)-> Math.sqrt(b);
        figura p = (double x, double y, double z)->{
            double sp=(x+y+z)/2;
            double ar=Math.sqrt(sp*(sp-x)*(sp-y)*(sp-z));
            System.out.println("el area es "+ar);
            return ar;
        };
        figura piramide = (double x, double y , double z)->{
            double vol=x*y*z;
            System.out.println("El volumen de la piramide es: "+vol);
            return vol;
        };
        int z=20;
        System.out.println("cuadrado "+c.calculo(z));
        System.out.println("raiz "+r.calculo(z));
        System.out.println(p.area(5, 8, 7));
        System.out.println(piramide.area(1, 2, 3));
    }
}
