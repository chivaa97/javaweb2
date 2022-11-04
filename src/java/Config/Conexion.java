/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author chiva
 */
public class Conexion {
    Connection con;
    String url = "jdbc:mysql://localhost:3306/ventasweb";
    String user ="root";
    String pass = "";
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
