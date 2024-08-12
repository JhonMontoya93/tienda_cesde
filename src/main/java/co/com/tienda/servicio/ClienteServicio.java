package co.com.tienda.servicio;

import co.com.tienda.dao.ClienteDao;
import co.com.tienda.modelo.Cliente;

import java.util.Scanner;

public class ClienteServicio {
    Scanner sc = new Scanner(System.in);

    public void crearCliente(Cliente cliente){
        System.out.println("Ingrese el numero de cedula del cliente:");
        int cedula = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido:");
        String apellido = sc.nextLine();
        System.out.println("Ingrese el correo del cliente:");
        String correo = sc.nextLine();
        System.out.println("Ingrese el telefono del cliente:");
        String telefono = sc.nextLine();
        System.out.println("Ingrese una contraseña:");
        String contrasena = sc.nextLine();

        cliente.setIdCliente(cedula);
        cliente.setNombreCliente(nombre);
        cliente.setApellidoCliente(apellido);
        cliente.setCorreo(correo);
        cliente.setTelefono(telefono);
        cliente.setContrasena(contrasena);

        ClienteDao.crearClienteDB(cliente);
    }
    public void listarClientes(){

        ClienteDao.listarClientesDB();

    }
    public  void actualizarCliente(Cliente cliente) {

        System.out.println("Ingrese 1. Actualizar nombre \n" +
                "2.Actualizar apellido \n" +
                "3.Actualizar correo \n" +
                "4.Actualizar telefono \n" +
                "5.Actualizar contraseña");

        int opc = sc.nextInt();

        if (opc == 1) {
            System.out.println("Ingrese el nuevo nombre");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el id del cliente");
            int id = sc.nextInt();
            sc.skip("\n");

            cliente.setNombreCliente(nombre);
            cliente.setIdCliente(id);
            cliente.setOpc(opc);

            ClienteDao.actualizarClienteDB(cliente);

        } else if (opc == 2) {
            System.out.println("Ingrese el nuevo apellido");
            String apellido = sc.nextLine();
            System.out.println("Ingrese el id del cliente");
            int id = sc.nextInt();
            sc.skip("\n");

            cliente.setApellidoCliente(apellido);
            cliente.setIdCliente(id);
            cliente.setOpc(opc);

            ClienteDao.actualizarClienteDB(cliente);

        } else if (opc == 3) {
            System.out.println("Ingrese el nuevo correp");
            String correo = sc.nextLine();
            System.out.println("Ingrese el id del cliente");
            int id = sc.nextInt();
            sc.skip("\n");

            cliente.setCorreo(correo);
            cliente.setIdCliente(id);
            cliente.setOpc(opc);

            ClienteDao.actualizarClienteDB(cliente);

        } else if (opc == 4) {
            System.out.println("Ingrese el nuevo telefono");
            String telefono = sc.nextLine();
            System.out.println("Ingrese el id del cliente");
            int id = sc.nextInt();
            sc.skip("\n");

            cliente.setTelefono(telefono);
            cliente.setIdCliente(id);
            cliente.setOpc(opc);

            ClienteDao.actualizarClienteDB(cliente);

        } else if (opc == 5) {
            System.out.println("Ingrese la nueva contraseña");
            String contrasena = sc.nextLine();
            System.out.println("Ingrese el id del cliente");
            int id = sc.nextInt();
            sc.skip("\n");

            cliente.setApellidoCliente(contrasena);
            cliente.setIdCliente(id);
            cliente.setOpc(opc);

            ClienteDao.actualizarClienteDB(cliente);
        }
    }

    public void eliminarCliente(){

        System.out.println("Indique el id del cliente a borrar:");
        int idCliente = sc.nextInt();
        ClienteDao.eliminarClienteDB(idCliente);

    }
}
