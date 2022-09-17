/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autores.modelos;

/**
 *
 * @author Ana Florencia Paz
 */
public class Alumno {

    private String cx, nombre, apellido, clave;
    private int DNI;

    public Alumno(int DNI, String apellido, String nombre, String clave,String cx) {
        this.cx = cx;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.DNI = DNI;
    }

    
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

    public String verCx() {
        return cx;
    }

    public void asignarCx(String cx) {
        this.cx = cx;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public int verDNI() {
        return DNI;
    }

    public void asignarDNI(int DNI) {
        this.DNI = DNI;
    }

    public void mostrar() {
        System.out.println("Nombre y Apellido:" + nombre + apellido);
        System.out.println("DNI:" + DNI);
        System.out.println("Clave:" + clave);
        System.out.println("CX:" + cx);
    }
}
