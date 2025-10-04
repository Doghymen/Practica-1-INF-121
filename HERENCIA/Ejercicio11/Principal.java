/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {
        // a)
        JefePolicia jefe1 = new JefePolicia(
                "Luis", 45,
                "EMP-1001", 4500.75,
                "Comisario", "PL-ABC-01"
        );

        JefePolicia jefe2 = new JefePolicia(
                "Ana", 39,
                "EMP-2002", 5200.00,
                "Comisario", "PL-XYZ-99"
        );

        System.out.println("Jefes de Policias");
        jefe1.mostrar();
        System.out.println("--------------------------------------");
        jefe2.mostrar();
        System.out.println("--------------------------------------");

        // b)
        if (jefe1.getSueldo() > jefe2.getSueldo()) {
            System.out.println("El mayor sueldo lo tiene: " + jefe1.getNombre()
                    + " | Sueldo: " + jefe1.getSueldo());
        } else if (jefe2.getSueldo() > jefe1.getSueldo()) {
            System.out.println("El mayor sueldo lo tiene: " + jefe2.getNombre()
                    + " | Sueldo: " + jefe2.getSueldo());
        } else {
            System.out.println("Ambos tienen el mismo sueldo: " + jefe1.getSueldo());
        }

        // c)
        if (jefe1.getGrado() != null && jefe1.getGrado().equalsIgnoreCase(jefe2.getGrado())) {
            System.out.println("Ambos tienen el mismo grado: " + jefe1.getGrado());
        } else {
            System.out.println("Tienen grados diferentes: " + jefe1.getGrado() + " / " + jefe2.getGrado());
        }
    }
}
