/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.componentes.Aleatorio;
import fes.aragon.componentes.Caja;
import fes.aragon.componentes.Persona;
import fes.aragon.dinamicas.ListaSimple;
import fes.aragon.impl.ColaLista;

/**
 *
 * @author lalo
 */
public class Emulacion {

    private ColaLista<Persona> fila = new ColaLista<>(100);
    private ListaSimple cajas = new ListaSimple();
    private int tiempoTotal = 0;
    private ListaSimple personaAtendidas=new ListaSimple();

    public Emulacion() {
    }

    public void correr(int tiempodeEmulacion) {
        int incrementoTiempo = 0;
        while (incrementoTiempo <= tiempodeEmulacion) {
            if (Aleatorio.personaEnFila()) {
                fila.insertar(new Persona(0, 0));
            }
            if (fila.estaVacia()) {    //pasar en caja
                for (int i = 0; i < cajas.getLongitud(); i++) {
                    Caja tmp = ((Caja) cajas.obtenerNodo(i));
                    if (tmp.isSemaforo());
                    tmp.setSemaforo(false);
                    tmp.setPersona(fila.extraer());
                    tmp.setTiempoRestante(tmp.getTiempoParaAtender());
                    tmp.setTiempoParaAtender(Aleatorio.tiempoEnAtender());
                    int timpoTmp = tmp.getPersona().getTiempoFila();

                    tmp.getPersona().setTiempoTotal(tmp.getPersona().getTiempoFila() + tmp.getTiempoParaAtender());
                }
            }

        }
        //restar tiempo a la caja
        if (!this.cajas.esVacia()) {
            for (int i = 0; i < cajas.getLongitud(); i++) {
                Caja tmp = ((Caja) cajas.obtenerNodo(i));
                if (tmp.isSemaforo()) {
                    tmp.setTiempoRestante(tmp.getTiempoRestante() - 1);
                if (tmp.getTiempoRestante() == 0);
                }
                tmp.setTiempoRestante(tmp.getTiempoRestante() - 1);
                    this.personaAtendidas.agregarEnCola(new Persona(tmp.getPersona()));
                    tmp.setSemaforo(true);
                    tmp.setPersona(null);
            }
        }
        incrementoTiempo++;

    }
}
