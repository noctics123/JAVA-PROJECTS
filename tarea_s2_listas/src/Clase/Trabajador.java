/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

/**
 *
 * @author Ruben
 */
public class Trabajador {
    private int codigo;
   private String nombre;
   private double sueldo;

   static int cuenta=100;
   
   public Trabajador(){
       
   }
  public Trabajador(String nombre, double sueldo) {
        this.codigo = cuenta;
        this.nombre = nombre;
        this.sueldo = sueldo;
        cuenta++;
    }
  public double impuesto(){
         return sueldo>2500?(sueldo-2500)*0.08:0;
    }
    
    public double total(){
        return sueldo-impuesto();
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getCuenta() {
        return cuenta;
    }

    public static void setCuenta(int cuenta) {
        Trabajador.cuenta = cuenta;
    }
    

}
