/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Caso2;

/**
 *
 * @author Ruben
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Negocio obj = new Negocio();
        /*for(Empleado x:obj.getLis()){
            System.out.println(x.getCode());
        }*/
        obj.getLis().stream().forEach(x->System.out.println(x.getCode()+"\t"+x.getNome()+"\t"+x.getSueldo()));
    }
    
}
