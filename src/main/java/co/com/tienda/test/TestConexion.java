package co.com.tienda.test;

import co.com.tienda.conexion.Conexion;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConexion {

    public static void main(String[] args) {

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.get_connection()){

        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
