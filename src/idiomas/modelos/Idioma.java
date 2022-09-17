/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package idiomas.modelos;

/**
 *
 * @author Ana Florencia Paz
 */
public class Idioma {

    public Idioma(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nombre
     */
    public String verNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String toString() {

        return "Nombre: " + nombre;
    }

    private String nombre;
}
