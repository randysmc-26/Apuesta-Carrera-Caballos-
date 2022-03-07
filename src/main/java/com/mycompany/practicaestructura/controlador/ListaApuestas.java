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
public class ListaApuestas {

    private Apuesta[] apuestas = new Apuesta[1000];
    private Apuesta[] apuestaValida = new Apuesta[1000];
    private Apuesta[] apuestaNoValida = new Apuesta[1000];
    private int contadorIngreso = 0;
    private int contadorApuestaValida = 0;
    private int contadorApuestaNoValida = 0;
    private ListaCaballos competidores;
    private boolean estaRepetido;

    public ListaApuestas() {

    }

    /*
    ** Esta funcion me ayuda para ingresar un nuevo apostador, recibe los parametros correspondientes
    **
     */
    public void ingresarApostador(String nombre, int monto, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10) {
        //System.out.println("pos1 "+p1 +" pos2 " +p2 +" pos3 "+p3 +" pos4 "+ p4+" pos 5 "+p5);

        apuestas[contadorIngreso] = new Apuesta(new Persona(contadorIngreso, nombre, monto));
        apuestas[contadorIngreso].getCompetidores().getCompetidores()[0].setPosicionApuesta(p1);
        apuestas[contadorIngreso].getCompetidores().getCompetidores()[1].setPosicionApuesta(p2);
        apuestas[contadorIngreso].getCompetidores().getCompetidores()[2].setPosicionApuesta(p3);
        apuestas[contadorIngreso].getCompetidores().getCompetidores()[3].setPosicionApuesta(p4);
        apuestas[contadorIngreso].getCompetidores().getCompetidores()[4].setPosicionApuesta(p5);
        apuestas[contadorIngreso].getCompetidores().getCompetidores()[5].setPosicionApuesta(p6);
        apuestas[contadorIngreso].getCompetidores().getCompetidores()[6].setPosicionApuesta(p7);
        apuestas[contadorIngreso].getCompetidores().getCompetidores()[7].setPosicionApuesta(p8);
        apuestas[contadorIngreso].getCompetidores().getCompetidores()[8].setPosicionApuesta(p9);
        apuestas[contadorIngreso].getCompetidores().getCompetidores()[9].setPosicionApuesta(p10);
        incrementarContadorIngreso(); //me incrementa el numero de posicion del arreglo por cada nuevo usuario que ingrese una apuesta

    }

    /**
     ** Esta funcion me sirve para ingresar los resultados despues de ingresar
     * una nueva apuesta, se compara con las apuestas validadas
     *
     */
    public void ingresarResultados(int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10) {

        //Aqui se utiliza el contador de apuestas aprobadas
        for (int i = 0; i < contadorIngreso; i++) {

            apuestas[i].getCompetidores().getCompetidores()[0].setPosicionLlegada(p1);
            apuestas[i].getCompetidores().getCompetidores()[1].setPosicionLlegada(p2);
            apuestas[i].getCompetidores().getCompetidores()[2].setPosicionLlegada(p3);
            apuestas[i].getCompetidores().getCompetidores()[3].setPosicionLlegada(p4);
            apuestas[i].getCompetidores().getCompetidores()[4].setPosicionLlegada(p5);
            apuestas[i].getCompetidores().getCompetidores()[5].setPosicionLlegada(p6);
            apuestas[i].getCompetidores().getCompetidores()[6].setPosicionLlegada(p7);
            apuestas[i].getCompetidores().getCompetidores()[7].setPosicionLlegada(p8);
            apuestas[i].getCompetidores().getCompetidores()[8].setPosicionLlegada(p9);
            apuestas[i].getCompetidores().getCompetidores()[9].setPosicionLlegada(p10);
        }
    }

