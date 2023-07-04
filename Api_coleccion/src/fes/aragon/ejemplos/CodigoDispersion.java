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
public class CodigoDispersion {
    public static void main(String[] args) {
        String dato="hola";
        String dato3="Hola";
        Persona dato2=new Persona("hola",15);
        System.out.println(dato.hashCode());
        System.out.println(dato2.hashCode());
        System.out.println(dato3.hashCode());
        Integer valor=15;
        System.out.println(valor.hashCode());
    }
}
