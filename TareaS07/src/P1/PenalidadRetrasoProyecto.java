/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P1;

/**
 *
 * @author Ruben
 */
public abstract class PenalidadRetrasoProyecto {
    double totalp=0;
    public abstract double cuotaPenalidadDias();
    
    public double pagoPenalidad(int dia){

        return cuotaPenalidadDias()*dia;
    }   
}
