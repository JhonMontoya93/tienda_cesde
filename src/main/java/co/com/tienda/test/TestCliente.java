package co.com.tienda.test;

import co.com.tienda.modelo.Cliente;
import co.com.tienda.servicio.ClienteServicio;

public class TestCliente {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        ClienteServicio clienteServicio = new ClienteServicio();

        clienteServicio.crearCliente(cliente);

        clienteServicio.listarClientes();

        clienteServicio.eliminarCliente();

        clienteServicio.listarClientes();

    }
}
