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
public abstract class Caracteristicas {

    private String composicion;
    private String nombre;
    private String tiposangre;

    public Caracteristicas() {
    }

    public Caracteristicas(String composicion, String nombre, String tiposangre) {
        this.composicion = composicion;
        this.nombre = nombre;
        this.tiposangre = tiposangre;
    }

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTiposangre() {
        return tiposangre;
    }

    public void setTiposangre(String tiposangre) {
        this.tiposangre = tiposangre;
    }

}
