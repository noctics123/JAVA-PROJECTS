/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P1;
/**
 *
 * @author Ruben
 */
public abstract class CostoProyecto extends PenalidadRetrasoProyecto {
    double totalp=0;
    
    public abstract double costoCantidadN();
    public abstract double costoCantidadC();
    public abstract double costoCantidadS();
    
    @Override
    public double cuotaPenalidadDias() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public double pagoPenalidad(int dia) {
        return super.pagoPenalidad(dia);
    }

    public CostoProyecto() {
    }
    
    public double resultado(String lugar){
        
        double cf=0;
        
        if(lugar.equals("NORTE")){
            cf=costoCantidadN();
        }
        else if(lugar.equals("CENTRO")){
            cf=costoCantidadC();
        }
        else if(lugar.equals("SUR")){
            cf=costoCantidadS();
        }
        return cf;
    }
    
    
}
