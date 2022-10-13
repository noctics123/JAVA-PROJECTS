
package clases;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class Lib01 {
     static SimpleDateFormat fd=new SimpleDateFormat("yyyy-MM-dd");
    public static void msg(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }
    //la fecha actual en letras
    public static String hoy(){
        SimpleDateFormat sd=new SimpleDateFormat("EEEE  dd ' de ' MMMM ' del ' yyyy ");
        Date t=new Date();
        return sd.format(t);
    }
    //pasando una fecha como cadena mostrar el nombre del dia
    public static String hoy(String cad){
       try{
           Date t=fd.parse(cad);
           SimpleDateFormat sd=new SimpleDateFormat("EEEE");
           return sd.format(t);
       }catch(Exception ex){
           return "fecha incorrecta";
       } 
    }
   //pasando dos fechas como cadena obtener los dias
   public static long difFecha(String cad1, String cad2){
       try{
          Date t1=fd.parse(cad1); //convertir las cadenas a fechas
          Date t2=fd.parse(cad2);
           Calendar c1=Calendar.getInstance();
           Calendar c2=Calendar.getInstance();
           c1.setTime(t1); c2.setTime(t2);
           long res=(c2.getTimeInMillis()-c1.getTimeInMillis())/(1000*60*60*24);
           return res;
       }catch(Exception ex){
           return 0;
       }
       
   } 
   //pasando la fecha como cadena y la cantidad de dias devuelva la fecha nueva
   
   //de la fecha ctual obtner la cantidad de dias que faltan para terminar el anio
   
    
    
    
    
}
