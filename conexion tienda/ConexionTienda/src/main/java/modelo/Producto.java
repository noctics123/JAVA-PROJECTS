
package modelo;

public class Producto extends Marca{
        private String codp;
        private String codt;
        private String descripcion;
        private double precio;
        private int stock;
     
    public String getCodp() {
        return codp;
    }

    public void setCodp(String codp) {
        this.codp = codp;
    }

    public String getCodt() {
        return codt;
    }

    public void setCodt(String codt) {
        this.codt = codt;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
        
        
}
