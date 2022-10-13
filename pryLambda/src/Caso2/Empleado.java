/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso2;

/**
 *
 * @author Ruben
 */
public class Empleado {
    private int code;
    private String nome;
        private double sueldo;
        static int cuenta=10;
        public Empleado(String nome, double sueldo) {
        this.code = cuenta++;
        this.nome = nome;
        this.sueldo = sueldo;
        }
        public double afp(){
        return sueldo*0.11;
        }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

        
}
