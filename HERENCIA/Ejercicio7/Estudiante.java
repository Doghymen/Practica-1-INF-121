/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Doghy
 */
public class Estudiante extends Persona {

    private String ru;
    private String matricula;

    public Estudiante(String nombre, String paterno, String materno, int edad,
            String ru, String matricula) {
        super(nombre, paterno, materno, edad);
        this.ru = ru;
        this.matricula = matricula;
    }

    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // b)
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Estudiante | RU: " + ru + " | Matricula: " + matricula);
    }

    // c)
    public static double promedio(Estudiante[] estudiantes) {
        if (estudiantes == null || estudiantes.length == 0) {
            return 0.0;
        }
        int suma = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            suma += estudiantes[i].getEdad();
        }
        return (double) suma / estudiantes.length;
    }

    // d)
    public void modificarEdad(int nuevaEdad) {
        if (nuevaEdad >= 0) {
            setEdad(nuevaEdad);
        }
    }
}
