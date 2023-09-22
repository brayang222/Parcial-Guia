package com.brayanvargas.parcial.domain;

public class Producto {
    private String codigo;
    private String nombre;
    private short precio;
    private byte cantidadActual;
    private byte cantidadMaxima;

    public Producto(String codigo, String nombre, short precio, byte cantidadActual, byte cantidadMaxima) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadActual = 0;
        this.cantidadMaxima = 8;
    }

    public Producto() {
        
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public short getPrecio() {
        return precio;
    }

    public byte getCantidadActual() {
        return cantidadActual;
    }

    public byte getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setPrecio(short precio) {
        this.precio = precio;
    }

    public void setCantidadActual(byte cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

}
