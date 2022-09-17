
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupos.modelos;

/**
 *
 * @author Ana Florencia Paz
 */
public class Grupo {
    private String nombre;
    private String descripcion;


    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    void mostrar(){
     System.out.println("Nombre :" + nombre);
     System.out.println("Descripcion:" + descripcion);
    }
}
