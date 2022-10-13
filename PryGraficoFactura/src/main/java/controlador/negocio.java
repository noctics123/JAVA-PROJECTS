/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.*;
import java.sql.*;
import modelo.*;
import util.MySQLConexion;
/**
 *
 * @author Ruben
 */
public class negocio {
    public List<reporte1> lisMes(int an) {
        Connection cn=MySQLConexion.getConexion();
        List<reporte1> lista=new ArrayList();
        try{String sql="{call spmes(?)}";
        CallableStatement st=cn.prepareCall(sql);
        st.setInt(1, an);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
            reporte1 p=new reporte1();
            p.setMes(rs.getInt(1));
            p.setCantidad(rs.getInt(2));
            p.setTotal(rs.getDouble(3));
            lista.add(p);
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex){
            }
        }return lista;
    }
    
    public List<reporte1> lisProducto(int an) {
        Connection cn=MySQLConexion.getConexion();
        List<reporte1> lista=new ArrayList();
        try{String sql="{call mvent(?)}";
        CallableStatement st=cn.prepareCall(sql);
        st.setInt(1, an);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
            reporte1 p=new reporte1();
            p.setNombre_articulo(rs.getString(1));
            p.setCantidad(rs.getInt(2));
            p.setTotal(rs.getDouble(3));
            lista.add(p);
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex){
            }
        }return lista;
    }
    
     public List<reporte1> lisProducto2() {
        Connection cn=MySQLConexion.getConexion();
        List<reporte1> lista=new ArrayList();
        try{String sql="{call totv()}";
        CallableStatement st=cn.prepareCall(sql);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
            reporte1 p=new reporte1();
            p.setAño(rs.getInt(1));
            p.setTotal(rs.getDouble(2));
            lista.add(p);
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex){
            }
        }return lista;
    }
}
