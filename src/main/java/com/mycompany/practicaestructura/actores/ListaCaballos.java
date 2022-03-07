/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaestructura.actores;

/**
 *
 * @author randysmc
 */
public class ListaCaballos {
    
    Caballo[] competidores;
    
    public ListaCaballos(){
        competidores = new Caballo[10];
        iniciarCaballos();
        
    }
    
    public void iniciarCaballos(){
        competidores[0] = new Caballo(0, "Juancho", 0);
        competidores[1] = new Caballo(1, "Mickey", 0);
        competidores[2] = new Caballo(2, "Mc Queen", 0);
        competidores[3] = new Caballo(3, "C++", 0);
        competidores[4] = new Caballo(4, "Killua", 0);
        competidores[5] = new Caballo(5, "Eren Tatakae", 0);
        competidores[6] = new Caballo(6, "Sputnik v", 0);
        competidores[7] = new Caballo(7, "CR7", 0);
        competidores[8] = new Caballo(8, "Jamón", 0);
        competidores[9] = new Caballo(9, "Gokú", 0);
        
    }
    
    public void ingresarLlegada(int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10){
        competidores[0].setPosicionLlegada(p1);
        competidores[1].setPosicionLlegada(p2);
        competidores[2].setPosicionLlegada(p3);
        competidores[3].setPosicionLlegada(p4);
        competidores[4].setPosicionLlegada(p5);
        competidores[5].setPosicionLlegada(p6);
        competidores[6].setPosicionLlegada(p7);
        competidores[7].setPosicionLlegada(p8);
        competidores[8].setPosicionLlegada(p9);
        competidores[9].setPosicionLlegada(p10);
    }

    public Caballo[] getCompetidores() {
        return competidores;
    }

    public void setCompetidores(Caballo[] competidores) {
        this.competidores = competidores;
    }
    
    
    
    
}
