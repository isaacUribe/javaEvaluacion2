package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);
        //if (fecha == (2023,3,23));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de boletas que quiere comprar: ");
        int cantidad = scanner.nextInt();

        System.out.println("Por Favor ingrese el grupo al que pertenece(1-G popular, 2-G Oriental, 3-G Occidental, 4-G sin abono): ");
        int grupo = scanner.nextInt();
        switch (grupo){
            case 1:
                Grupo1 cliente1 = new Grupo1();
                double descuento1 = cliente1.getDescuento();
                double cantidadEvaluada1 =  cliente1.evaluarCantidad(cantidad);
                cliente1.comprarBoleta(descuento1, cantidadEvaluada1);
                break;
            case 2:
                Grupo2 cliente2 = new Grupo2();
                double descuento2 = cliente2.getDescuento();
                double cantidadEvaluada2 =  cliente2.evaluarCantidad(cantidad);
                cliente2.comprarBoleta(descuento2, cantidadEvaluada2);
                break;
            case 3:
                Grupo3 cliente3 = new Grupo3();
                double descuento3 = cliente3.getDescuento();
                double cantidadEvaluada3 =  cliente3.evaluarCantidad(cantidad);
                cliente3.comprarBoleta(descuento3, cantidadEvaluada3);
                break;
            case 4:
                Grupo4 cliente4 = new Grupo4();
                System.out.println("Por favor elija la tribuna en la que quiere estar(1-Popular,2-Oriental,3-Occidental):");
                int tribuna = scanner.nextInt();
                double precio = 0;
                if (tribuna == 1){
                    precio = cliente4.getPopular();
                } else if (tribuna == 2) {
                    precio = cliente4.getOriental();
                } else if (tribuna == 3) {
                    precio = cliente4.getOccidental();
                }else {
                    System.out.println("Error tribuna ingresada");
                }

                double cantidadEvaluada4 =  cliente4.evaluarCantidad(cantidad);
                cliente4.comprarBoleta2(precio, cantidadEvaluada4);

                break;
            default:
                System.out.println("Error en el grupo ingresado");
        }

    }
}