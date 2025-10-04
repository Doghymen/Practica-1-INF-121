/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15;

/**
 *
 * @author Doghy
 */
public class Laboratorio {

    private String nombre;
    private int capacidad;
    private int cantidadActual;
    private Ordenador[] ordenadores;

    
    public Laboratorio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.cantidadActual = 0;
        this.ordenadores = new Ordenador[capacidad];
    }

    // Insertar un ordenador
    public void agregarComputadora(Ordenador comp) {
        if (cantidadActual < capacidad) {
            ordenadores[cantidadActual] = comp;
            cantidadActual++;
        } else {
            System.out.println("No hay espacio en el laboratorio " + nombre);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Ordenador[] getOrdenadores() {
        return ordenadores;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    // b)
    public void informacion(boolean estado) {
        System.out.println("\nOrdenadores en estado " + (estado ? "Activo" : "Inactivo") + " en " + nombre + ":");
        for (int i = 0; i < cantidadActual; i++) {
            if (ordenadores[i].Activo() == estado) {
                System.out.println(ordenadores[i].informacion());
            }
        }
    }

    // Mostrar ordenadores que pertenecen a este laboratorio
    public void informacion() {
        System.out.println("\nOrdenadores del laboratorio " + nombre + ":");
        for (int i = 0; i < cantidadActual; i++) {
            System.out.println(ordenadores[i].informacion());
        }
    }

    // Mostrar ordenadores con más de 8GB RAM
    public void informacion(int ram) {
        System.out.println("\nOrdenadores con RAM mayor a " + ram + "GB en " + nombre + ":");
        for (int i = 0; i < cantidadActual; i++) {
            if (ordenadores[i].getMemoriaRAM() > ram) {
                System.out.println(ordenadores[i].informacion());
            }
        }
    }

    // Método auxiliar
    public Ordenador quitarComputadora(int indice) {
        if (indice < 0 || indice >= cantidadActual) {
            return null;
        }
        Ordenador aux = ordenadores[indice];
        for (int i = indice; i < cantidadActual - 1; i++) {
            ordenadores[i] = ordenadores[i + 1];
        }
        ordenadores[cantidadActual - 1] = null;
        cantidadActual--;
        return aux;
    }
}
