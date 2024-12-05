package org.example.ejercicioN12;

import org.example.ejercicioN12.entities.Repartidor;

public class Main {

    public static void main(String[] args) {

        Repartidor r1 = new Repartidor("Juan", 24,2000,"zona 3");


        System.out.println(r1.getSalario());
    }
}
