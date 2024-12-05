package org.example.ejercicioN12;

import org.example.ejercicioN12.entities.Comercial;
import org.example.ejercicioN12.entities.Empleado;
import org.example.ejercicioN12.entities.Repartidor;

public class Main {

    public static void main(String[] args) {

        Empleado r1 = new Repartidor("Juan", 24,2000,"zona 3");
        Empleado r2 = new Repartidor("Federico", 24,2150,"zona 4");
        Empleado c1 = new Comercial("Jose",31,1990,500);

        System.out.println(r1.getSalario());
        System.out.println(r2.getSalario());
        System.out.println(c1.getSalario());


    }
}
