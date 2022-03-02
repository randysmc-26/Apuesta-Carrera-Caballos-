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
public class ListaCompetidores {
    Scanner teclado = new Scanner(System.in);
    private int x = 10;
    Persona[] personas = new Persona[x];
    private int siguientePos;

    public ListaCompetidores() {
        siguientePos = 1;
    }

    //agregar clientes
    public void agregarParticipante(String nombre) {
        if (siguientePos > x) {
            System.out.println("Límite de apostadores alcanzado");
        } else {
            personas[(siguientePos - 1)] = new Persona(nombre);
        }
        siguientePos++;
    }
    

    public void agregarParticipante() {
        String nombre = teclado.nextLine();
        agregarParticipante(nombre);
    }
    
    public void agregarApuesta(){
        System.out.println("Ingrese el numero del participante");
        int participante = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i < personas[participante].getCaballos().length; i++) {
            System.out.println("Ingrese el orden de llegada de los caballos");
            int posLlegada = Integer.parseInt(teclado.nextLine());
            personas[participante].getCaballos()[i].setPosLlegada(posLlegada);

        }
    }
    
    public void mostrarApuesta(){
        agregarApuesta();
        for (int i = 0; i < siguientePos; i++) {
            for (int j = 0; j < personas[i].getCaballos().length; j++) {
                System.out.println(personas[i].getNombre());
                System.out.println("Orden: " + personas[i].getCaballos()[j].getPosLlegada() + " ***");
            }
        }
    }
    
}
