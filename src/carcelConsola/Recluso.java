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
public class Recluso extends Persona{
    //atributos
    private String delito;
    private String condena;
    private String nroCelda;
    //saccnner
    Scanner leer=new Scanner(System.in);
    
    
    @Override
    public void llenarDatos() {
        System.out.println("Digite su nombre");
        super.setNombre(leer.nextLine());
        System.out.println("Digite su Edad");
        super.setEdad(leer.nextLine());
        System.out.println("Digite su Nro. CI");
        super.setCi(leer.nextLine());
        System.out.println("Digite su Delito");
        this.delito=leer.nextLine();
        System.out.println("Digite tiempo de Condena");
        this.condena=leer.nextLine();
        System.out.println("Digite Nro. Celda");
        this.nroCelda=leer.nextLine();
        System.out.println("RECLUSO REGISTRADO");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: "+super.getNombre());
        System.out.println("Edad: "+super.getEdad());
        System.out.println("Nro. CI: "+super.getCi());
        System.out.println("Delito: "+this.delito);
        System.out.println("Condena: "+this.condena);
        System.out.println("Nro. Celda: "+this.nroCelda);     
    }
    //getter and setter
    public String getDelito() {
        return delito;
    }

    public void setDelito(String delito) {
        this.delito = delito;
    }

    public String getCondena() {
        return condena;
    }

    public void setCondena(String condena) {
        this.condena = condena;
    }

    public String getNroCelda() {
        return nroCelda;
    }

    public void setNroCelda(String nroCelda) {
        this.nroCelda = nroCelda;
    }
    
}
