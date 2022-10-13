/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ruben
 */
public class Factura {
   private String codb;//codigo boleta
   private String codmp;//codigo metodo pago
   private String fecha;// fecha
   private int dni;
   private String code;//codigoempleado
   private double subtotal; //subtotal de la boleta
   private double igv;
   private double total;

    public String getCodb() {
        return codb;
    }

    public void setCodb(String codb) {
        this.codb = codb;
    }

    public String getCodmp() {
        return codmp;
    }

    public void setCodmp(String codmp) {
        this.codmp = codmp;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
