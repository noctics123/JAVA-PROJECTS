
package Interface;

import java.util.List;
import modelo.Producto;

public interface IProducto {
   void adicionaP(Producto p); 
   void modificaP(Producto p);
   void borraP(String id);
   Producto buscaP(String id);
   List<Producto> listadoP();
}
