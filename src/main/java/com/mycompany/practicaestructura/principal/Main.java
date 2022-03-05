/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaestructura.principal;

import com.mycompany.practicaestructura.controlador.Apuesta;
import com.mycompany.practicaestructura.controlador.ListaApuestas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author randysmc
 */
public class Main {

    String nombre;
    int monto, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    //Persona[] persona;
    //Apuesta [] apuesta = new Apuesta[100];
    ListaApuestas la = new ListaApuestas();
    int cantLineas=0;
    int contador = 0;
    
    public Main(){
        //personas = new ListaPersonas[100];
    }
    


public static void main(String[] args) {
    Main m = new Main();
    m.leerArhivo();
    //m.imprimirArreglo();
    //m.crearApuesta("Nacho", 150, 0);
    //m.crearApuesta("pedro", 180, 10);
    //m.crearApuesta("Don Omar", 250, 5);
    m.imprimir();

    }

       public void leerArhivo() {
        JFileChooser fc = new JFileChooser(); //Ventana donde podremos escoger nuestro archivo
        fc.showOpenDialog(null);//abre el cuadro de dialogo con un campo nulo
        File archivo = fc.getSelectedFile();//file para seleccionar
        String nombreArchivo = archivo.getName();
        String linea;

        try {
            FileReader fr = new FileReader(archivo); //al filereader le pasamos el parametro var del archivo
            BufferedReader br = new BufferedReader(fr);//reservamos memoria para escribir
            //String texto=""; //var para guardar el texto
            

            while ((linea = br.readLine()) != null) {
                String datos[] = linea.split(",");
                //String[] nombre = new String[50];
                nombre = datos[0];
                monto = Integer.parseInt(datos[1]);
                p1 = Integer.parseInt(datos[2]);
                p2 = Integer.parseInt(datos[3]);
                p3 = Integer.parseInt(datos[3]);
                p4 = Integer.parseInt(datos[2]);
                p5 = Integer.parseInt(datos[3]);
                p6 = Integer.parseInt(datos[2]);
                p7 = Integer.parseInt(datos[3]);
                p8 = Integer.parseInt(datos[2]);
                p9 = Integer.parseInt(datos[3]);
                p10 = Integer.parseInt(datos[2]);
                crearApuesta(nombre, monto, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
                    
                //persona[cantLineas-1] = new Persona(0, datos[0], Integer.parseInt(datos[1]));
                cantLineas++;
                //System.out.println(cantLineas);
            }
            //textoEntrada = texto+" ";
            JOptionPane.showMessageDialog(null, "Archivo leido correctamente");
            //System.out.println(cantLineas);
            //System.out.println(textoEntrada);

        } catch (Exception e) {

        }
}
       
      /* public void imprimirArreglo(){
           for (int i = 0; i < contador; i++) {
               System.out.println("Llegue a la funcion imprimirArreglo?");
               personas[i].mostrarCompetidores();
           }
           //persona[0] = new Persona(0, "nacho", 10);
           /*for (int i = 0; i <cantLineas; i++) {
               System.out.println("Nombre: " +personas[i].getPersonas()[i].getNombre()+ " Aposte: Q: " + personas[i].getPersonas()[i].getMontoApuesta());
           }
       }*/
       
        
       public void crearApuesta(String nombre, int monto, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10){
           /*System.out.println(nombre);
           System.out.println(monto);
           System.out.println(p1);*/
           
           /*la.ingresarApostador("Jose", 15, 0);
           la.ingresarApostador("Marco", 20,2);*/
           la.ingresarApostador(nombre, monto, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
           //la.imprimir();
           /*
           apuesta[contador] = new Apuesta();
           apuesta[contador].crearApuesta(nombre, monto);*/
           //contador++;
       }
       
       public void imprimir(){
           la.imprimir();
       }
    
 
}