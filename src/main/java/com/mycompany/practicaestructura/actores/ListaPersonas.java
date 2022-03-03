/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaestructura.actores;

/**
 *
 * @author randysmc
 */
public class ListaPersonas {
    private Persona[] personas = new Persona[50];
    private int siguientePos;
    

    public ListaPersonas(){
        siguientePos = 1;
    }

    //agregar clientes
    public void agregarPersona(String nombre, int telefono){
        if (siguientePos > 50){
            System.out.println("Límite de apostadores alcanzado");
        }
        else{
            personas[(siguientePos-1)] = new Persona(nombre);
        }
        siguientePos++;
    }

    public void agregarPersona(String nombre){

        agregarPersona(nombre);
    }
    
    public void agregarMonto(int monto){
        personas[siguientePos-1].setDinero(monto);
        
    }
    
    
    public void agregarOrdenCaballos(int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10){
        personas[siguientePos -1].getCaballos()[0].setPosLlegada(p1);
        personas[siguientePos -1].getCaballos()[1].setPosLlegada(p1);
        personas[siguientePos -1].getCaballos()[2].setPosLlegada(p1);
        personas[siguientePos -1].getCaballos()[3].setPosLlegada(p1);
        personas[siguientePos -1].getCaballos()[4].setPosLlegada(p1);
        personas[siguientePos -1].getCaballos()[5].setPosLlegada(p1);
        personas[siguientePos -1].getCaballos()[6].setPosLlegada(p1);
        personas[siguientePos -1].getCaballos()[7].setPosLlegada(p1);
        personas[siguientePos -1].getCaballos()[8].setPosLlegada(p1);
        personas[siguientePos -1].getCaballos()[9].setPosLlegada(p1);   
    }
    
    public boolean verificarApuesta(){
        for (int i = 0; i < personas[siguientePos-1].getCaballos().length; i++) {
            
        }
        return true;
    }


    // fin agregar clientes

    public void mostrarPersonas(){
        System.out.println("\n\n Clientes de memorabilia");
        for (int i = 0; i < (siguientePos-1); i++) {
            System.out.println("-"+i+") "+personas[i].getNombre());
            //System.out.println("-"+i+") "+clientes[i].getId() + " nombre "+clientes[i].getNombre()+ " telefono "+clientes[i].getTelefono());
            
        }

        System.out.println("\n\n");
    }


    //Ordenamiento metodo burbuja
    public void ordenarPorNombre(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (siguientePos-1); i++) {
            for (int j = 0; j < (siguientePos-1-i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente)
                    cambio= (personas[j].getNombre().compareTo(personas[j+1].getNombre()) > 0 );
                else 
                    cambio= (personas[j].getNombre().compareTo(personas[j+1].getNombre()) < 0 );

                if(cambio ){
                    //clientes i va antes que clientes j <0 descendente
                    Persona aux = personas[j];
                    personas[j] = personas[j+1];
                    personas[j+1]= aux;
                }
            }
        }

    }

    public int getSiguientePos() {
        return siguientePos;
    }

    public void setSiguientePos(int siguientePos) {
        this.siguientePos = siguientePos;
    }
    
    


    
}
