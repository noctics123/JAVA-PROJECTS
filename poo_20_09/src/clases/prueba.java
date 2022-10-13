
package clases;

public class prueba {

    public static void main(String[] args) {
        System.out.println(Lib01.hoy());
        System.out.println("dia  "+Lib01.hoy("2021-08-31"));
        String f1="2021-08-20", f2="2021-09-20";
        System.out.println(" dias  "+Lib01.difFecha(f1, f2));
        
    }
    
}
