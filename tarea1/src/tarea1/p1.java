/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1;

/**
 *
 * @author Ruben
 */
public class p1 {
    
    private int cantidad;
    private String producto;
    public p1(){
        
    }
    
    public p1(int cant, String prod){
        this.cantidad=cant;
        this.producto=prod;
    }
    
    public double precioProducto(){
        
        double prec=0;
        
        if(getProducto().equals("cocina")){
            prec=300;
        }
        if(getProducto().equals("filmadora")){
            prec=1400;
        }
        if(getProducto().equals("radio")){
            prec=320;
        }
        if(getProducto().equals("licuadora")){
            prec=160;
        }
        if(getProducto().equals("refrigeradora")){
            prec=1800;
        }
        if(getProducto().equals("seleccione")){
            prec=0;
        }
        return prec;
    }
    
    public double impuesto(){
        
        double imp=0;
        
        imp=precioProducto()*0.18*getCantidad();
        
        return imp;
    }
    
    public double precioTotal(){
        
        double precT=0;
        
        precT=precioProducto()*getCantidad();
        
        return precT;
    }
    
    public double precioNeto(){
        
        double precN=0;
        
        precN=precioTotal()+impuesto();
        
        return precN;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }
  
}
