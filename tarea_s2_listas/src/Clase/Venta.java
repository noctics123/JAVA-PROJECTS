/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

/**
 *
 * @author Ruben
 */
public class Venta {
   private int numeroVenta;
   private int tipo;
   private int area;
   private double costo;
   private int año;
   private String nombreC;
   
    static int cuenta=10001;
    
    public Venta(){
        
    }
     public Venta(int tipo, int area, double costo, int año, String nombre) {
        this.numeroVenta = cuenta;
        this.tipo=tipo;
        this.area = area;
        this.costo=costo;
        this.año=año;
        this.nombreC=nombre;
        cuenta++;
    }
     
      public double cuotaInicial(){
         return 0.1*costo;
    }
      public double Interes(){
          return 0.02*año*costo;
      }
      public double CuotaMensual(){
          return (0.9*costo+(Interes()/año))/12;
      }
      public double Saldo(){
          return costo-CuotaMensual();
      }

    public int getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public static int getCuenta() {
        return cuenta;
    }

    public static void setCuenta(int cuenta) {
        Venta.cuenta = cuenta;
    }
      
   
}
