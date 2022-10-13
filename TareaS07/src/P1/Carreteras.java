/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P1;

/**
 *
 * @author Ruben
 */
public class Carreteras extends CostoProyecto {
    
    double cantKilometros;

    public Carreteras() {
    }
    
    

    public Carreteras(double cantKilometros) {
        this.cantKilometros = cantKilometros;
    }
    
    
    
    @Override
    public double costoCantidadN() {
        return 10000*cantKilometros;
    }

    @Override
    public double costoCantidadC() {
        return 8700*cantKilometros;
    }

    @Override
    public double costoCantidadS() {
        return 9200*cantKilometros;
    }

    @Override
    public double cuotaPenalidadDias() {
        return 4600/7;
    }

    @Override
    public double pagoPenalidad(int dia) {
        return dia*cuotaPenalidadDias();
    }

    @Override
    public double resultado(String lugar) {
        return super.resultado(lugar);
    }

    
    public double getResultado(String lugar){
        return resultado(lugar);
    }
    
    
    public double getCantKilometros() {
        return cantKilometros;
    }

    public void setCantKilometros(double cantKilometros) {
        this.cantKilometros = cantKilometros;
    }
    
    
}
