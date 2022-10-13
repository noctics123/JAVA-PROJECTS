
package controlador;

import Interface.IMarca;
import java.sql.*;
import java.util.*;
import modelo.*;
import util.MySQLConexion;

public class MarcaDAO implements IMarca{

    @Override
    public void adicionaM(Marca m) {
        Connection cn=MySQLConexion.getConexion();
        try {
//            String sql="INSERT INTO marca(marca) VALUES(?,?)";
//            PreparedStatement st=cn.prepareStatement(sql);
            String sql="{call adicionM(?)}";
            CallableStatement st=cn.prepareCall(sql);
            st.setString(1, m.getMarca());
            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
        
    }

    @Override
    public void modificaM(Marca m) {
        Connection cn=MySQLConexion.getConexion();
        try {
            String sql="UPDATE marca SET marca=? WHERE codm=?";
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1,m.getMarca());
            st.setString(2, m.getCodm());
            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
    }

    @Override
    public void borraM(String id) {
        Connection cn=MySQLConexion.getConexion();
        try {
            String sql="DELETE FROM marca WHERE codm=?";
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
    }

    @Override
    public Marca buscaM(String id) {
        Connection cn=MySQLConexion.getConexion();
        Marca m=null;
        try {
            String sql="SELECT codm,marca FROM marca";
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                m=new Marca();
                m.setCodm(rs.getString(1));
                m.setMarca(rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
        return m;
    }

    @Override
    public List<Marca> listadoM() {
        Connection cn=MySQLConexion.getConexion();
        List<Marca> lisM=new ArrayList();
        try {
            String sql="SELECT codm,marca FROM marca";
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Marca m=new Marca();
                m.setCodm(rs.getString(1));
                m.setMarca(rs.getString(2));
                lisM.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
        return lisM;
    }

}
