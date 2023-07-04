/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ejemplos;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author lalo
 */
public class ListaEnlazada {

    public static void main(String[] args) {
        List<String> datos = new LinkedList<>();
        datos.add("uno");
        datos.add("dos");
        datos.add("tres");
        ListIterator<String> iter=datos.listIterator();
        while(iter.hasNext()){
            String valor=iter.next();
            System.out.println(valor);
            iter.remove();
        }
        System.out.println("-------");
        for(String valor: datos){
            System.out.println(valor);
        }
        List<String> a=new LinkedList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        List<String> b=new LinkedList<>();
        b.add("uno");
        b.add("dos");
        b.add("tres");
        b.add("cuatro");
        ListIterator<String> iterA=a.listIterator();
        ListIterator<String> iterB=b.listIterator();
        
        while(iterB.hasNext()){
            if(iterA.hasNext()){
                iterA.next();
            }
            iterA.add(iterB.next());
        }
        System.out.println("--------");        
        System.out.println(a);
        System.out.println(iterB.hasNext());
        iterB=b.listIterator();
        iterB.next();
        iterB.next();
        iterB.remove();
        System.out.println(b);
        System.out.println(a);
        //n=n-1
        List c=a.subList(0, 3);
        System.out.println(c);
    }

}
