/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ruben
 */
public class Pasajero {
    int boleto=1;
    String nombre;
    int tipo;
    static int con2=1;
    Viajes via;

    public Pasajero(String nombre, int tipo, Viajes via) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.via = via;
        via.adicion(this);
        this.boleto=con2++;
    }

    public Pasajero() {
        
    }
    
     public String tipo(){
        String res="";
        switch(tipo){
            case 1: res="nino";break;
            case 2: res="estudiante";break;
            case 3: res="adulto";break;
            default: res="no hay";break;
        }
        return res;
    }

    public int getBoleto() {
        return boleto;
    }

    public void setBoleto(int boleto) {
        this.boleto = boleto;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Viajes getVia() {
        return via;
    }

    public void setVia(Viajes via) {
        this.via = via;
    }

    
}
