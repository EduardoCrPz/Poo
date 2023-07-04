/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.util.Random;

/**
 *
 * @author lalo
 */
public class Lanzar {
    private int dadoUno;
    private int dadoDos;

    public Lanzar(int dadoUno, int dadoDos) {
        this.dadoUno = dadoUno;
        this.dadoDos = dadoDos;
    }
    public Lanzar(){
        Random lanzamientoUno = new Random();
        int x = lanzamientoUno.nextInt(6) +1;
        Random lanzamientoDos = new Random();
        int y = lanzamientoDos.nextInt(6) +1;
        
    }

    public int getDadoUno() {
        return dadoUno;
    }

    public int getDadoDos() {
        return dadoDos;
    }

    @Override
    public String toString() {
        return "El resultado es: "+ this.dadoUno + "y" + this.dadoDos + "x";
    }
    
}
