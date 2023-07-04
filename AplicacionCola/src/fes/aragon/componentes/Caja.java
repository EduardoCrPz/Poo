/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.componentes;

/**
 *
 * @author lalo
 */
public class Caja {
    private boolean semaforo=true;
    private int tiempoParaAtender;
    private int tiempoRestante;
    private Persona persona;

    public Caja(int tiempoParaAtender, int tiempoRestante, Persona persona) {
        this.tiempoParaAtender = tiempoParaAtender;
        this.tiempoRestante = tiempoRestante;
        this.persona = persona;
    }

    public boolean isSemaforo() {
        return semaforo;
    }

    public void setSemaforo(boolean semaforo) {
        this.semaforo = semaforo;
    }

    public int getTiempoParaAtender() {
        return tiempoParaAtender;
    }

    public void setTiempoParaAtender(int tiempoParaAtender) {
        this.tiempoParaAtender = tiempoParaAtender;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Caja{" + "semaforo=" + semaforo + ", tiempoParaAtender=" + tiempoParaAtender + ", tiempoRestante=" + tiempoRestante + ", persona=" + persona + '}';
    }

    
    
}