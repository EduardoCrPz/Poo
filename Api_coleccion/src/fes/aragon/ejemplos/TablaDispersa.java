/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author lalo
 */
public class TablaDispersa {
    public static void main(String[] args) {
        ArrayList<Integer> punto = new ArrayList<>();
        Set<Integer> puntosDos=new HashSet<>();
        Random rd = new Random();
        for (int i = 0; i < 20; i++) {
            Integer valor=rd.nextInt(20);
            punto.add(valor);
            puntosDos.add(valor);
        }
        System.out.println(punto);
        System.out.println(puntosDos);
    }
}