    public void verificarApuesta() {
        for (int i = 0; i < contadorIngreso; i++) {
            int x = 0;
            int uno = apuestas[i].getCompetidores().getCompetidores()[0].getPosicionApuesta();
            int dos = apuestas[i].getCompetidores().getCompetidores()[1].getPosicionApuesta();
            int tres = apuestas[i].getCompetidores().getCompetidores()[2].getPosicionApuesta();
            int cuatro = apuestas[i].getCompetidores().getCompetidores()[3].getPosicionApuesta();
            int cinco = apuestas[i].getCompetidores().getCompetidores()[4].getPosicionApuesta();
            int seis = apuestas[i].getCompetidores().getCompetidores()[5].getPosicionApuesta();
            int siete = apuestas[i].getCompetidores().getCompetidores()[6].getPosicionApuesta();
            int ocho = apuestas[i].getCompetidores().getCompetidores()[7].getPosicionApuesta();
            int nueve = apuestas[i].getCompetidores().getCompetidores()[8].getPosicionApuesta();
            int diez = apuestas[i].getCompetidores().getCompetidores()[9].getPosicionApuesta();

            if ((uno != dos) && (uno != tres) && (uno != cuatro) && (uno != cinco) && (uno != seis) && (uno != siete) && (uno != ocho) && (uno != nueve) && (uno != diez)) {
                if ((dos != tres) && (dos != cuatro) && (dos != cinco) && (dos != seis) && (dos != siete) && (dos != ocho) && (dos != nueve) && (dos != diez)) {
                    if ((tres != cuatro) && (tres != cinco) && (tres != seis) && (tres != siete) && (tres != ocho) && (tres != nueve) && (tres != diez)) {
                        if ((cuatro != cinco) && (cuatro != seis) && (cuatro != siete) && (cuatro != ocho) && (cuatro != nueve) && (cuatro != diez)) {
                            if ((cinco != seis) && (cinco != siete) && (cinco != ocho) && (cinco != nueve) && (cinco != diez)) {
                                if ((seis != siete) && (seis != ocho) && (seis != nueve) && (seis != diez)) {
                                    if ((siete != ocho) && (siete != nueve) && (siete != diez)) {
                                        if ((ocho != nueve) && (ocho != diez)) {
                                            if ((nueve != diez)) {

                                                apuestaValida[contadorApuestaValida] = apuestas[i];
                                                contadorApuestaValida++;
                                            } else {
                                                apuestaNoValida[contadorApuestaNoValida] = apuestas[i];
                                                contadorApuestaNoValida++;
                                            }
                                        } else {

                                            apuestaNoValida[contadorApuestaNoValida] = apuestas[i];
                                            contadorApuestaNoValida++;
                                        }
                                    } else {
                                        apuestaNoValida[contadorApuestaNoValida] = apuestas[i];
                                        contadorApuestaNoValida++;
                                    }
                                } else {
                                    apuestaNoValida[contadorApuestaNoValida] = apuestas[i];
                                    contadorApuestaNoValida++;

                                }
                            } else {
                                apuestaNoValida[contadorApuestaNoValida] = apuestas[i];
                                contadorApuestaNoValida++;
                            }
                        } else {
                            apuestaNoValida[contadorApuestaNoValida] = apuestas[i];
                            contadorApuestaNoValida++;
                        }
                    } else {
                        apuestaNoValida[contadorApuestaNoValida] = apuestas[i];
                        contadorApuestaNoValida++;
                    }
                } else {
                    apuestaNoValida[contadorApuestaNoValida] = apuestas[i];
                    contadorApuestaNoValida++;
                }
            } else {
                apuestaNoValida[contadorApuestaNoValida] = apuestas[i];
                contadorApuestaNoValida++;
            }
            /*apuestaNoValida[contadorApuestaNoValida] = apuestas[i];
            contadorApuestaNoValida++;*/

        }

    }

    public void crearNuevaApuesta(Apuesta[] apN, int contador, Apuesta[] ap, int it) {
        apN[contador] = ap[it];
        contador++;
    }

    public void entregarResultados(Apuesta[] ap, int contador) {
        for (int i = 0; i < contador; i++) {

        }
    }

    public void incrementarContadorIngreso() {
        contadorIngreso++;
    }

    public void calculoDeResultados(Apuesta[] ap) {
        System.out.println("Estoy llegando al calculo de resultados \n\n\n");
        for (int i = 0; i < contadorApuestaValida; i++) {
            if (ap[i].getCompetidores().getCompetidores()[0].getPosicionApuesta() == ap[i].getCompetidores().getCompetidores()[0].getPosicionLlegada()) {
                ap[i].getPersona().setGanancia(ap[i].getPersona().getGanancia() + 10);
            }
            if (ap[i].getCompetidores().getCompetidores()[1].getPosicionApuesta() == ap[i].getCompetidores().getCompetidores()[1].getPosicionLlegada()) {
                ap[i].getPersona().setGanancia(ap[i].getPersona().getGanancia() + 9);
            }
            if (ap[i].getCompetidores().getCompetidores()[2].getPosicionApuesta() == ap[i].getCompetidores().getCompetidores()[2].getPosicionLlegada()) {
                ap[i].getPersona().setGanancia(ap[i].getPersona().getGanancia() + 8);
            }
            if (ap[i].getCompetidores().getCompetidores()[3].getPosicionApuesta() == ap[i].getCompetidores().getCompetidores()[3].getPosicionLlegada()) {
                ap[i].getPersona().setGanancia(ap[i].getPersona().getGanancia() + 7);
            }
            if (ap[i].getCompetidores().getCompetidores()[4].getPosicionApuesta() == ap[i].getCompetidores().getCompetidores()[4].getPosicionLlegada()) {
                ap[i].getPersona().setGanancia(ap[i].getPersona().getGanancia() + 6);
            }
            if (ap[i].getCompetidores().getCompetidores()[5].getPosicionApuesta() == ap[i].getCompetidores().getCompetidores()[5].getPosicionLlegada()) {
                ap[i].getPersona().setGanancia(ap[i].getPersona().getGanancia() + 5);
            }
            if (ap[i].getCompetidores().getCompetidores()[6].getPosicionApuesta() == ap[i].getCompetidores().getCompetidores()[6].getPosicionLlegada()) {
                ap[i].getPersona().setGanancia(ap[i].getPersona().getGanancia() + 4);
            }
            if (ap[i].getCompetidores().getCompetidores()[7].getPosicionApuesta() == ap[i].getCompetidores().getCompetidores()[7].getPosicionLlegada()) {
                ap[i].getPersona().setGanancia(ap[i].getPersona().getGanancia() + 3);
            }
            if (ap[i].getCompetidores().getCompetidores()[8].getPosicionApuesta() == ap[i].getCompetidores().getCompetidores()[8].getPosicionLlegada()) {
                ap[i].getPersona().setGanancia(ap[i].getPersona().getGanancia() + 2);
            }
            if (ap[i].getCompetidores().getCompetidores()[9].getPosicionApuesta() == ap[i].getCompetidores().getCompetidores()[9].getPosicionLlegada()) {
                ap[i].getPersona().setGanancia(ap[i].getPersona().getGanancia() + 1);
            }

        }

    }

