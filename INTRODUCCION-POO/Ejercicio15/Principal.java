/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15;

/**
 *
 * @author Doghy
 */
public class Principal {
    public static void main(String[] args){
        // b)
        Carta c1 = new Carta("C01", "Hola ciomo estas que me cuentas");
        Carta c2 = new Carta("C02", "Salimos mañana que te parece");
        Carta c3 = new Carta("C03", "Me despido de usted muucordialmente");
        
        // a)
        Buzon b1 = new Buzon(1);
        Buzon b2 = new Buzon(2);
        Buzon b3 = new Buzon(3);
        
        b1.agragarCarta("C123", "Juan Alvarez", "Peter Chaves");
        b1.agragarCarta("C456", "Pepe Mujica", "Wilmer Perez");
        b1.agragarCarta("C789", "Paty Vasques", "Pepe Mujica");

        b2.agragarCarta("C04", "Sofia", "Carlos");
        b2.agragarCarta("C05", "Carlos", "Sofia");
        b2.agragarCarta("C06", "Luis", "Sofia");

        b3.agragarCarta("C07", "Mario", "Luis");
        b3.agragarCarta("C08", "Lucia", "Mario");
        b3.agragarCarta("C09", "Ana", "Lucia");
        
        
        // c)
        System.out.println("========================== C) ==========================");
        System.out.println("========================== C) ==========================");
        System.out.println("El destinatario Juan Alvarez recibio " + b1.contarCartasDestinatario("Pepe Mujica") + " cartas.");
        
        
        // d)
        System.out.println("========================== D) ==========================");
        System.out.println("========================== D) ==========================");
        if (b2.eliminarCarta("C05")) {
            System.out.println("Carta C05 eliminada correctamente.");
        } else {
            System.out.println("No se encontró la carta C05.");
        }
        
        // e)
        System.out.println("========================== E) ==========================");
        System.out.println("========================== E) ==========================");
        b1.recibirCarta();
        
        // f)
        System.out.println("========================== F) ==========================");
        System.out.println("========================== F) ==========================");
        String palabraClave = "hola";
        Carta[] cartas = {c1, c2, c3};
        Buzon[] buzones = {b1, b2, b3};

        for (Carta carta : cartas) {
            if (carta.getDescripcion().toLowerCase().contains(palabraClave.toLowerCase())) {
                System.out.println("\nCoincidencia encontrada en carta " + carta.getCodigo());

                // Mostrar código, remitente y destinatario real
                for (Buzon b : buzones) {
                    String[][] cArray = b.getC();
                    for (int j = 0; j < b.getNroC(); j++) {
                        if (cArray[j][0].equalsIgnoreCase(carta.getCodigo())) {
                            System.out.println("Código: " + cArray[j][0]);
                            System.out.println("Remitente: " + cArray[j][1]);
                            System.out.println("Destinatario: " + cArray[j][2]);
                        }
                    }
                }
            }
        }
    }
}
