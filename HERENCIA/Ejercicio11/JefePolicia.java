/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Doghy
 */
public class JefePolicia extends Persona implements Empleado, Policia{

    private String idEmpleado;
    private double sueldo;

    private String grado;
    private String placa;

    public JefePolicia(String nombre, int edad,
            String idEmpleado, double sueldo,
            String grado, String placa) {
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
        this.grado = grado;
        this.placa = placa;
    }

    // Empleado
    @Override
    public double getSueldo() {
        return sueldo;
    }

    @Override
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String getIdEmpleado() {
        return idEmpleado;
    }

    @Override
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    // Policia
    @Override
    public String getGrado() {
        return grado;
    }

    @Override
    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void mostrar() {
        super.mostrarPersona();
        System.out.println("ID Empleado: " + idEmpleado + " | Sueldo: " + sueldo);
        System.out.println("Grado: " + grado + " | Placa: " + placa);
    }
}