    public void imprimirLlegadaCaballos() {

        for (int i = 0; i < 10; i++) {
            System.out.println(competidores.getCompetidores()[i].getPosicionLlegada());
        }

    }

    public void imprimirListadoApuestas(Apuesta[] ap, int contador) {

        for (int i = 0; i < contador; i++) {
            System.out.println("Nombre: " + ap[i].getPersona().getNombre() + " aposte: Q " + ap[i].getPersona().getMontoApuesta());
            //System.out.println("Mi nombre es: " + apuestas[i].persona.getNombre() + " aposte: Q" + apuestas[i].persona.getMontoApuesta());
            for (int j = 0; j < ap[i].getCompetidores().getCompetidores().length; j++) {
                System.out.print("Mi caballo: " + ap[i].getCompetidores().getCompetidores()[j].getNombre());
                System.out.println(" quedara en: " + ap[i].getCompetidores().getCompetidores()[j].getPosicionApuesta());
                //System.out.println(" lugar de competencia: " + ap[i].getCompetidores().getCompetidores()[j].getPosicionLlegada());
            }
            System.out.println("\n\n");
        }

        System.out.println(contador);
    }

    public void imprimirResultados(Apuesta[] ap, int contador) {
        System.out.println("\n Aqui estoy llegando a la impresion de resultados");
        for (int i = 0; i < contador; i++) {
            System.out.println("Nombre: " + ap[i].getPersona().getNombre() + " aposte: Q " + ap[i].getPersona().getMontoApuesta());
            System.out.println("Gane un total de: Q" + ap[i].getPersona().getGanancia());
            System.out.println("");

            System.out.println("\n\n");
        }

    }
    
    //metodo quicksort
    public void ordenarPorNombre(Apuesta[] ap, int contador){
        

        for (int i = 0; i < contador-1; i++) {
            for (int j = i+1; j <contador ; j++) {
                
                    if(ap[i].getPersona().getNombre().compareTo(ap[j].getPersona().getNombre())>0){
               
                    
                    Apuesta temp = ap[j];
                    ap[j] = ap[i];
                    ap[i] = temp;
                                      
                }
            }
        }
        imprimirResultados(apuestaValida, contadorApuestaValida);
    }
    
    
       public void ordenarPorGanancia(Apuesta[] ap, int contador){
        

        for (int i = 0; i < contador-1; i++) {
            for (int j = i+1; j <contador ; j++) {
                
                    if(ap[i].getPersona().getGanancia()< ap[j].getPersona().getGanancia()){
                
                    
                    Apuesta temp = ap[j];
                    ap[j] = ap[i];
                    ap[i] = temp;
                                      
                }
            }
        }
        imprimirResultados(apuestaValida, contadorApuestaValida);
    }

    
    
    
    
    public void setApuestaValida(Apuesta[] apuestaValida) {
        this.apuestaValida = apuestaValida;
    }

    public void setApuestaNoValida(Apuesta[] apuestaNoValida) {
        this.apuestaNoValida = apuestaNoValida;
    }

    public int getContadorIngreso() {
        return contadorIngreso;
    }

    public Apuesta[] getApuestaValida() {
        return apuestaValida;
    }

    public Apuesta[] getApuestaNoValida() {
        return apuestaNoValida;
    }

    public int getContadorApuestaValida() {
        return contadorApuestaValida;
    }

    public int getContadorApuestaNoValida() {
        return contadorApuestaNoValida;
    }

    public boolean isEstaRepetido() {
        return estaRepetido;
    }

    public Apuesta[] getApuestas() {
        return apuestas;
    }

    public void setApuestas(Apuesta[] apuestas) {
        this.apuestas = apuestas;
    }

}
