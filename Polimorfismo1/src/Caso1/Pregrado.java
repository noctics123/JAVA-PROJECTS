/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso1;

/**
 *
 * @author Ruben
 */
public class Pregrado extends Alumno {

    public Pregrado(String nom, int exp, int exf) {
        super(nom, exp, exf);
    }

    
    @Override
    public double prome() {
        return super.getExp()*0.3+super.getExf()*0.7;
    }
    
    public void print(){
        System.out.print("Pregrado");
        super.print();
    }
    
    
    
}
