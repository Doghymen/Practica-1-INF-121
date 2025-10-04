/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author Doghy
 */
public class Politico {

    private String profesion;
    private int aniosExp;

    public Politico(String profesion, int aniosExp) {
        this.profesion = profesion;
        this.aniosExp = aniosExp;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    public void mostrarPolitico() {
        System.out.println("Profesion: " + profesion + " | AniosExp: " + aniosExp);
    }
}
