/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generalizacion;

/**
 *
 * @author Ruben
 */
public class Factura {
    int nrofac;
    String fecha;
    double monto;
    Cliente cli;
    static int cuenta=1000;
    
    public Factura(String fecha, double monto, Cliente cli){
        this.nrofac=cuenta++;
        this.fecha=fecha;
        this.monto=monto;
        this.cli=cli;
        cli.adicion(this);
    }

    public int getNrofac() {
        return nrofac;
    }

    public void setNrofac(int nrofac) {
        this.nrofac = nrofac;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public static int getCuenta() {
        return cuenta;
    }

    public static void setCuenta(int cuenta) {
        Factura.cuenta = cuenta;
    }
}
