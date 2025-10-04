/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {
        // b)
        Partido partidoA = new Partido("Partido A", "Fundador");
        Presidente p1 = new Presidente("Luis", "Poma", "Abogado", 12, partidoA);

        // b)
        Presidente p2 = new Presidente("Ana", "Lopez", "Economista", 8, "Partido B", "Secretaria General");

        Presidente p3 = new Presidente("Carlos", "Ruiz", "Ingeniero", 5, "Partido C", "Vocero");

        // c)
        Presidente[] presidentes = new Presidente[3];
        presidentes[0] = p1;
        presidentes[1] = p2;
        presidentes[2] = p3;

        // Mostrar todos los presidentes
        System.out.println("Lista de presidentes:");
        for (int i = 0; i < presidentes.length; i++) {
            presidentes[i].mostrar();
        }

        // Buscar por nombre x
        String x = "Ana";
        System.out.println("Buscar presidente(s) con nombre: " + x);
        buscarPorNombreYMostrar(presidentes, x);

        // Buscar por un nombre
        String y = "Maria";
        System.out.println("Buscar presidente(s) con nombre: " + y);
        buscarPorNombreYMostrar(presidentes, y);
    }

    
    public static void buscarPorNombreYMostrar(Presidente[] arr, String nombreBuscado) {
        boolean encontrado = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
                // mostrar partido politico y profesion (que viene de Politico)
                System.out.println("Encontrado: " + arr[i].getNombre() + " " + arr[i].getApellido());
                System.out.println("  Partido: " + arr[i].getPartido().getNombreP());
                System.out.println("  Rol en partido: " + arr[i].getPartido().getRol());
                System.out.println("  Profesion: " + arr[i].getProfesion());
                System.out.println("  Anios de experiencia: " + arr[i].getAniosExp());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun presidente con el nombre '" + nombreBuscado + "'.");
        }
    }
}
