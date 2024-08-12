package co.com.tienda.modelo;

import java.time.LocalDateTime;

public class Venta {

    private int idVenta;
    private LocalDateTime fecha;

    Cliente cliente;
    Producto producto;
    private int cantidad;
    Producto precioProducto;
    private double total;

    public Venta(){

    }

    public Venta(int idVenta, LocalDateTime fecha, Cliente cliente, Producto producto, int cantidad, Producto precioProducto, double total) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioProducto = precioProducto;
        this.total = total;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Producto precioProducto) {
        this.precioProducto = precioProducto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}

