
package controlador;

import Interface.ICliente;
import java.sql.*;
import java.util.*;
import modelo.*;
import util.MySQLConexion;

public class ClienteDAO implements ICliente{

    @Override
    public void adicionaC(Cliente c) {
        Connection cn=MySQLConexion.getConexion();
        try {
            String sql="INSERT INTO cliente(dni,nomc,apec,celular,correo,direccion) VALUES (?,?,?,?,?,?)";
            PreparedStatement st=cn.prepareStatement(sql);
            st.setInt(1, c.getDni());
            st.setString(2, c.getNombre());
            st.setString(3, c.getApellido());
            st.setInt(4, c.getCelular());
            st.setString(5, c.getCorreo());
            st.setString(6, c.getDirección());
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
    public void modificaC(Cliente c) {
        Connection cn=MySQLConexion.getConexion();
        try {
            String sql="UPDATE cliente SET nomc=?,apec=?,celular=?,correo=?,direccion=? WHERE dni=?";
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, c.getNombre());
            st.setString(2, c.getApellido());
            st.setInt(3, c.getCelular());
            st.setString(4, c.getCorreo());
            st.setString(5, c.getDirección());
            st.setInt(6, c.getDni());
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
    public void borraC(int id) {
        Connection cn=MySQLConexion.getConexion();
        try {
            String sql="DELETE FROM cliente WHERE dni=?";
            PreparedStatement st=cn.prepareStatement(sql);
            st.setInt(1, id);
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
    public Cliente buscaC(int id) {
        Connection cn=MySQLConexion.getConexion();
        Cliente c=null;
        try {
            String sql="SELECT dni,nomc,apec,celular,correo,direccion FROM cliente";
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                c=new Cliente();
                c.setDni(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setCelular(rs.getInt(4));
                c.setCorreo(rs.getString(5));
                c.setDirección(rs.getString(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{ cn.close();}catch(Exception ex){}
        }
        return c;
    }

    @Override
    public List<Cliente> listadoC() {
        Connection cn=MySQLConexion.getConexion();
        List<Cliente> lisC=new ArrayList();
        try {
            String sql="SELECT dni,nomc,apec,celular,correo,direccion FROM cliente";
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Cliente c=new Cliente();
                c.setDni(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setCelular(rs.getInt(4));
                c.setCorreo(rs.getString(5));
                c.setDirección(rs.getString(6));
                lisC.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{ cn.close();}catch(Exception ex){}
        }
        return lisC;
    }

}
