/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P1;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author Ruben
 */
public class Registro {
    int cod;
    public static int num=1;
    String nom,ubic, fechai,fechaf,tipo;
    double costoE,costoF;
    static SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
    
    List<Carreteras>lista;
    List<Arborizacion>lista2;

    public Registro() {
    }
    
    
    
    public Registro(String nom, String tip, String ubic, String fechai, String fechaf, double costoE, double costoF) {
        this.nom = nom;
        this.ubic = ubic;
        this.tipo=tip;
        this.fechai = fechai;
        this.fechaf = fechaf;
        if(tipo.equals("CARRETERAS")){
            this.lista = new ArrayList();
        }else if (tipo.equals("ARBORIZACION")){
          this.lista2 = new ArrayList();  
        }
        this.cod=num++;
        this.costoE=costoE;
        this.costoF=costoF;
    }
    
    public void adicionaCarreteras(Carreteras ct){
        lista.add(ct);
    }
    
    public void adicionaArborizacion(Arborizacion ar){
        lista2.add(ar);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCostoE() {
        return costoE;
    }

    public void setCostoE(double costoE) {
        this.costoE = costoE;
    }

    public double getCostoF() {
        return costoF;
    }

    public void setCostoF(double costoF) {
        this.costoF = costoF;
    }
    

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUbic() {
        return ubic;
    }

    public void setUbic(String ubic) {
        this.ubic = ubic;
    }

    public String getFechai() {
        return fechai;
    }

    public void setFechai(String fechai) {
        this.fechai = fechai;
    }

    public String getFechaf() {
        return fechaf;
    }

    public void setFechaf(String fechaf) {
        this.fechaf = fechaf;
    }

    public static SimpleDateFormat getSd() {
        return sd;
    }

    public static void setSd(SimpleDateFormat sd) {
        Registro.sd = sd;
    }

    public List<Carreteras> getLista() {
        return lista;
    }

    public void setLista(List<Carreteras> lista) {
        this.lista = lista;
    }

    public List<Arborizacion> getLista2() {
        return lista2;
    }

    public void setLista2(List<Arborizacion> lista2) {
        this.lista2 = lista2;
    }
    
    
    
}
