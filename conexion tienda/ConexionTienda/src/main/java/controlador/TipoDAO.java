
package controlador;

import Interface.*;
import java.sql.*;
import java.util.*;
import modelo.*;
import util.MySQLConexion;

public class TipoDAO implements ITipo{

    @Override
    public List<Tipo> listadoT() {
        Connection cn=MySQLConexion.getConexion();
        List<Tipo> lisT=new ArrayList();
        try {
            String sql="SELECT codt,tipo FROM tipo";
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Tipo t=new Tipo();
                t.setCodt(rs.getString(1));
                t.setTipo(rs.getString(2));
                lisT.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{ cn.close();}catch(Exception ex){}
        }
        return lisT;
    }

}
