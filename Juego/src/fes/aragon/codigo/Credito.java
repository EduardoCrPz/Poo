/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

/**
 *
 * @author lalo
 */
public class Credito {
    private int credito;
    private int incremento;
    private int decreciente;

    public Credito(int credito, int incremento, int decreciente) {
        this.credito = credito;
        this.incremento = incremento;
        this.decreciente = decreciente;
    }

    public Credito(){
        this.credito = 10;
   
    }   

}
