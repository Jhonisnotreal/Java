package com.company.repeticion;

public class EjercicoConcatenarTextos {
    public static void main(String[] args) {

        String[] nombres = {"Pepito", "Juan", "Vera"};

        String concatena = "";
//        Variable  :  Valor
        for(String nombre : nombres){
            concatena += nombre + " ";
            System.out.println(concatena);
        }
    }
}
