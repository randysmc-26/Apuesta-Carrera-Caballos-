/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaestructura.manejadores;

import com.mycompany.practicaestructura.controlador.ListaApuestas;
import com.mycompany.practicaestructura.principal.Main;

import com.mycompany.practicaestructura.vista.Reportes;

import com.mycompany.practicaestructura.vista.VentanaPrincipal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author randysmc
 */
public class ManejadorArchivos {

    String nombre;
    int monto, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    //ListaApuestas la;
    ManejadorApuesta manejadorApuesta = new ManejadorApuesta();
    int cantLineas = 0;
    int contador = 0;
    String textoEntrada;
    Reportes ventanaReportes;
    VentanaPrincipal ventanaPrincipal;


    public ManejadorArchivos() {
        ventanaPrincipal = new VentanaPrincipal();
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
            String texto = ""; //var para guardar el texto

            while ((linea = br.readLine()) != null) {

                texto += linea + "\n";
                String datos[] = linea.split(",");
                nombre = datos[0];
                monto = Integer.parseInt(datos[1]);
                p1 = Integer.parseInt(datos[2]);
                p2 = Integer.parseInt(datos[3]);
                p3 = Integer.parseInt(datos[4]);
                p4 = Integer.parseInt(datos[5]);
                p5 = Integer.parseInt(datos[6]);
                p6 = Integer.parseInt(datos[7]);
                p7 = Integer.parseInt(datos[8]);
                p8 = Integer.parseInt(datos[9]);
                p9 = Integer.parseInt(datos[10]);
                p10 = Integer.parseInt(datos[11]);
                crearApuesta(nombre, monto, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
                System.out.println(nombre);
                cantLineas++;

            }
            textoEntrada = texto + " ";
            JOptionPane.showMessageDialog(null, "Archivo leido correctamente");

        } catch (Exception e) {

        }
    }

    public void crearApuesta(String nombre, int monto, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10) {
        manejadorApuesta.ingresarApuesta(nombre, monto, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
        //manejadorApuestas.ingresarApuesta(nombre, monto, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
        //manejadorApuestas.ingresarApuesta(nombre, monto, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
        //la.ingresarApostador(nombre, monto, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }

    public void imprimir() {
        manejadorApuesta.ingresarResultados(1,2,3,4,5,6,7,8,9,10);
        manejadorApuesta.imprimir();

    }

 /*public void ingresarResultados() {
     
        int uno = Integer.parseInt(ventanPrincipal.getj1().getText());
        int dos = Integer.parseInt(ventanaIngreso.getjTexto2().getText());
        int tres = Integer.parseInt(ventanaIngreso.getjTexto3().getText());
        int cuatro = Integer.parseInt(ventanaIngreso.getjTexto4().getText());
        int cinco = Integer.parseInt(ventanaIngreso.getjTexto5().getText());
        int seis = Integer.parseInt(ventanaIngreso.getjTexto6().getText());
        int siete = Integer.parseInt(ventanaIngreso.getjTexto7().getText());
        int ocho = Integer.parseInt(ventanaIngreso.getjTexto8().getText());
        int nueve = Integer.parseInt(ventanaIngreso.getjTexto9().getText());
        int diez = Integer.parseInt(ventanaIngreso.getjTexto10().getText());
        
        manejadorApuesta.ingresarResultados(uno, dos, tres, cuatro, cinco,seis,siete,ocho,nueve,diez);
        
()
    }*/

}
