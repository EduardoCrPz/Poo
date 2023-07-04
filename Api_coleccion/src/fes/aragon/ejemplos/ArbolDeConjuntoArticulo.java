/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplos;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author lalo
 */
public class ArbolDeConjuntoArticulo {

    public static void main(String[] args) {
        SortedSet<Articulo> datos = new TreeSet<>();
        datos.add(new Articulo("tostadora", 9234));
        datos.add(new Articulo("licuadora", 4354));
        datos.add(new Articulo("Modem", 3343));
        System.out.println(datos);

        SortedSet<Articulo> datosDos = new TreeSet<>(new Comparator<Articulo>() {
            @Override
            public int compare(Articulo o1, Articulo o2) {
                String descA = o1.getDescripcion();
                String descB = o2.getDescripcion();
               
                return o1.getDescripcion().length()-o2.getDescripcion().length();
            }
        });
        System.out.println(datosDos);
        datosDos.addAll(datos);
        System.out.println(datosDos);
    }
}
