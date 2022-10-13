/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Caso2;

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
        Negocio obj= new Negocio();
        obj.ordSueldo();
        System.out.println("Codigo\tNombre\t\tSueldo");
        for (Empleado x:obj.getLis()){
            System.out.println(x.getCode()+"\t"+x.getNombre()+"\t"+x.getSueldo());
        }
    }
    
}
