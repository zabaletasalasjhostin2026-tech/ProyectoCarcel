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
public class Administrativo extends Persona{
    //atributos
    private String tipo;
    private String turno;
    private double sueldo;
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
        System.out.println("Digite su tipo");
        this.tipo=leer.nextLine();
        System.out.println("Digite su turno dia/tarde/noche");
        this.turno=leer.nextLine();
        System.out.println("Digite su sueldo");
        this.sueldo=leer.nextDouble();
        System.out.println("ADMI. REGSTRADO");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: "+super.getNombre());
        System.out.println("Edad: "+super.getEdad());
        System.out.println("Nro. CI: "+super.getCi());
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Turno: "+this.turno);
        System.out.println("Sueldo: "+this.sueldo);
    }
    //getter and setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }  
}
