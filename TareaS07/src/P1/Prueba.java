/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package P1;

/**
 *
 * @author Ruben
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carreteras c = new Carreteras(12);
        
        double t= c.resultado("NORTE");
        double v= c.resultado("CENTRO");
        double u= c.resultado("SUR");
        
        double p = c.cuotaPenalidadDias();
        
        double r = c.pagoPenalidad(10);
        
        
        System.out.println("EL total a pagar es :$"+t);
        System.out.println("\nEL total a pagar es: $"+v);
        System.out.println("\nEL total a pagar es: $"+u);
        System.out.println("\n============");
        System.out.println("\nEL pago por penalidad es: S/."+r);
    }
    
}
