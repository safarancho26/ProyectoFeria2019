/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package particion_paginacion;
/**
 *
 * 
 */

public class Proceso {

    /**
     * @param args the command line arguments
     */
    
        
    public  String nombre ="";
    public  int tamanio=0;
    public String color=""; 

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Particion_Paginacion{" + "nombre=" + nombre + ", tamanio=" + tamanio + '}';
    }
        
    }
    

