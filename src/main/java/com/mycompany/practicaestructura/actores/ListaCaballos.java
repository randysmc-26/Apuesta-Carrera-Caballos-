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
        competidores[1] = new Caballo(1, "Manjiro sano", 0);
        competidores[2] = new Caballo(2, "Mc Queen", 0);
        competidores[3] = new Caballo(3, "Casio", 0);
        competidores[4] = new Caballo(4, "Killua", 0);
        competidores[5] = new Caballo(5, "Charmander", 0);
        competidores[6] = new Caballo(6, "Sputnik v", 0);
        competidores[7] = new Caballo(7, "CR7", 0);
        competidores[8] = new Caballo(8, "Pepsi", 0);
        competidores[9] = new Caballo(9, "Gokú", 0);
        
    }

    public Caballo[] getCompetidores() {
        return competidores;
    }

    public void setCompetidores(Caballo[] competidores) {
        this.competidores = competidores;
    }
    
    
    
    
}
