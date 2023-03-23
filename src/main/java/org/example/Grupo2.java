package org.example;

public class Grupo2 extends  Cliente{

    private double descuento = 0.25;
    private int limiteBoletas = 2;

    public Grupo2() {
    }

    public Grupo2(String nombre, String documento, int edad, String correo, String celular, double descuento, int limiteBoletas) {
        super(nombre, documento, edad, correo, celular);
        this.descuento = descuento;
        this.limiteBoletas = limiteBoletas;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getLimiteBoletas() {
        return limiteBoletas;
    }

    public void setLimiteBoletas(int limiteBoletas) {
        this.limiteBoletas = limiteBoletas;
    }

    @Override
    public double comprarBoleta(double descuento, double cantidadEvaluada) {
        double precio = 80000;
        double descuentoAplica = precio * descuento;
        double precioCondescuento = precio -descuentoAplica;
        double iva = precio * 0.19;
        double total = precioCondescuento + iva;
        System.out.println(precio);
        System.out.println(precioCondescuento);
        System.out.println(iva);
        System.out.println(total);
        System.out.println(total * cantidadEvaluada);
        return total;
    }

    @Override
    public int evaluarCantidad(int cantidadEntradas) {
        if (cantidadEntradas >= 2){
            System.out.println("Entradas permitidas");
        }
        else {
            System.out.println("Error en el limite de entradas disponibles");
        }

        return cantidadEntradas;
    }
}
