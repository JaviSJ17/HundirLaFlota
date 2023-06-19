/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hundirLaFlota;

import java.io.Serializable;

/**
 *
 * @author Javie
 */
public class Barco implements Serializable{
    private String nombre;
    private String[] posiciones;
    private int cantidadPosiciones;

    public Barco(int longitud) {
        this.posiciones = new String[longitud];
        this.cantidadPosiciones = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getPosiciones() {
        return posiciones;
    }

    public void setPosicion(String posicion) {
        // formato "fila"-"columna"
        this.posiciones[cantidadPosiciones-1] = posicion;
        cantidadPosiciones = cantidadPosiciones - 1;
    }

    @Override
    public String toString() {
        return "Barco de "+posiciones.length ;
    }
    
    
}
