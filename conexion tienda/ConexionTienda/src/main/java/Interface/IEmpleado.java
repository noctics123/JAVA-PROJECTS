
package Interface;

import java.util.List;
import modelo.Empleado;

public interface IEmpleado {
   void adicionaEp(Empleado ep); 
   void modificaEp(Empleado ep);
   void borraEp(String id);
   Empleado buscaUsuario(String id);
   Empleado buscaEp(String id);
   List<Empleado> listadoEp();
}
