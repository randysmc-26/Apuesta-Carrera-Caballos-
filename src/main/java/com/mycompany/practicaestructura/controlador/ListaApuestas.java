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

    private Apuesta[] apuestas = new Apuesta[1000];
    private int contador = 0;
    private ListaCaballos competidores;

    public ListaApuestas() {
        
    }
    
    
    
    /*public void ingresarRestulados(int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10){
        competidores.ingresarLlegada(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
          
    }*/

    public void ingresarApostador(String nombre, int monto, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10) {
        //System.out.println("pos1 "+p1 +" pos2 " +p2 +" pos3 "+p3 +" pos4 "+ p4+" pos 5 "+p5);
        apuestas[contador] = new Apuesta(new Persona(contador, nombre, monto));
        apuestas[contador].getCompetidores().getCompetidores()[0].setPosicionApuesta(p1);
        apuestas[contador].getCompetidores().getCompetidores()[1].setPosicionApuesta(p2);
        apuestas[contador].getCompetidores().getCompetidores()[2].setPosicionApuesta(p3);
        apuestas[contador].getCompetidores().getCompetidores()[3].setPosicionApuesta(p4);
        apuestas[contador].getCompetidores().getCompetidores()[4].setPosicionApuesta(p5);
        apuestas[contador].getCompetidores().getCompetidores()[5].setPosicionApuesta(p6);
        apuestas[contador].getCompetidores().getCompetidores()[6].setPosicionApuesta(p7);
        apuestas[contador].getCompetidores().getCompetidores()[7].setPosicionApuesta(p8);
        apuestas[contador].getCompetidores().getCompetidores()[8].setPosicionApuesta(p9);
        apuestas[contador].getCompetidores().getCompetidores()[9].setPosicionApuesta(p10);
        
        
        apuestas[contador].getCompetidores().getCompetidores()[0].setPosicionLlegada(2);
        apuestas[contador].getCompetidores().getCompetidores()[1].setPosicionLlegada(4);
        apuestas[contador].getCompetidores().getCompetidores()[2].setPosicionLlegada(6);
        apuestas[contador].getCompetidores().getCompetidores()[3].setPosicionLlegada(7);
        apuestas[contador].getCompetidores().getCompetidores()[4].setPosicionLlegada(10);
        apuestas[contador].getCompetidores().getCompetidores()[5].setPosicionLlegada(0);
        apuestas[contador].getCompetidores().getCompetidores()[6].setPosicionLlegada(15);
        apuestas[contador].getCompetidores().getCompetidores()[7].setPosicionLlegada(20);
        apuestas[contador].getCompetidores().getCompetidores()[8].setPosicionLlegada(30);
        apuestas[contador].getCompetidores().getCompetidores()[9].setPosicionLlegada(55);
       incrementarContador();
       

    }
    
    public void ingresarResultados(){
        
    }

    public void incrementarContador() {
        contador++;
    }

    public void imprimir() {
        
        for (int i = 0; i < contador; i++) {
            System.out.println("Nombre: "+ apuestas[i].getPersona().getNombre() + " aposte: Q " + apuestas[i].getPersona().getMontoApuesta());
            //System.out.println("Mi nombre es: " + apuestas[i].persona.getNombre() + " aposte: Q" + apuestas[i].persona.getMontoApuesta());
            for (int j = 0; j < 10; j++) {
                System.out.print("Mi caballo: " + apuestas[i].getCompetidores().getCompetidores()[j].getNombre());
                System.out.println(" quedara en: " + apuestas[i].getCompetidores().getCompetidores()[j].getPosicionApuesta());
                System.out.println(" lugar de competencia: " +apuestas[i].getCompetidores().getCompetidores()[j].getPosicionLlegada());
            }
            System.out.println("\n\n");
        }

        System.out.println(contador);
    }

    public int getContador() {
        return contador;
    }

    public Apuesta[] getApuestas() {
        return apuestas;
    }

    public void setApuestas(Apuesta[] apuestas) {
        this.apuestas = apuestas;
    }
    
    

}
