/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaestructura.controlador;

import com.mycompany.practicaestructura.actores.*;

/**
 *
 * @author randysmc
 */
public class ListaApuestas {

    Apuesta[] apuestas = new Apuesta[100];
    int contador = 0;

    public ListaApuestas() {
        
    }

    public void ingresarApostador(String nombre, int monto, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10) {
        apuestas[contador] = new Apuesta(new Persona(contador, nombre, monto));
        apuestas[contador].getCompetidores().getCompetidores()[0].setPosicionApuesta(p1);
        apuestas[contador].getCompetidores().getCompetidores()[0].setPosicionApuesta(p2);
        apuestas[contador].getCompetidores().getCompetidores()[0].setPosicionApuesta(p3);
        apuestas[contador].getCompetidores().getCompetidores()[0].setPosicionApuesta(p4);
        
        //System.out.println(apuestas[contador].getCompetidores());
        
       /* apuestas[contador].getCompetidores().competidores[0].setPosicionApuesta(p1);
        apuestas[contador].getCompetidores().competidores[1].setPosicionApuesta(p2);
        apuestas[contador].getCompetidores().competidores[2].setPosicionApuesta(p3);
        apuestas[contador].getCompetidores().competidores[3].setPosicionApuesta(p4);
        apuestas[contador].getCompetidores().competidores[4].setPosicionApuesta(p5);
        apuestas[contador].getCompetidores().competidores[5].setPosicionApuesta(p6);
        apuestas[contador].getCompetidores().competidores[6].setPosicionApuesta(p7);
        apuestas[contador].getCompetidores().competidores[7].setPosicionApuesta(p8);
        apuestas[contador].getCompetidores().competidores[8].setPosicionApuesta(p9);
        apuestas[contador].getCompetidores().competidores[9].setPosicionApuesta(p10);*/
        
        //System.out.println("El contador antes del incremento es: "+ contador);
        incrementarContador();
        //System.out.println("El contador es: " +contador);
    }
    
    public void incrementarContador(){
        contador++;
    }

    public void imprimir() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Mi nombre es: "+ apuestas[i].persona.getNombre() + " aposte: Q" +apuestas[i].persona.getMontoApuesta());
            for (int j = 0; j < 10; j++) {
                            System.out.print("Mi caballo: " + apuestas[i].getCompetidores().getCompetidores()[j].getNombre());
            System.out.println(" quedara en: "+apuestas[i].getCompetidores().getCompetidores()[j].getPosicionApuesta());
            }
            
        }
            /*System.out.println(apuestas[0].persona.getNombre());
            System.out.println(apuestas[0].persona.getMontoApuesta());
            System.out.println(apuestas[0].getCompetidores().competidores[0].getPosicionApuesta());
            System.out.println("Contador: "+contador);
            System.out.println(apuestas[1].persona.getNombre());
            System.out.println(apuestas[1].persona.getMontoApuesta());
            System.out.println(apuestas[1].getCompetidores().competidores[0].getPosicionApuesta());*/
    }

    public int getContador() {
        return contador;
    }


}
