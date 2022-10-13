/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso1;

/**
 *
 * @author Ruben
 */
public class Circulo implements Ifigura{

double rad;

    public Circulo(double rad) {
        this.rad = rad;
    }



    @Override
    public double area() {
        return rad*rad*PI;
    }

    @Override
    public double perimetro() {
        return 2*PI*rad;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }
    
}
