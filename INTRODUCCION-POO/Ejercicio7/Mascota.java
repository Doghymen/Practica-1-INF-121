/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Doghy
 */
public class Mascota {

    private String nombre;
    private String tipo;
    private int energia;

    public Mascota(String nombre, String tipo, int energia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = energia;
    }

    public void alimentar() {
        if (energia == 100) {
            System.out.println(nombre + " ya tiene la energia llena.");
        } else {
            energia += 20;
            if (energia > 100) {
                energia = 100;
            }
            System.out.println(nombre + " ha sido alimentado. Energia actual: " + energia);
        }
    }

    public void jugar() {
        if (energia == 0) {
            System.out.println(nombre + " no puede jugar, esta sin energia.");
        } else {
            energia -= 15;
            if (energia < 0) {
                energia = 0;
            }
            if (energia == 0) {
                System.out.println(nombre + " ha jugado y se quedo sin energia.");
            } else {
                System.out.println(nombre + " ha jugado. Energia actual: " + energia);
            }
        }
    }

    public void mostrarEstado() {
        System.out.println("Mascota: " + nombre + " | Tipo: " + tipo + " | Energia: " + energia);
    }
}
