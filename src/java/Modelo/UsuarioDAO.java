
package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuarioDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Usuario Validar(String usuario, String contrasena){
        Usuario us = new Usuario();
        String sql="select * from usuarios where usuario=? and contrasena=?";
        try {
            con = cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contrasena);
            rs=ps.executeQuery();
            while(rs.next()){
                us.setId(rs.getInt("idusuarios"));
                us.setNombre(rs.getString("nombre"));
                us.setApellidos(rs.getString("apellidos"));
                us.setUsuario(rs.getString("usuario"));
                us.setContrasena(rs.getString("contrasena"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return us;
    }
}
