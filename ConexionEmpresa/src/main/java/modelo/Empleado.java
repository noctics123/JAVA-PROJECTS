/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ruben
 */
public class Empleado {
    private int code;
    private String nombre;
    private int horas;
    private double tarifa;

    public Empleado() {
    }
    
    
    
    public Empleado(int code, String nombre, int horas, double tarifa) {
        this.code = code;
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }
    
    public double pago(){
        return horas*tarifa;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    
}
