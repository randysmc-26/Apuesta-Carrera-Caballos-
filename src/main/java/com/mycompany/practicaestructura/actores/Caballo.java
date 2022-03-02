/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaestructura.actores;

/**
 *
 * @author randysmc
 */
public class Caballo {
    
    private int id;
    private int posLlegada;
    private int x=10;
    private Caballo[] caballos = new Caballo[x];
    
    public Caballo(int id){
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosLlegada() {
        return posLlegada;
    }

    public void setPosLlegada(int posLlegada) {
        this.posLlegada = posLlegada;
    }
    

}
