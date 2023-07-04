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
public class ConPatas extends Caracteristicas {
    private String composicion;
    private String nombre;
    private String tiposangre;

    public ConPatas() {
    }

    public ConPatas(String composicion, String nombre, String tiposangre) {
        this.composicion = composicion;
        this.nombre = nombre;
        this.tiposangre = tiposangre;
    }

    @Override
    public String getComposicion() {
        return composicion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getTiposangre() {
        return tiposangre;
    }
    
    
}
