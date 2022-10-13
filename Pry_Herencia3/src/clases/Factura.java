/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Ruben
 */
public class Factura extends Documento{
    String ruc;
    
    public Factura(String fecha, double importe, String ruc){
        super(fecha, importe);
        this.ruc=ruc;
    }
    public double igv(){
        return super.getImporte()*0.18;
    }
    public double total(){
        return super.getImporte()+igv();
    }
    public String print(){
        String cad="\n Ruc "+ruc+"\t igv"+igv()+"\t Total="+total();
        return cad;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
}
