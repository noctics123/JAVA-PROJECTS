package clases;

public class Triangulo {
private double ca;
private double cb;
private double cc;
//metodos
public boolean valida(){
    if(ca+cb>cc && cb+cc>ca && ca+cc>cb)
        return true;
    else 
        return false;
}
//ca=7  cb=15  cc=5 false
//ca=7   cb=8  cc=5 true
public double area(){
    double ar, sp;
    sp=(ca+cb+cc)/2;
    ar=Math.sqrt(sp*(sp-ca)*(sp-cb)*(sp-cc));
    return ar;
}
public String tipo(){
    String cad;
    if(ca==cb && cb==cc && cc==ca) cad="equilatero";
    else if(ca!=cb && cb!=cc && cc!=ca) cad="escaleno";
    else    cad="isoceles";
    return cad;
}
//los encapsulamiento alt+insert

    public double getCa() {
        return ca;
    }

    public void setCa(double ca) {
        this.ca = ca;
    }

    public double getCb() {
        return cb;
    }

    public void setCb(double cb) {
        this.cb = cb;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }


}
