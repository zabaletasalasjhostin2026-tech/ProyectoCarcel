/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carcelConsola;

import java.util.Scanner;

/**
 *
 * @author yo
 */

//este es el modo consola, aca funciona todo por consola, pero los datos y atributos son jalados tambien para el jFrame xd
public abstract class Persona {
    //Scanner
    Scanner leer=new Scanner(System.in);
    //atributos
    private String nombre;
    private String edad;
    private String ci;
    //constructor
    public Persona() {
    }
    //metodos
    abstract public void llenarDatos();
    abstract public void mostrarDatos();
    //getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    } 
}
