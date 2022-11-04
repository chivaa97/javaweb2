/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chiva
 */
public class ProductoDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    

    public List listar() {
        String sql = "select * from productos";
        List<Producto> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setStock(rs.getInt(3));
                p.setPrecio(rs.getDouble(4));
                lista.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }

    public int agregar(Producto p) {
        String sql = "insert into productos(nombre,stock,precio) values(?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getStock());
            ps.setDouble(3, p.getPrecio());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return r;
    }
    
    public Producto listarId(int id){
        Producto p = new Producto();
        String sql ="select * from productos where idproductos="+id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                p.setNombre(rs.getString(2));
                p.setStock(rs.getInt(3));
                p.setPrecio(rs.getDouble(4));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return p;
    }

    public int actualizar(Producto p) {
        String sql = "update productos set nombre=?,stock=?,precio=? where idproductos=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getStock());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4, p.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("error actualizar "+e.toString());
        }
        return r;
    }

    public void delete(int id) {
        String sql = "delete from productos where idproductos=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

}
