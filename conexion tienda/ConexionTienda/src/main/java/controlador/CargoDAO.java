
package controlador;

import Interface.*;
import java.sql.*;
import java.util.*;
import modelo.*;
import util.MySQLConexion;

public class CargoDAO implements ICargo{

    @Override
    public List<Cargo> listadoCa() {
        Connection cn=MySQLConexion.getConexion();
        List<Cargo> lisCa=new ArrayList();
        try {
            String sql="SELECT codc,cargo FROM cargo";
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Cargo c=new Cargo();
                c.setCodc(rs.getString(1));
                c.setCargo(rs.getString(2));
                lisCa.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{ cn.close();}catch(Exception ex){}
        }
        return lisCa;
    }

}
