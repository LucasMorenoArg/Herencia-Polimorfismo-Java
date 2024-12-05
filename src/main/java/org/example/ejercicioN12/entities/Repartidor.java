package org.example.ejercicioN12.entities;


public class Repartidor extends Empleado {

    private String zona;

    public Repartidor(String nombre, int edad, double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    @Override
    public boolean plus() {
        boolean bandera;
        bandera = getEdad() < 25 && getZona().equals("zona 3");
        double nuevoPlus = super.getSalario() + super.PLUS;
        if (bandera){
            setSalario(nuevoPlus);
        }
        return bandera;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "zona='" + zona + '\'' +
                '}';
    }
}
