/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Config.Conexion;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author chiva
 */
public class VentaDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public String GenerarSerie() {
        String numeroserie = "";
        String sql = "select max(NumeroSerie) from ventas";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                numeroserie = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return numeroserie;
    }

    public int GenerarSerieInt() {
        int numeroserie = 0;
        String sql = "select max(NumeroSerie) from ventas";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                numeroserie = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return numeroserie;
    }

    public String idVentas() {
        String idVentas = "";
        String sql = "select max(idventas) from ventas";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                idVentas = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return idVentas;
    }

    public int guardarVenta(Venta ve) {
        String sql = "insert into ventas(NumeroSerie, monto ) values (?, ?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, ve.getNumserie());
            ps.setDouble(2, ve.getMonto());

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return r;
    }

    public int guardarDetalleVenta(Venta venta) {
        String sql = "insert into detalle_ventas(cantidad,precioventa,idventas,idproducto) values(?, ?, ?, ?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, venta.getCantidad());
            ps.setDouble(2, venta.getPrecio());
            ps.setInt(3, venta.getId());
            ps.setInt(4, venta.getIdproducto());
        } catch (SQLException e) {
            System.out.println("error guardardetalle venta"+e.toString());
        }
        return r;
    }
}
