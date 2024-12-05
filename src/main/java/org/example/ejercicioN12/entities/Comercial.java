package org.example.ejercicioN12.entities;

public class Comercial extends Empleado {

    private double comision;


    public boolean plus(){
        boolean bandera;
        bandera = getEdad() < 30 && comision > 200;
        return bandera;
    }
}
