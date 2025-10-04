/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Doghy
 */
public class Jefe extends Persona {

    private String sucursal;
    private String tipo;

    public Jefe(String nombre, String apellido, String ci, String sucursal, String tipo) {
        super(nombre, apellido, ci);
        this.sucursal = sucursal;
        this.tipo = tipo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String method(String tipo) {
        return "Jefe (" + this.tipo + "): " + tipo;
    }

    public void mostrar() {
        System.out.println("====== Jefe ======");
        System.out.println("Nombre: " + getNombre()
                + ", Apellido: " + getApellido()
                + ", CI: " + getCi()
                + ", sucursal: " + sucursal
                + ", tipo: " + tipo);;
    }
}
