/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplos;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author lalo
 */
public class ArboldeConjuntoNodo {
    public static void main(String[] args) {
        SortedSet<Nodo> nodos=new TreeSet<>();
        nodos.add(new Nodo(20));
        nodos.add(new Nodo(29));
        nodos.add(new Nodo(15));
        
        System.out.println(nodos);
    }
}
