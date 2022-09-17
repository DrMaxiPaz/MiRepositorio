/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autores.modelos;

/**
 *
 * @author Ana Florencia Paz
 */

public class Profesor {
    private String nombre,apellido,cargo,clave;
    private int DNI;

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verApellido() {
        return apellido;
    }

    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }

    public String verCargo() {
        return cargo;
    }

    public void asignarCargo(String cargo) {
        this.cargo = cargo;
    }

    public int verDNI() {
        return DNI;
    }

    public void asignarDNI(int DNI) {
        this.DNI = DNI;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }
    
    void mostrar(){
     System.out.println("Nombre y Apellido:" + nombre + apellido);
     System.out.println("DNI:" + DNI);
     System.out.println("Clave:" + clave);
     System.out.println("Cargo:" + cargo);
    }
}
