/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaestructura.manejadores;

import com.mycompany.practicaestructura.controlador.ListaApuestas;
import java.util.Scanner;
import javax.swing.JTable;

/**
 *
 * @author randysmc
 */
public class ManejadorApuesta {

    String nombre;
    int monto, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    ListaApuestas la = new ListaApuestas();
    int cantLineas = 0;
    int contador = 0;
    String textoEntrada;
    double tInicio=0, tFinal=0, tInicioVer=0, tFinalVer=0, tInicioRes=0, tFinalRes=0;
    double tiempoTotal=0, totalVer=0, totalRes=0;
    Scanner teclado = new Scanner(System.in);
    

    public void ingresarApuesta(String nombre, int monto, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10) {
        la.ingresarApostador(nombre, monto, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
        System.out.println("llegue aca?");
        //la.ingresarResultados(1,2,3,4,5,6,7,8,9,10);
        //la.imprimirListadoApuestas(la.getApuestas(), la.getContadorIngreso());
        //la.ingresarResultados(1,2,3,4,5,6,7,8,9,10);
    }

    public void ingresarResultados(int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10) {
        la.ingresarResultados(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
        //la.imprimirLlegadaCaballos();
    }

    public void validarApuesta() {
        /*la.verificarApuesta();
        la.imprimirValida();*/
    }

    public void imprimir() {
        tInicio = System.currentTimeMillis();
        la.imprimirListadoApuestas(la.getApuestas(), la.getContadorIngreso());
        tFinal = System.currentTimeMillis();
        tiempoTotal = tFinal - tInicio;
        System.out.println("El tiempo para Procesar la apuesta fue de: " +tiempoTotal);
        System.out.println("Verificar Apuestas");
        teclado.nextLine();
        tInicioVer = System.currentTimeMillis();
        la.verificarApuesta();
        System.out.println("Estas son las apuestas validadas\n");
        tFinalVer =System.currentTimeMillis();
        la.imprimirListadoApuestas(la.getApuestaValida(), la.getContadorApuestaValida());
        totalVer = tInicioVer - tFinalVer;
        System.out.println("Tiempo para verificar las apuestas: " +totalVer);
        System.out.println("Mostrar apuestas no validas");

        System.out.println("Apuestas que no fueron validadas");
        la.imprimirListadoApuestas(la.getApuestaNoValida(), la.getContadorApuestaNoValida());
        System.out.println("Los resultados");
        teclado.nextLine();
        tInicioRes = System.currentTimeMillis();
        la.calculoDeResultados(la.getApuestaValida());
        la.imprimirResultados(la.getApuestaValida(), la.getContadorApuestaValida());
        tFinalRes = System.currentTimeMillis();
        totalRes= tInicioRes - tFinalRes;
        System.out.println("Tiempo para verificar Resultados: " +totalRes);
        
        //la.imprimirResultados(la.getApuestaValida(), contador);
        la.ordenarPorNombre(la.getApuestaValida(), la.getContadorApuestaValida());
        la.ordenarPorGanancia(la.getApuestaValida(), la.getContadorApuestaValida());
    }

    public void getTablaResultados(JTable tabla) {
        //System.out.println(textoBusqueda);
        //int tamano =1;
        int tamano = la.getContadorApuestaValida();
        String matriz[][] = new String[tamano][4];
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][0] = String.valueOf(la.getApuestaValida()[j].getPersona().getCodigo());
                matriz[i][1] = String.valueOf(la.getApuestaValida()[j].getPersona().getNombre());
                matriz[i][2] = String.valueOf(la.getApuestaValida()[j].getPersona().getMontoApuesta());
                matriz[i][3] = String.valueOf(la.getApuestaValida()[j].getPersona().getGanancia());
            }

        }
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Id", "Nombre", "Dinero", "Ganancia"
                }
        ));

    }
    
    

}
