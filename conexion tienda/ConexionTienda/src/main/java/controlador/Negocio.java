/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;
import Interface.IFactura;
import util.MySQLConexion;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import modelo.*;
public class Negocio implements IFactura{
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    Date fe;
    Date fec;
    //agregarcompra
    @Override
    public void adicionaF(Factura f) {
        Connection cn=MySQLConexion.getConexion();
        try {
            String sql="{call adicionF(?,?,?,?,?,?,?)}";
            CallableStatement st=cn.prepareCall(sql);
            st.setString(1, f.getCodmp());
            fe = format.parse(f.getFecha());
            java.sql.Date dateSql;
            dateSql = new java.sql.Date(fe.getTime()); 
            st.setDate(2, dateSql);
            st.setInt(3, f.getDni());
            st.setString(4, f.getCode());
            st.setDouble(5, f.getSubtotal());
            st.setDouble(6, f.getIgv());
            st.setDouble(7, f.getTotal());
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
    public void modificaF(Factura c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borraC(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public List<Factura> listadoF() {
        Connection cn=MySQLConexion.getConexion();
        List<Factura> lisFac=new ArrayList();
        try {
            String sql="SELECT codb,codmp,fecha,dni,code,subtotal,igv,total FROM boleta";
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Factura f=new Factura();
                f.setCodb(rs.getString(1));
                f.setCodmp(rs.getString(2));
                f.setFecha(rs.getString(3));
                f.setDni(Integer.parseInt(rs.getString(4)));
                f.setCode(rs.getString(5));
                f.setSubtotal(Double.parseDouble(rs.getString(6)));
                f.setIgv(Double.parseDouble(rs.getString(7)));
                f.setTotal(Double.parseDouble(rs.getString(8)));
                lisFac.add(f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{ cn.close();}catch(Exception ex){}
        }
        return lisFac;
    
    }

    @Override
    public List<Detalle> listadoD() {
        Connection cn=MySQLConexion.getConexion();
        List<Detalle> lisDet=new ArrayList();
        try {
            String sql="SELECT codb,codp,cantidad FROM detboleta";
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Detalle d=new Detalle();
                d.setCodb(rs.getString(1));
                d.setCodp(rs.getString(2));
                d.setCantidad(Integer.parseInt(rs.getString(3)));
                lisDet.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{ cn.close();}catch(Exception ex){}
        }
        return lisDet;
    }

    @Override
    public String buscaF(int id, String fecha) {
        Connection cn=MySQLConexion.getConexion();
        String ae="";
        try {
            String sql="{call buscarF(?,?)}";
            CallableStatement st=cn.prepareCall(sql);
            
            String dni = String.valueOf(id);
            st.setString(1, dni);
            fec = format.parse(fecha);
            java.sql.Date dateSql;
            dateSql = new java.sql.Date(fe.getTime());
            st.setDate(2, dateSql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
            ae=rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
        return ae;
    }

    @Override
    public void adicionaD(Detalle d) {
        Connection cn=MySQLConexion.getConexion();
        try {
            String sql="INSERT INTO detboleta(codb,codp,cantidad) VALUES (?,?,?)";
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, d.getCodb());
            st.setString(2, d.getCodp());
            st.setInt(3, d.getCantidad());
            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{ cn.close();}catch(Exception ex){}
        }
    }

    @Override
    public double buscarP(String p) {
        Connection cn=MySQLConexion.getConexion();
        double pe = 0;
        try {
            String sql="{call buscarPre(?)}";
            CallableStatement st=cn.prepareCall(sql);
            String codp = p;
            st.setString(1, codp);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
            pe =  Double.parseDouble(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
        return pe;
    }

    @Override
    public void adicionaF2(String id, double subt, double igv, double total) {
        Connection cn=MySQLConexion.getConexion();
        try {
            String sql="{call adicionF2(?,?,?,?)}";
            CallableStatement st=cn.prepareCall(sql);
            st.setString(1, id);
            st.setDouble(2, subt);
            st.setDouble(3, igv);
            st.setDouble(4, total);
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
    public Factura buscarFactura(String id) {
       Connection cn=MySQLConexion.getConexion();
        Factura pe = new Factura();
        try {
            String sql="{call buscarFactura(?)}";
            CallableStatement st=cn.prepareCall(sql);
            st.setString(1, id);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
            pe.setCodb(rs.getString(1));
            pe.setCodmp(rs.getString(2));
            pe.setFecha(rs.getString(3));
            pe.setDni(Integer.parseInt(rs.getString(4)));
            pe.setCode(rs.getString(5));
            pe.setSubtotal(Double.parseDouble(rs.getString(6)));
            pe.setIgv(Double.parseDouble(rs.getString(7)));
            pe.setTotal(Double.parseDouble(rs.getString(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
        return pe;
    }

    @Override
    public Detalle buscarDetalle(String id) {
        Connection cn=MySQLConexion.getConexion();
        Detalle pe = new Detalle();
        try {
            String sql="{call buscarDetalle(?)}";
            CallableStatement st=cn.prepareCall(sql);
            st.setString(1, id);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
            pe.setCodb(rs.getString(1));
            pe.setCodp(rs.getString(2));
            pe.setCantidad(Integer.parseInt(rs.getString(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
            } catch (Exception e) {}
        }
        return pe;
    }

    @Override
    public List<Detalle> listadoDPrint(String id) {
        Connection cn=MySQLConexion.getConexion();
        List<Detalle> lisDet=new ArrayList();
        try {
            String sql="SELECT codb,codp,cantidad FROM detboleta WHERE codb=?";
            PreparedStatement st=cn.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Detalle d=new Detalle();
                d.setCodb(rs.getString(1));
                d.setCodp(rs.getString(2));
                d.setCantidad(Integer.parseInt(rs.getString(3)));
                lisDet.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{ cn.close();}catch(Exception ex){}
        }
        return lisDet;
    }


    
}
