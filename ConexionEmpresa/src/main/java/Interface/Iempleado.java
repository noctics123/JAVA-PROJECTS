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
public interface Iempleado {
    void adiciona(Empleado ep);
    void modifica(Empleado ep);
    void borra(int cod);
    Empleado busca(int d);
    List <Empleado> listado();
    List <Empleado> filtra(String cad);
}
