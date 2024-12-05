package org.example.ejercicioN12.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public abstract class Empleado {

    private String nombre;
    private int edad;
    private double salario;
    public final int PLUS = 300;

    public abstract boolean plus();

}
