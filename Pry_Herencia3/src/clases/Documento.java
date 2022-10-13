/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.text.DecimalFormat;

/**
 *
 * @author Ruben
 */
public class Documento {
       String nro;
    String fecha;
    double importe;
    static int cuenta=1;
    
    public Documento(String fecha, double importe){
        
        DecimalFormat sd = new DecimalFormat("00000");
        this.nro = sd.format(cuenta);
        this.fecha=fecha;
        this.importe=importe;
        cuenta++;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public static int getCuenta() {
        return cuenta;
    }

    public static void setCuenta(int cuenta) {
        Documento.cuenta = cuenta;
    }
    public String print(){
        String cad="Nro  :"+nro;
        cad+="\nFecha:"+fecha+"\n importe :"+importe;
        return cad;
    }
}
