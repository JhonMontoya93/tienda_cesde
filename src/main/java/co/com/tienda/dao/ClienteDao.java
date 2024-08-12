package co.com.tienda.dao;

import co.com.tienda.conexion.Conexion;
import co.com.tienda.modelo.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDao {

    public static void crearClienteDB(Cliente cliente){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps = null;

            try{

                String query = "INSERT INTO cliente(id_cliente, nombre_cliente, apellido_cliente, correo, telefono, contrasena)VALUES(?,?,?,?,?,?)";

                ps = connect.prepareStatement(query);

                ps.setInt(1,cliente.getIdCliente());
                ps.setString(2,cliente.getNombreCliente());
                ps.setString(3,cliente.getApellidoCliente());
                ps.setString(4,cliente.getCorreo());
                ps.setString(5,cliente.getTelefono());
                ps.setString(6,cliente.getContrasena());

                ps.executeUpdate();

                System.out.println("Registro de cliente exitoso");

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void listarClientesDB(){

        Conexion conexion = new Conexion();

            PreparedStatement ps = null;

            ResultSet rs = null;

            try(Connection connect = conexion.get_connection()){

                String query = "SELECT * FROM cliente";

                ps = connect.prepareStatement(query);

                rs = ps.executeQuery();


                while(rs.next()){
                    System.out.println("Id cliente:" + rs.getInt("id_cliente"));
                    System.out.println("Nombre del cliente:" + rs.getString("nombre_cliente"));
                    System.out.println("Apellido cliente:" + rs.getString("apellido_cliente"));
                    System.out.println("Correo" + rs.getString("telefono"));
                    System.out.println("Telefono" + rs.getString("telefono"));
                    System.out.println("Contraseña" + rs.getString("contrasena"));
                }

            }catch (SQLException e){
                System.out.println("Nose puede recuperar los registros");
                System.out.println(e);
            }
        }

        public static void eliminarClienteDB(int idCliente){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps = null;

            try{
                String query = "DELETE FROM cliente WHERE cliente.id_cliente = ?";

                ps = connect.prepareStatement(query);
                ps.setInt(1,idCliente);
                ps.executeUpdate();
                System.out.println("El registro se ha eliminado exitosamente");

            }catch (SQLException e){
                System.out.println("No se elimino el registro");
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);

        }

        }

        public static void actualizarClienteDB(Cliente cliente){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps = null;

            try {

                int opcDao = cliente.getOpc();

                if(opcDao ==1){

                    String query = "UPDATE cliente SET nombre_cliente = ? WHERE id_cliente = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, cliente.getNombreCliente());
                    ps.setInt(2,cliente.getIdCliente());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el nombre correctamente");

                }else if(opcDao ==2){
                    String query = "UPDATE cliente SET apellido_cliente = ? WHERE id_cliente = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, cliente.getApellidoCliente());
                    ps.setInt(2,cliente.getIdCliente());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el apellido correctamente");

                }else if (opcDao ==3){
                    String query = "UPDATE cliente SET correo = ? WHERE id_cliente = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, cliente.getCorreo());
                    ps.setInt(2,cliente.getIdCliente());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el correo correctamente");

                }else if (opcDao ==4){
                    String query = "UPDATE cliente SET telefono = ? WHERE id_cliente = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, cliente.getTelefono());
                    ps.setInt(2,cliente.getIdCliente());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado el telefono correctamente");

                }else if (opcDao ==5){
                    String query = "UPDATE cliente SET contrasena = ? WHERE id_cliente = ?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, cliente.getContrasena());
                    ps.setInt(2,cliente.getIdCliente());

                    ps.executeUpdate();
                    System.out.println("Se ha actualizado la contraseña correctamente");
                }

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }

        }
}
