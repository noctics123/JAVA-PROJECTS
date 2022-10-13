/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;

import modelo.Empleado;

/**
 *
 * @author Ruben
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadoDao obj = new EmpleadoDao();
        Empleado x = new Empleado(0,"Rosa Perez",34,26.5);
        Empleado y = new Empleado (102,"Pepe Luna",50,30);
        //obj.adiciona(x);
        obj.modifica(y);
    }
    
}
