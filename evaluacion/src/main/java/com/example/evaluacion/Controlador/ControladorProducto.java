package com.example.evaluacion.Controlador;

import com.example.evaluacion.Entidad.Producto;
import com.example.evaluacion.Servicio.ServicioProducto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorProducto {

    //Objeto para manejar las funcionalidades del servicio
    ServicioProducto serivicioProducto = new ServicioProducto();


    //Metodo para listar y mostrar los productos
    @GetMapping("/mostrarProductos")
    public ArrayList<Producto> mostrarProductosCon() {
        return serivicioProducto.mostrarProductos();
    }


    //Metodo para eliminar productos por categoria
    @DeleteMapping("/eliminarProCategoria/{cat}")
    public String eliminarProCategoriaCon(@PathVariable("cat") String categoria) {
        return serivicioProducto.eliminarProCategoria(categoria);
    }


    //Metodo para actualizar precio(10%) y calcular total y total iva
    @PutMapping("/actualizarProPrecio")
    public String actualizarProPrecioCon() {
        return serivicioProducto.actualizarProPrecio();
    }
}
