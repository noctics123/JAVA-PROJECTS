/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso2;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author Ruben
 */
public class Lib01 {
    public static String hoy(){
        Date t = new Date();
        SimpleDateFormat sd= new SimpleDateFormat("EEEE dd ' de ' MMMM 'del' yyyy");
        return sd.format(t);
    }
}
