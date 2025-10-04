/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {

        // a) Instancias 3 frutas diferentes
        Fruta f1 = new Fruta("Kiwi", "Subtropical", new String[]{"K", "C", "E"});
        Fruta f2 = new Fruta("Platano", "Hierro", new String[]{"A", "B", "C"});
        Fruta f3 = new Fruta("Naranja", "Tropical", new String[]{"C", "A"});

        Fruta[] frutas = {f1, f2, f3};

        // b) Verificar cuál es la fruta con más vitaminas
        Fruta cont = frutas[0];
        for (int i = 1; i < frutas.length; i++) {
            if (frutas[i].getNroVitaminas() > cont.getNroVitaminas()) {
                cont = frutas[i];
            }
        }
        System.out.println("La fruta con mayor vitamina es: " + cont.getNombre());

        // c) Mostrar las vitaminas que tiene la fruta X
        f3.Mostrar();

        // d) Cuantas vitaminas son citricas
        int acumCitricas = 0;
        for (int i = 0; i < frutas.length; i++) {
            Fruta frutaActual = frutas[i];
            int cantidadCitricasFruta = frutaActual.vitaminasCitricas();
            acumCitricas += cantidadCitricasFruta;
        }
        System.out.println("Total de vitaminas citricas: " + acumCitricas);

        // e) Ordenar las frutas alfabéticamente según el nombre de sus vitaminas
        for (int i = 0; i < frutas.length - 1; i++) {
            for (int j = i + 1; j < frutas.length; j++) {

                String vitaminasFrutaI = frutas[i].vitaminasConcatenadas();
                String vitaminasFrutaJ = frutas[j].vitaminasConcatenadas();

                if (vitaminasFrutaI.compareTo(vitaminasFrutaJ) > 0) {
                    Fruta frutaTemporal = frutas[i];
                    frutas[i] = frutas[j];
                    frutas[j] = frutaTemporal;
                }
            }
        }

        // Mostrar el resultado
        System.out.println("============================================================");
        System.out.println("============================================================");
        System.out.println("Frutas ordenadas por el nombre de sus vitaminas:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i].getNombre() + " - " + frutas[i].vitaminasConcatenadas());
        }
    }
}
