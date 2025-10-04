/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Doghy
 */
public class Docente extends Persona {

    private double sueldo;
    private String regProfesional;

    public Docente(String nombre, String paterno, String materno, int edad,
            double sueldo, String regProfesional) {
        super(nombre, paterno, materno, edad);
        this.sueldo = sueldo;
        this.regProfesional = regProfesional;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getRegProfesional() {
        return regProfesional;
    }

    public void setRegProfesional(String regProfesional) {
        this.regProfesional = regProfesional;
    }

    // b)
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Docente | Sueldo: " + sueldo + " | Reg. Profesional: " + regProfesional);
    }
}
