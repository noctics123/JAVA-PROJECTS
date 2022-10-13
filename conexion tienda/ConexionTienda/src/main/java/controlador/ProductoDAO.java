
package controlador;

import Interface.IProducto;
import java.sql.*;
import java.util.*;
import modelo.*;
import util.MySQLConexion;

public class ProductoDAO implements IProducto{

    @Override
    public void adicionaP(Producto p) {
        Connection cn=MySQLConexion.getConexion();
        try {
            String sql="{call adicionP(?,?,?,?,?)}";
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, p.getCodm());
            st.setString(2, p.getCodt());
            st.setString(3, p.getDescripcion());
            st.setDouble(4, p.getPrecio());
            st.setInt(5, p.getStock());
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
    public void modificaP(Producto p) {
        Connection cn=MySQLConexion.getConexion();
        try {
            String sql="UPDATE producto SET codm=?,codt=?,descripcion=?,precio=?,stock=? WHERE codp=?";
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, p.getCodm());
            st.setString(2, p.getCodt());
            st.setString(3, p.getDescripcion());
            st.setDouble(4, p.getPrecio());
            st.setInt(5, p.getStock());
            st.setString(6, p.getCodp());
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
    public void borraP(String id) {
        Connection cn=MySQLConexion.getConexion();
        try {
            String sql="DELETE FROM producto WHERE codp=?";
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
    public Producto buscaP(String id) {
        Connection cn=MySQLConexion.getConexion();
        Producto p=null;
        try {
            String sql="SELECT codp,codm,codt,descripcion,precio,stock FROM producto WHERE codp=?";
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                p=new Producto();
                p.setCodp(rs.getString(1));
                p.setCodm(rs.getString(2));
                p.setCodt(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getDouble(5));
                p.setStock(rs.getInt(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
        return p;
    }

    @Override
    public List<Producto> listadoP() {
        Connection cn=MySQLConexion.getConexion();
        List<Producto> lisP=new ArrayList();
        try {
            String sql="SELECT codp,codm,codt,descripcion,precio,stock FROM producto";
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Producto p=new Producto();
                p.setCodp(rs.getString(1));
                p.setCodm(rs.getString(2));
                p.setCodt(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getDouble(5));
                p.setStock(rs.getInt(6));
                lisP.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
        return lisP;
    }

}
