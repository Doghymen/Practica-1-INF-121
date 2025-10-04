/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15;

/**
 *
 * @author Doghy
 */
public class Buzon {

    private int nro;
    private int nroC;
    private String[][] c;

    public Buzon(int nro) {
        this.nro = nro;
        this.nroC = 0;
        this.c = new String[50][3];
    }

    public String[][] getC() {
        return c;
    }

    public int getNroC() {
        return nroC;
    }

    // a)
    public boolean agragarCarta(String codigo, String remitente, String destinatario) {
        if (this.nroC >= 50) {
            return false;
        }

        c[nroC][0] = codigo;
        c[nroC][1] = remitente;
        c[nroC][2] = destinatario;
        nroC++;
        return true;
    }

    //c)
    public int contarCartasDestinatario(String x) {
        int contador = 0;
        for (int i = 0; i < this.nroC; i++) {
            if (c[i][2].equalsIgnoreCase(x)) {
                contador++;
            }
        }
        
        return contador;
    }

    // d)
    public boolean eliminarCarta(String z) {
        for (int i = 0; i < this.nroC; i++) {
            if (c[i][0].equalsIgnoreCase(z)) {
                for (int j = i; j < this.nroC; j++) {
                    c[j][0] = c[j + 1][0];
                    c[j][1] = c[j + 1][1];
                    c[j][2] = c[j + 1][2];
                }
                c[this.nroC - 1][0] = null;
                c[this.nroC - 1][1] = null;
                c[this.nroC - 1][2] = null;
                this.nroC--;
                return true;
            }
        }
        return false;
    }

    // e)
    public void recibirCarta() {
        for (int i = 0; i < this.nroC; i++) {
            boolean busqueda = false;
            String remitente = c[i][1];

            for (int j = 0; j < this.nroC; j++) {
                if (c[j][2].equalsIgnoreCase(remitente)) {
                    System.out.println(remitente + " recibio unca carta de " + c[j][1]);
                    busqueda = true;
                }
            }

            if (!busqueda) {
                System.out.println("No hay remitentes que hayan recibido cartas;");
            }
        }
    }
}
