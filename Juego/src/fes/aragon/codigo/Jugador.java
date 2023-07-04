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
public class Jugador {
  private String nombre; 
  private int credito;

    public Jugador(String nombre, int credito) {
        this.nombre = nombre;
        this.credito = credito;
    }

    public Jugador(){
        String nombre = this.nombre;
        credito = this.credito;
        
           
    }

    public String getNombre() {
        return nombre;
    }

    public int getCredito() {
        return credito;
    }
 
        
   
}
