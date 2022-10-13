/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asociacion;

/**
 *
 * @author Ruben
 */
public class Taxi {
    String placa;
    String modelo;
    Chofer cho;

    public Taxi(){
        
    }
    public Taxi(String placa, String modelo, Chofer cho){
        this.placa=placa;
        this.modelo=modelo;
        this.cho= cho;
        
    }
    public void print(){
        System.out.println("placa "+placa+"\t modelo "+modelo);
        System.out.println("conducido por "+cho.getNombre()+"\t con brevete "+cho.getBrevete());
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Chofer getCho() {
        return cho;
    }

    public void setCho(Chofer cho) {
        this.cho = cho;
    }
}


