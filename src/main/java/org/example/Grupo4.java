package org.example;

public class Grupo4 extends Cliente{

    private int limiteBoletas = 5;
    private double popular = 40000;
    private double oriental = 80000;
    private double occidental = 150000;


    public Grupo4() {
    }

    public Grupo4(String nombre, String documento, int edad, String correo, String celular, int limiteBoletas, double popular, double oriental, double occidental) {
        super(nombre, documento, edad, correo, celular);
        this.limiteBoletas = limiteBoletas;
        this.popular = popular;
        this.oriental = oriental;
        this.occidental = occidental;
    }


    public int getLimiteBoletas() {
        return limiteBoletas;
    }

    public void setLimiteBoletas(int limiteBoletas) {
        this.limiteBoletas = limiteBoletas;
    }

    public double getPopular() {
        return popular;
    }

    public void setPopular(double popular) {
        this.popular = popular;
    }

    public double getOriental() {
        return oriental;
    }

    public void setOriental(double oriental) {
        this.oriental = oriental;
    }

    public double getOccidental() {
        return occidental;
    }

    public void setOccidental(double occidental) {
        this.occidental = occidental;
    }

    @Override
    public double comprarBoleta(double descuento, double cantidadEvaluada) {
        return 0;
    }

    @Override
    public int evaluarCantidad(int cantidadEntradas) {
        if (cantidadEntradas >= 5){
            System.out.println("Entradas permitidas");
        }
        else {
            System.out.println("Error en el limite de entradas disponibles");
        }

        return cantidadEntradas;
    }

    public double comprarBoleta2(double precio, double cantidadEvaluada){
        double iva = precio * 0.19;
        double total = precio + iva;
        System.out.println(precio);
        System.out.println(iva);
        System.out.println(total);
        System.out.println(total * cantidadEvaluada);
        return total;
    }
}
