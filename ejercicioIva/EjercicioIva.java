package com.example;

public class EjercicioIva {

    public static void main(String[] args) {

        double precio = 123.23;
        double iva = 3.44;
        double resultado = precioTotal(precio, iva);
        System.out.println(resultado);
    }

    static double precioTotal(double precio, double iva){
        return precio + iva;
    }
}
