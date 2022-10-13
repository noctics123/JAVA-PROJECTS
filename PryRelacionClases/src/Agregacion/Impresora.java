/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agregacion;

/**
 *
 * @author Ruben
 */
public class Impresora {
    String tipo;
    
    public Impresora(){
        
    }
    public Impresora(String tipo){
        this.tipo=tipo;
    }
    public void print(Documentos doc){
        System.out.println("Impresora de tipo ");
        System.out.println("Documento "+doc.getTitulo()+"\t paginas "+doc.getPaginas());
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
