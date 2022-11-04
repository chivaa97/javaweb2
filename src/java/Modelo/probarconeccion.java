/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Config.Conexion;
import java.sql.Connection;

/**
 *
 * @author chiva
 */
public class probarconeccion {
    public static void main(String[] args) {
        Conexion c = new Conexion();
        if(c.Conexion()!=null){
            System.out.println("exito");
        }else {
            System.out.println("faill");
        }
    }
}
