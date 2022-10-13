
package controlador;

import Interface.IEmpleado;
import java.sql.*;
import java.util.*;
import modelo.*;
import util.MySQLConexion;

public class EmpleadoDAO implements IEmpleado{

    @Override
    public void adicionaEp(Empleado ep) {
        Connection cn=MySQLConexion.getConexion();
        try {
//            String sql="INSERT INTO empleado(nome,apee,dni,celular,correo,codc,usuario,contraseña) VALUES (?,?,?,?,?,?,?,?)";
//            PreparedStatement st=cn.prepareStatement(sql);
            String sql="{call adicionE(?,?,?,?,?,?,?,?)}";
            CallableStatement st=cn.prepareCall(sql);
            st.setString(1, ep.getNombre());
            st.setString(2, ep.getApellido());
            st.setInt(3, ep.getDni());
            st.setInt(4, ep.getCelular());
            st.setString(5, ep.getCorreo());
            st.setString(6, ep.getCodc());
            st.setString(7, ep.getUsuario());
            st.setString(8, ep.getContraseña());
            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception z){}//cerrar la conexión
        }
    }

    @Override
    public void modificaEp(Empleado ep) {
        Connection cn=MySQLConexion.getConexion();
        try {
            String sql="UPDATE empleado SET nome=?,apee=?,celular=?,correo=?,codc=?,usuario=?,contraseña=? WHERE code=?";
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, ep.getNombre());
            st.setString(2, ep.getApellido());
            st.setInt(3, ep.getCelular());
            st.setString(4, ep.getCorreo());
            st.setString(5, ep.getCodc());
            st.setString(6, ep.getUsuario());
            st.setString(7, ep.getContraseña());
            st.setString(8, ep.getCode());
            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();//imprime en consola que error ha ocurrido
        }finally{//se ejecuta tengo o no tenga errores
            try{
                cn.close();
            }catch(Exception z){}//cerrar la conexión
        }
    }

    @Override
    public void borraEp(String id) {
        Connection cn=MySQLConexion.getConexion();
        try {
            String sql="DELETE FROM empleado WHERE code=?";
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();//imprime en consola que error ha ocurrido
        }finally{//se ejecuta tengo o no tenga errores
            try{
                cn.close();
            }catch(Exception z){}//cerrar la conexión
        }
    }

    @Override
    public Empleado buscaEp(String id) {
        Connection cn=MySQLConexion.getConexion();
        Empleado ep=null;
        try {
            String sql="SELECT code,nome,apee,dni,celular,correo,codc,usuario,contraseña FROM empleado";
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                ep=new Empleado();
                ep.setCode(rs.getString(1));
                ep.setNombre(rs.getString(2));
                ep.setApellido(rs.getString(3));
                ep.setDni(rs.getInt(4));
                ep.setCelular(rs.getInt(5));
                ep.setCorreo(rs.getString(6));
                ep.setCodc(rs.getString(7));
                ep.setUsuario(rs.getString(8));
                ep.setContraseña(rs.getString(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{ cn.close();}catch(Exception ex){}
        }
        return ep;
    }

    @Override
    public List<Empleado> listadoEp() {
        Connection cn=MySQLConexion.getConexion();
        List<Empleado> lisEp=new ArrayList();
        try {
            String sql="SELECT code,nome,apee,dni,celular,correo,codc,usuario,contraseña FROM empleado";
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Empleado ep=new Empleado();
                ep.setCode(rs.getString(1));
                ep.setNombre(rs.getString(2));
                ep.setApellido(rs.getString(3));
                ep.setDni(rs.getInt(4));
                ep.setCelular(rs.getInt(5));
                ep.setCorreo(rs.getString(6));
                ep.setCodc(rs.getString(7));
                ep.setUsuario(rs.getString(8));
                ep.setContraseña(rs.getString(9));
                lisEp.add(ep);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{ cn.close();}catch(Exception ex){}
        }
        return lisEp;
    }

    @Override
    public Empleado buscaUsuario(String id) {
       Connection cn=MySQLConexion.getConexion();
        Empleado ep=null;
        try {
            String sql="SELECT code,nome,apee,dni,celular,correo,codc,usuario,contraseña FROM empleado WHERE usuario=?";
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                ep=new Empleado();
                ep.setCode(rs.getString(1));
                ep.setNombre(rs.getString(2));
                ep.setApellido(rs.getString(3));
                ep.setDni(rs.getInt(4));
                ep.setCelular(rs.getInt(5));
                ep.setCorreo(rs.getString(6));
                ep.setCodc(rs.getString(7));
                ep.setUsuario(rs.getString(8));
                ep.setContraseña(rs.getString(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{ cn.close();}catch(Exception ex){}
        }
        return ep;
    }

}