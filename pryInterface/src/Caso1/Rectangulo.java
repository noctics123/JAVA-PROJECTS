/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso1;

/**
 *
 * @author Ruben
 */
public class Rectangulo implements Ifigura{
    double base;
    double alt;

    public Rectangulo(double base, double alt) {
        this.base = base;
        this.alt = alt;
    }

    
    @Override
    public double area() {
        return base*alt;
    }

    @Override
    public double perimetro() {
        return 2*(base+alt);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }
    
}
