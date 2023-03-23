package org.example;

public abstract class Cliente {

    private String nombre;
    private String documento;
    private int edad;
    private String correo;
    private String celular;

    public Cliente() {
    }

    public Cliente(String nombre, String documento, int edad, String correo, String celular) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.correo = correo;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public abstract double comprarBoleta(double descuento, double cantidadEvaluada);

    public abstract int evaluarCantidad (int cantidadEntradas);



}
