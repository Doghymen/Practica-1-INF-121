/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15;

/**
 *
 * @author Doghy
 */
public class Triatleta implements Nadador, Ciclista, Corredor {
    // atributos “heredados” conceptualmente (triátlón: natación, ciclismo, carrera)

    private String estiloNatacion;
    private String tipoBicicleta;
    private double distanciaPreferida;

    public Triatleta(String estiloNatacion, String tipoBicicleta, double distanciaPreferida) {
        this.estiloNatacion = estiloNatacion;
        this.tipoBicicleta = tipoBicicleta;
        this.distanciaPreferida = distanciaPreferida;
    }

// Implementación de getters/setters requeridos por las interfaces
    @Override
    public String getEstiloNatacion() {
        return estiloNatacion;
    }

    @Override
    public void setEstiloNatacion(String estilo) {
        this.estiloNatacion = estilo;
    }

    @Override
    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    @Override
    public void setTipoBicicleta(String tipo) {
        this.tipoBicicleta = tipo;
    }

    @Override
    public double getDistanciaPreferida() {
        return distanciaPreferida;
    }

    @Override
    public void setDistanciaPreferida(double distancia) {
        this.distanciaPreferida = distancia;
    }

    @Override
    public String toString() {
        return String.format("{estiloNatacion='%s', tipoBicicleta='%s', distanciaPreferida=%.2f km}",
                estiloNatacion, tipoBicicleta, distanciaPreferida);
    }
}
