/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P1;

/**
 *
 * @author Ruben
 */
public class Arborizacion extends CostoProyecto{

    double cantArboles;
    
    public Arborizacion() {
        
    }

    public Arborizacion(double cantArboles) {
        this.cantArboles = cantArboles;
    }

    
    @Override
    public double costoCantidadN() {
        return 500*cantArboles/12;
    }

    @Override
    public double costoCantidadC() {
        return 380*cantArboles/12;
    }

    @Override
    public double costoCantidadS() {
        return 380*cantArboles/12;
    }

    @Override
    public double cuotaPenalidadDias() {
        return 4600/5;
    }

    @Override
    public double pagoPenalidad(int dia) {
        return dia*cuotaPenalidadDias();
    }

    @Override
    public double resultado(String lugar) {
        return super.resultado(lugar);
    }

    public double getCantArboles() {
        return cantArboles;
    }

    public void setCantArboles(double cantArboles) {
        this.cantArboles = cantArboles;
    }

    

    
    
    
}
