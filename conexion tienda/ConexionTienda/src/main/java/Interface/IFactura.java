/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;
import java.util.*;
import modelo.*;
/**
 *
 * @author Ruben
 */
public interface IFactura {
   void adicionaF(Factura c);
   void adicionaF2(String id, double st, double igv, double total);
   void adicionaD (Detalle d);
   void modificaF(Factura c);
   void borraC(int id);
   public String buscaF(int id, String fecha);
   public double buscarP(String p);
   public Factura buscarFactura(String id);
   public Detalle buscarDetalle(String id);
   List<Factura> listadoF();
   List<Detalle> listadoD();
   List<Detalle> listadoDPrint(String id);
}
