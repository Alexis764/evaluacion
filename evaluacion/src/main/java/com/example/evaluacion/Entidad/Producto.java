package com.example.evaluacion.Entidad;

public class Producto {

    //Atributos
    private int codigo, cantidad, descuento;
    private String nombre;
    private String categoria;
    private double precio, total, totalIva;


    //Constructor
    public Producto(int codigo, int cantidad, String nombre, String categoria, double precio) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }


    //Getters
    public int getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getDescuento() {
        return descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public double getTotal() {
        return total;
    }

    public double getTotalIva() {
        return totalIva;
    }


    //Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setTotalIva(double totalIva) {
        this.totalIva = totalIva;
    }
}
