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
    private int codigo;
    private String nombre;
    private int montoApuesta;
    private int dinero;
    private int ganancia=0;
    private int apuestasAcertadas=0;

    public Persona(int codigo, String nombre, int montoApuesta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.montoApuesta = montoApuesta;
        
    }

    public int getApuestasAcertadas() {
        return apuestasAcertadas;
    }

    public void setApuestasAcertadas(int apuestasAcertadas) {
        this.apuestasAcertadas = apuestasAcertadas;
    }
    
    
    

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMontoApuesta() {
        return montoApuesta;
    }

    public void setMontoApuesta(int montoApuesta) {
        this.montoApuesta = montoApuesta;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
   
    
    
    
}
