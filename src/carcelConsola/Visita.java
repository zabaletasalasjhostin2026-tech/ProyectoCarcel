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
public class Visita extends Persona {

    //atributos 
    private String parentesco;
    private String fecha;
    private String fechaSa;
    private String recluso;
    private String verificacion;
    private String estado;
    //saccnner
    Scanner leer = new Scanner(System.in);

    @Override
    public void llenarDatos() {
        System.out.println("Digite su nombre");
        super.setNombre(leer.nextLine());
        System.out.println("Digite su Edad");
        super.setEdad(leer.nextLine());
        System.out.println("Digite su Nro. CI");
        super.setCi(leer.nextLine());
        System.out.println("Digite parentesco con el recluso");
        this.parentesco = leer.nextLine();
        System.out.println("Digite fecha de visita dd/mm/aaaa");
        this.fecha = leer.nextLine();

        System.out.println("Digite Nombre del recluso que visita");
        this.recluso = leer.nextLine();
        this.verificacion = "PENDIENTE";
        this.fechaSa = "EN ESPERA";
        this.estado = "REGISTRADO";
        System.out.println("VISITA REGISTRADA");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Nro. CI: " + super.getCi());
        System.out.println("Parentesco: " + this.parentesco);
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Fecha Salida: " + this.fechaSa);
        System.out.println("Estado: "+this.estado);
        System.out.println("Recluso: " + this.recluso);
        System.out.println("Verificacion: " + this.verificacion);
        
    }

    //getter and setter
    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getRecluso() {
        return recluso;
    }

    public void setRecluso(String recluso) {
        this.recluso = recluso;
    }

    public String getVerificacion() {
        return verificacion;
    }

    public void setVerificacion(String verificacion) {
        this.verificacion = verificacion;
    }

    public String getFechaSa() {
        return fechaSa;
    }

    public void setFechaSa(String fechaSa) {
        this.fechaSa = fechaSa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

}
