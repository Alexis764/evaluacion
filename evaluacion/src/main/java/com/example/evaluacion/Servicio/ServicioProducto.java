package com.example.evaluacion.Servicio;

import com.example.evaluacion.Entidad.Producto;

import java.util.ArrayList;

public class ServicioProducto {

    //Lista para guardar los productos
    private ArrayList<Producto> listaProductos = new ArrayList<>();


    //Metodo(constructor) para guardar productos iniciales
    public ServicioProducto() {
        listaProductos.add(new Producto(1, 100, "Manzana", "Fruta", 1000.0));
        listaProductos.add(new Producto(2, 200, "Papa", "Vegetal", 2000.0));
        listaProductos.add(new Producto(3, 300, "Fresa", "Fruta", 3000.0));
        listaProductos.add(new Producto(4, 400, "Jabon de baño", "Aseo", 4000.0));
        listaProductos.add(new Producto(5, 500, "Frijol", "Grano", 5000.0));
        listaProductos.add(new Producto(6, 600, "Zanahoria", "Vegetal", 6000.0));
        listaProductos.add(new Producto(7, 700, "Limpia pisos", "Aseo", 7000.0));
        listaProductos.add(new Producto(8, 800, "Garbanzo", "Grano", 8000.0));
        listaProductos.add(new Producto(9, 900, "Pera", "Fruta", 9000.0));
        listaProductos.add(new Producto(10, 1000, "Durazno", "Fruta", 10000.0));
    }


    //Metodo para listar los productos
    public ArrayList<Producto> mostrarProductos() {
        return listaProductos;
    }


    //Metodo para eliminar productos por Categoria
    public String eliminarProCategoria(String categoria) {
        String mensaje;
        ArrayList<Producto> listaProCategoria = buscarProCategoria(categoria);

        if (listaProCategoria.size() == 0) {
            mensaje = "No existen productos por " + categoria;

        } else {
            for (Producto iteProducto: listaProCategoria) {
                listaProductos.remove(iteProducto);
            }

            mensaje = "Productos por " + categoria + " eliminados";
        }

        return mensaje;
    }


    //Metodo actualizar precio de todos los productos al 10% y calcular total y total iva
    public String actualizarProPrecio() {
        double totalAumento;
        String mensaje;

        if (listaProductos.size() == 0) {
            mensaje = "No existen productos para actualizar";

        } else {
            for (Producto iteProducto: listaProductos) {
                totalAumento = iteProducto.getPrecio() + ((iteProducto.getPrecio() * 10) / 100);
                iteProducto.setPrecio(totalAumento);
            }

            calcularProTotal();

            mensaje = "Precio de productos actualizado y total calculado";
        }

        return mensaje;
    }


    //Metodo para calcular total y total iva
    public void calcularProTotal() {
        double totalIva;

        for (Producto iteProducto: listaProductos) {
            iteProducto.setTotal(iteProducto.getPrecio() * iteProducto.getCantidad());
            totalIva = iteProducto.getTotal() + ((iteProducto.getTotal() * 19) / 100);
            iteProducto.setTotalIva(totalIva);
        }
    }


    //Metodo para buscar productos por categoria
    public ArrayList<Producto> buscarProCategoria(String categoria) {
        ArrayList<Producto> listaProCategoria = new ArrayList<>();

        for (Producto iteProducto: listaProductos) {
            if (iteProducto.getCategoria().equals(categoria)) {
                listaProCategoria.add(iteProducto);
            }
        }

        return listaProCategoria;
    }

}
