/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15;

/**
 *
 * @author Doghy
 */
public class Ordenador {

    private String codigoSerial;
    private int numero;
    private int memoriaRAM;
    private String procesador;
    private boolean estado;

    public Ordenador(String codigoSerial, int numero, int memoriaRAM, String procesador, boolean estado) {
        this.codigoSerial = codigoSerial;
        this.numero = numero;
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
        this.estado = estado;
    }

    public String getCodigoSerial() {
        return codigoSerial;
    }

    public int getNumero() {
        return numero;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public boolean Activo() {
        return estado;
    }
    
    public String informacion() {
        return "Serial: " + codigoSerial +
               " | Nro: " + numero +
               " | RAM: " + memoriaRAM + "GB" +
               " | CPU: " + procesador +
               " | Estado: " + (estado ? "Activo" : "Inactivo");
    }
}
