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
public class ArboldeConjunto {
    public static void main(String[] args) {
        SortedSet<String> clasificador=new TreeSet<>();//acomoda alfabeticamente
        clasificador.add("pedro");
        clasificador.add("alma");
        clasificador.add("benito");
        for(String string:clasificador){
            System.out.println(string);
        }
    }
}
