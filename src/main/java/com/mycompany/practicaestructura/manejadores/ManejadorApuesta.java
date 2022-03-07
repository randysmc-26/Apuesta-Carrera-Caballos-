/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaestructura.manejadores;

import com.mycompany.practicaestructura.controlador.ListaApuestas;

/**
 *
 * @author randysmc
 */
public class ManejadorApuesta {

    String nombre;
    int monto, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    ListaApuestas la = new ListaApuestas();
    int cantLineas=0;
    int contador = 0;
    String textoEntrada;
    
    
    
    
    public void ingresarApuesta(String nombre, int monto, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10){
        la.ingresarApostador(nombre, monto, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }
    
    public void ingresarResultados(){
        la.ingresarResultados(2,4,6,7,8,9,1,0,15,18);
    }
    
    public void validarApuesta(){
        /*la.verificarApuesta();
        la.imprimirValida();*/
    }
    

    
    
    public void imprimir(){
        la.imprimirGeneral();
        la.verificarApuesta();
        System.out.println("Estas son las apuestas validadas");
        la.imprimirValida();
    }
}
