/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso1;

/**
 *
 * @author Ruben
 */
public abstract class Alumno {
    private String nom;
    private int exp;
    private int exf;

    public Alumno(String nom, int exp, int exf) {
        this.nom = nom;
        this.exp = exp;
        this.exf = exf;
    }
    public abstract double prome();
    public String obser(){
        return prome()>=11.5?"Aprobado":"Desaprobado";
    }
    public void print(){
        System.out.println("Nombre "+nom);
        System.out.println("Parcial "+exp);
        System.out.println("Final "+exf);
        System.out.println("Promedio "+prome());
        System.out.println("Observacion "+obser());
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getExf() {
        return exf;
    }

    public void setExf(int exf) {
        this.exf = exf;
    }
    

    
}
