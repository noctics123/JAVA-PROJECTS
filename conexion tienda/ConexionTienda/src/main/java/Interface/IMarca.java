
package Interface;

import java.util.List;
import modelo.Marca;

public interface IMarca {
   void adicionaM(Marca m); 
   void modificaM(Marca m);
   void borraM(String id);
   Marca buscaM(String id);
   List<Marca> listadoM();
}
