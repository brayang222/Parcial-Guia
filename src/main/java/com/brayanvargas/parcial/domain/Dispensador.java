package com.brayanvargas.parcial.domain;

import java.util.ArrayList;
import java.util.List;

public class Dispensador {
    private List<Producto> productos;

    public Dispensador() {
        this.productos = new ArrayList<>();
    }

    public void cargarProducto(Producto producto1, Producto producto2, Producto producto3, Producto producto4,
                               Producto producto5, Producto producto6, Producto producto7, Producto producto8,
                               Producto producto9, Producto producto10){

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        productos.add(producto6);
        productos.add(producto7);
        productos.add(producto8);
        productos.add(producto9);
        productos.add(producto10);

    }

    public void cargarInventario(String codigo, byte cantidad){
        boolean exist = false;
        Producto producto = new Producto();
        for (Producto pdto : productos) {
            if (pdto.getCodigo().equals(codigo)){
                exist = true;
                producto = pdto;
            }
        }
        if(exist){
            if (producto.getCantidadActual() + cantidad > producto.getCantidadMaxima()){
                producto.setCantidadActual((byte) 8);
            }
        } else {
            byte cantidadActual = (byte) (producto.getCantidadActual() + cantidad);
            producto.setCantidadActual(cantidadActual);
        }
    }

    public void sacarProducto(String nombre, short dinero){
        boolean exist = false;
        Producto producto = new Producto();
        for (Producto pdto : productos){
            if (pdto.getNombre().equals(nombre)){
                exist = true;
                producto=pdto;
            }
        }

        if (exist){
            if (producto.getNombre().equals(nombre) && producto.getCantidadActual() > 0 &&
                    producto.getPrecio() <= dinero) {
                byte cantidadActual = (byte) (producto.getCantidadActual() - 1);
                producto.setCantidadActual(cantidadActual);
                System.out.println("Gracias por comprar " + producto.getNombre() + " su cambio es de: " +
                        (dinero-producto.getPrecio()));
            } else {
                System.out.println("Producto no disponible, " + "su cambio es de " + dinero);
            }
        } else {
            System.out.println("Producto no disponible, " + "su cambio es de " + dinero);
        }
    }

    public List<Producto> consultarProductosAgotados(){
        List<Producto> productosAgotados = new ArrayList<>();
        productos.forEach(producto -> {
            if (producto.getCantidadActual() == 0) {
                productosAgotados.add(producto);
            }
        });
        return productosAgotados;
    }

    public Producto consultarUnds(String codigo){
        Producto producto = new Producto();
        for (Producto pdto: productos){
            if (pdto.getCodigo().equals(codigo)){
                producto = pdto;
                break;
            }
        }
        return producto;
    }

    public List<Producto> consultarTotalUnds(){
        List<Producto> inventarioTotal = new ArrayList<>();
        productos.forEach(producto -> {
            inventarioTotal.add(producto);
        });
        return inventarioTotal;
    }

}
