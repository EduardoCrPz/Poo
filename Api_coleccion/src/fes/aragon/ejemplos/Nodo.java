/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplos;

/**
 *
 * @author lalo
 */
public class Nodo implements Comparable<Nodo> {

    private int valor;

    public Nodo(int valor) {
        this.valor = valor;
    }

    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Nodo o) {
        return o.getValor()- this.valor;
    }

    @Override
    public String toString() {
        return "Nodo{" + "valor=" + valor + '}';
    }
    
}
