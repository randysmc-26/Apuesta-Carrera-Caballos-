/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaestructura.actores;

import java.util.Scanner;

/**
 *
 * @author randysmc
 */
public class Persona {

    private String nombre;
    private int puntaje = 0;
    private int dinero = 5000;
    private Caballo[] caballos = new Caballo[10];

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCaballos() {
        for (int i = 0; i < caballos.length; i++) {
            caballos[i] = new Caballo(i);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public Caballo[] getCaballos() {
        return caballos;
    }

    public void setCaballos(Caballo[] caballos) {
        this.caballos = caballos;
    }
    
    public void imprimirCaballos(){
        for (int i = 0; i <caballos.length; i++) {
            System.out.println("Caballo No. " + caballos[i].getId());
        }
    }

}
