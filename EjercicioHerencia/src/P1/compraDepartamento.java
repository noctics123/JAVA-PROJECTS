/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P1;

/**
 *
 * @author Ruben
 */
public class compraDepartamento {
    
    int tipo;
    int años;
    static int cuenta=10001;
    
    public compraDepartamento(){
        
    }
    
    public compraDepartamento(int t, int a){
        this.años=a;
        this.tipo=t;
        cuenta++;
    }

    
    public double costo(){
        double c=0;
        switch(tipo){
            case 1: c=80000;break;
            case 2: c=90000;break;
            case 3: c=120000;break;
            case 4: c=180000;break;
            
        }
        return c;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public static int getCuenta() {
        return cuenta;
    }

    public static void setCuenta(int cuenta) {
        compraDepartamento.cuenta = cuenta;
    }
    
    public double cuotaInicial(){
        return 0.1*costo();
    }
    
    public double interes(){
        return 0.02*años*costo();
    }
    public double saldo(){
        
        return costo()-cuotaMensual();
    }
    
    public double cuotaMensual(){
        return (costo()/(años*12))+(interes()/(años*12));
    }
    
    
}
