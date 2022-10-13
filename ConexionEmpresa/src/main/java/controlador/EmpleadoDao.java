/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import Interface.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.*;
import modelo.*;
import util.*;
/**
 *
 * @author Ruben
 */
public class EmpleadoDao implements Iempleado{

    @Override
    public void adiciona(Empleado ep) {
        Connection cn=MySQLConexion.getConexion();
        try{
            String sql = "insert into empleado(nome,horas,tarifa) values(?,?,?);";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, ep.getNombre());
            st.setInt(2, ep.getHoras());
            st.setDouble(3, ep.getTarifa());
            st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{cn.close();}catch(Exception z){}
        }
    }

    @Override
    public void modifica(Empleado ep) {
        Connection cn=MySQLConexion.getConexion();
        try{
            String sql = "update empleado set nome=?, horas=?, tarifa=? where code=?";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, ep.getNombre());
            st.setInt(2, ep.getHoras());
            st.setDouble(3, ep.getTarifa());
            st.setInt(4, ep.getCode());
            st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{cn.close();}catch(Exception z){}
        }
    }

    @Override
    public void borra(int id) {
        Connection cn=MySQLConexion.getConexion();
        try{
            String sql = "delete from empleado where code=?";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{cn.close();}catch(Exception z){}
        }
    }

    @Override
    public Empleado busca(int id) {
        Connection cn=MySQLConexion.getConexion();
        Empleado ep=null;
        try{
            String sql="selec code,nome,horas,tarifa from empleado where code=?";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                ep=new Empleado();
                 ep.setCode(rs.getInt(1));
                 ep.setNombre(rs.getString(2));
                 ep.setHoras(rs.getInt(3));
                 ep.setTarifa(rs.getDouble(4)); 
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{cn.close();}catch(Exception z){}
        }
        return null;
    }

    @Override
    public List<Empleado> listado() {
         Connection cn=MySQLConexion.getConexion();
         List<Empleado> lis = new ArrayList();
         try{
             String sql="Select code,nome,horas,tarifa from empleado";
             PreparedStatement st = cn.prepareStatement(sql);
             ResultSet rs =st.executeQuery();
             while(rs.next()){
                 Empleado ep= new Empleado();
                 ep.setCode(rs.getInt(1));
                 ep.setNombre(rs.getString(2));
                 ep.setHoras(rs.getInt(3));
                 ep.setTarifa(rs.getDouble(4));  
             }
         }catch(Exception ex){
            ex.printStackTrace();
            }finally{
                try{cn.close();}catch(Exception z){}
            }
         return lis;
    }

    @Override
    public List<Empleado> filtra(String cad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
