/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Doghy
 */
public class Parada {

    private String[] admins;
    private String[][] autos;
    private String nombreP;
    private int nroAdmins;
    private int nroAutos;

    // a)
    public Parada() {
        this.nombreP = "Parada Villa Fatima";
        this.admins = new String[10];
        this.autos = new String[10][3];
        this.nroAdmins = 0;
        this.nroAutos = 0;
    }

    public Parada(String nombreP) {
        this.nombreP = nombreP;
        this.admins = new String[10];
        this.autos = new String[10][3];
        this.nroAdmins = 0;
        this.nroAutos = 0;
    }

    // b)
    // c)
    public void adicionar(String x) {
        if (nroAdmins < admins.length) {
            admins[nroAdmins] = x;
            nroAdmins++;
        } else {
            System.out.println("No se pueden agregar mas admins, limite alcanzado.");
        }
    }

    // d)
    public void adicionar(String x, String y, String z) {
        if (nroAutos < autos.length) {
            autos[nroAutos][0] = x;
            autos[nroAutos][1] = y;
            autos[nroAutos][2] = z;
            nroAutos++;
        } else {
            System.out.println("No se pueden agregar mas autos");
        }
    }
    
    
    // b)
    public  void mostrar(){
        for (int i = 0; i < nroAutos; i++) {
            System.out.println("Auto: " + (i + 1));
            System.out.println("Modelo: " + autos[i][0] + ", Conductor: " + autos[i][1] + ", Placa: " + autos[i][2]);
        }
    }
}
