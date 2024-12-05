package org.example.ejercicioN12.entities;

public class Comercial extends Empleado {

    private double comision;

    public Comercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    @Override
    public double getSalario() {
        double salario = super.getSalario();
        if (plus()){
            salario = comision + getPLUS();
        }
        else {salario +=  comision;}
        return salario;
    }


    public boolean plus(){
        boolean bandera;
        bandera = getEdad() < 30 && comision > 200;
        return bandera;
    }

    @Override
    public String toString() {
        return "Comercial{" +
                "comision=" + comision +
                '}';
    }
}
