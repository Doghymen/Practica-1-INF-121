/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Doghy
 */
public class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private int ci;
    
    public Persona(String nombre, String paterno, String materno, int edad, int ci){
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.ci = ci;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Ap Paterno: " + this.paterno);
        System.out.println("Ap Materno: " + this.materno);
        System.out.println("Edad: " + this.edad);
        System.out.println("Ci: " + this.ci);
    }
    
    public boolean mayorEdad(){
        return this.edad > 18;
    }
    
    public void modificarEdad(int nuevo){
        int edad_antigua = this.edad;
        this.edad = nuevo;
        System.out.println("La edad " + edad_antigua + " fue modificada correctamente a " + this.edad);
    }

    public String getPaterno() {
        return paterno;
    }
}