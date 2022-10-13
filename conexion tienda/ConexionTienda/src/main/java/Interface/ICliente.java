
package Interface;

import java.util.*;
import modelo.*;

public interface ICliente {
   void adicionaC(Cliente c); 
   void modificaC(Cliente c);
   void borraC(int id);
   Cliente buscaC(int id);
   List<Cliente> listadoC();
}
