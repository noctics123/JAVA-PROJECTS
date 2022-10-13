/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso1;

/**
 *
 * @author Ruben
 */
public class Postgrado extends Alumno {

    public Postgrado(String nom, int exp, int exf) {
        super(nom, exp, exf);
    }

    
    @Override
    public double prome() {
        return (super.getExp()+super.getExf())/2;
    }
    
    public void print(){
        System.out.println("Postgrado");
        super.print();
    }
    
}
