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
    private int codigo;
    private String nombre;
    private int posicionApuesta;
    private int posicionLlegada;
    
    

    public Caballo(int codigo, String nombre, int posicionApuesta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.posicionApuesta = posicionApuesta;
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

    public int getPosicionApuesta() {
        return posicionApuesta;
    }

    public void setPosicionApuesta(int posicionApuesta) {
        this.posicionApuesta = posicionApuesta;
    }

    public int getPosicionLlegada() {
        return posicionLlegada;
    }

    public void setPosicionLlegada(int posicionLlegada) {
        this.posicionLlegada = posicionLlegada;
    }


}
