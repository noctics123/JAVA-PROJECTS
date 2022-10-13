/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Ruben
 */
public class Boleta extends Documento {
    
    private String cliente;
    
    public Boleta(String fecha, double importe, String cliente){
        super(fecha,importe);
        this.cliente=cliente;
    }
    public String print(){
        String cad =super.print()+"\n Cliente :"+cliente;
        return cad;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
