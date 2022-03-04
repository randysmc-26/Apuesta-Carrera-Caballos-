/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaestructura.principal;

import com.mycompany.practicaestructura.controlador.Apuesta;
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

    //String textoEntrada;
    Apuesta apuesta;
    String nombre, nombreArchivo;
    int monto, p1, p2;

    public static void main(String[] args) {

        //Apuesta ap1 = new Apuesta("Nacho", 15, 2, 8);
        //ap1.verApuesta();
        Main m = new Main();
        m.leerArhivo();

        //m.mostarTexto();
        

    }

    public void mostarTexto() {
        //System.out.println(textoEntrada);
        //System.out.println();
    }

    /*public void leerArchivo(){
     JFileChooser fc = new JFileChooser(); //Ventana donde podremos escoger nuestro archivo
     fc.showOpenDialog(null);//abre el cuadro de dialogo con un campo nulo
     File archivo = fc.getSelectedFile();//file para seleccionar
     String nombreArchivo = archivo.getName();
     //System.out.println(nombre);
     
        //System.out.println(archivos);  
        try {
            FileReader fr = new FileReader(archivo); //al filereader le pasamos el parametro var del archivo
            BufferedReader br = new BufferedReader(fr);//reservamos memoria para escribir
            String texto=""; //var para guardar el texto
            String linea="";
            
            while ((linea=br.readLine()) != null ) {
               String datos[] = linea.split(",");
                nombre = String.valueOf(datos[0]);
                monto = Integer.parseInt(datos[1]);
                p1 = Integer.parseInt(datos[2]);
                p2 = Integer.parseInt(datos[3]);
                Apuesta ap1 = new Apuesta(nombre, monto, p1, p2);
                ap1.verApuesta();
                System.out.println("Llegue aqui?");
                texto+=linea+"\n"; 
                
            }
            textoEntrada = texto+" ";
            JOptionPane.showMessageDialog(null,"Archivo leido correctamente");
            //System.out.println(textoEntrada);
            
        } catch (Exception e) {
            
        } 
        //return textoEntrada;
        
    }*/
 /*
    public String leerArchivo(){
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File archivo = fc.getSelectedFile();
        
        
        StringBuilder sb = new StringBuilder();
        try(Scanner s = new Scanner(archivo)){
            
            s.useDelimiter("\n");
            while(s.hasNext()){
                sb.append(s.next()).append("\n");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
        textoEntrada = sb.toString();
        return textoEntrada;
    }
     */
    public void leerArhivo(){
     JFileChooser fc = new JFileChooser(); //Ventana donde podremos escoger nuestro archivo
     fc.showOpenDialog(null);//abre el cuadro de dialogo con un campo nulo
     File archivo = fc.getSelectedFile();//file para seleccionar
     nombreArchivo = archivo.getName();
     String linea;
     
     //System.out.println(nombre);
     
        //System.out.println(archivos);  
        try {
            FileReader fr = new FileReader(archivo); //al filereader le pasamos el parametro var del archivo
            BufferedReader br = new BufferedReader(fr);//reservamos memoria para escribir
            //String texto=""; //var para guardar el texto
            
            
            while ((linea=br.readLine()) != null ) {
                String datos[] = linea.split(",");
                nombre = datos[0];
                monto = Integer.parseInt(datos[1]);
                p1 = Integer.parseInt(datos[2]);
                p2 = Integer.parseInt(datos[3]);
                System.out.println("Nombre:"+ nombre);
                System.out.println("Monto:"+ monto);
                System.out.println("Posicion:"+ p1);
                apuesta = new Apuesta(nombre, monto, p1, p2);
                

                
            }
            //textoEntrada = texto+" ";
            JOptionPane.showMessageDialog(null,"Archivo leido correctamente");
            //System.out.println(textoEntrada);
            
        } catch (Exception e) {
            
            
        } 
        //return textoEntrada;
        
    }
    

    

}
