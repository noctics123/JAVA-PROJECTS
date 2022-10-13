/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generalizacion;
import java.util.*;
/**
 *
 * @author Ruben
 */
class Cliente {
    int codc;
    String nombre;
    List<Factura> lista;
    static int cuenta=10;
    
    public Cliente(String nombre){
        this.codc=cuenta++;
        this.nombre=nombre;
        this.lista= new ArrayList();
    }
    
    void adicion(Factura fac) {
        lista.add(fac);
    }
    public void print(){
        System.out.println("codigo "+codc);
        System.out.println("nombre "+nombre);
        double sm=0;
        System.out.println("nro\tFecha\t\tImporte");
        for(Factura x:lista){
            sm=sm+x.getMonto();
            System.out.println(x.getNrofac()+"\t"+x.getFecha()+"\t"+x.getMonto());
        }
        System.out.println("total monto "+sm);
    }

    public int getCodc() {
        return codc;
    }

    public void setCodc(int codc) {
        this.codc = codc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Factura> getLista() {
        return lista;
    }

    public void setLista(List<Factura> lista) {
        this.lista = lista;
    }

    public static int getCuenta() {
        return cuenta;
    }

    public static void setCuenta(int cuenta) {
        Cliente.cuenta = cuenta;
    }
    
}
