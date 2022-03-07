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
public class Apuesta {
    private Persona persona;
    private ListaCaballos competidores = new ListaCaballos();
    private int contador = 0;

    public Apuesta(Persona persona) {
        this.persona = persona;
        //this.competidores = competidores;
        competidores.iniciarCaballos();
        contador++;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public ListaCaballos getCompetidores() {
        return competidores;
    }

    public void setCompetidores(ListaCaballos competidores) {
        this.competidores = competidores;
    }
    

    
}
