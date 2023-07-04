/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplos;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author lalo
 */
public class Mapa {

    public static void main(String[] args) {
        Map<String, Persona> mapas = new HashMap<String, Persona>();
        Persona per = new Persona("MASH", 44);
        mapas.put("34545-34", per);
        mapas.put("4534-45", new Persona("Jorge", 34));
        System.out.println(mapas);
        for (Map.Entry<String, Persona> entry : mapas.entrySet()) {
            String key = entry.getKey();
            Persona value = entry.getValue();
            System.out.println("Clave: " + key + " valor " + value);

        }
        Map<Integer, Persona> mapaDos = new TreeMap<Integer, Persona>();
        mapaDos.put(34, new Persona("Amanda", 56));
        mapaDos.put(4, new Persona("Rosa", 34));

    }

    private static <K, V extends Comparable<V>> List<V> valoresOrdenados(Map<K, V> map) {
        List<V> retornar = new LinkedList<>(map.values());
        Collections.sort(retornar, new Comparator<V>() {
            @Override
            public int compare(V o1, V o2) {
                return o1.compareTo(o2);
            }
        });
        return retornar;
    }

}
