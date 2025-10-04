/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author Doghy
 */
public class Fruta {
    private String nombre;
    private String tipo;
    private int nroVitaminas;
    private String[] v = new String[30];
    
    
    public Fruta(String nombre, String tipo,String[] vitaminas){
        this.nombre = nombre;
        this.tipo = tipo;
        this.nroVitaminas = vitaminas.length;
        for (int i = 0; i < this.nroVitaminas; i++) {
            v[i] = vitaminas[i];
        }
    }
    
    public void Mostrar(){
        for (int i = 0; i < this.nroVitaminas; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    
    public int vitaminasCitricas(){
        int acum = 0;
        for (int i = 0; i < this.nroVitaminas; i++) {
            if (v[i].equals("C") || v[i].equals("A") || v[i].equals("E")) {
                acum++;
            }
        }
        return acum;
    }
    
    
    public int getNroVitaminas(){
        return this.nroVitaminas;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    
    public String vitaminasConcatenadas(){
        String resultado = "";
        for (int i = 0; i < this.nroVitaminas; i++) {
            resultado += v[i];
        }
        
        return resultado;
    }
}