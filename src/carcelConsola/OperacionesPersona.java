/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carcelConsola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author yo
 */
public class OperacionesPersona {

    //listas pa cada uno pe
    List<Recluso> listaRecluso;
    List<Administrativo> listaAdmin;
    List<Visita> listaVisita;
    //objeto de lectura
    Scanner leer = new Scanner(System.in);
    //constructor

    public OperacionesPersona() {

        listaRecluso = new ArrayList<>();
        listaAdmin = new ArrayList<>();
        listaVisita = new ArrayList<>();

    }

    //======================================
    //getter and setter de las listas
    public List<Recluso> getListaRecluso() {
        return listaRecluso;
    }

    public void setListaRecluso(List<Recluso> listaRecluso) {
        this.listaRecluso = listaRecluso;
    }

    public List<Administrativo> getListaAdmin() {
        return listaAdmin;
    }

    public void setListaAdmin(List<Administrativo> listaAdmin) {
        this.listaAdmin = listaAdmin;
    }

    public List<Visita> getListaVisita() {
        return listaVisita;
    }

    public void setListaVisita(List<Visita> listaVisita) {
        this.listaVisita = listaVisita;
    }
    //======================================

    //==============================================================
    //metodos para el jFrame.- lo mismo pero sin scanner ni nada, aca no se pide llenar ni nada porque en el jFrame ya estamos capturando datos
    public void registrarRecluso(Recluso r) {
        listaRecluso.add(r);
    }

    public void registrarAdministrativo(Administrativo a) {
        listaAdmin.add(a);
    }

    public void registrarVisita(Visita v) {
        listaVisita.add(v);
    }
    //==============================================================

    //metodos para consola, estos son los tipicos metodos para que funcione en modo consola
    public void registrarPersona(Persona p) {
        if (p instanceof Recluso) {
            Recluso r = new Recluso();
            r.llenarDatos();
            listaRecluso.add(r);
        } else {
            if (p instanceof Administrativo) {
                Administrativo a = new Administrativo();
                a.llenarDatos();
                listaAdmin.add(a);
            } else {
                Visita v = new Visita();
                v.llenarDatos();
                listaVisita.add(v);
            }
        }
    }

    public void mostrarPersonas(Persona p) {
        if (p instanceof Recluso) {
            if (!listaRecluso.isEmpty()) {
                for (Recluso r : listaRecluso) {
                    r.mostrarDatos();
                    System.out.println("----------*-----------");
                }
            } else {
                System.out.println("NO SE TIENE RECLUSOS REGISTRADOS");
            }
        } else {
            if (p instanceof Administrativo) {
                if (!listaAdmin.isEmpty()) {
                    for (Administrativo a : listaAdmin) {
                        a.mostrarDatos();
                        System.out.println("----------*-----------");

                    }
                } else {
                    System.out.println("NO SE TIENE ADMINISTRATIVOS REGISTRADOS");
                }
            } else {
                if (!listaVisita.isEmpty()) {
                    for (Visita v : listaVisita) {
                        v.mostrarDatos();
                        System.out.println("----------*-----------");
                    }
                } else {
                    System.out.println("NO SE TIENE VISITAS REGISTRADOS");
                }
            }
        }
    }

    public void buscarReclusoPorCelda() {
        String cel;
        int sw = 0;
        if (!listaRecluso.isEmpty()) {
            System.out.println("Digite Nro. de Celda del Recluso");
            cel = leer.nextLine();
            for (Recluso r : listaRecluso) {
                if (r.getNroCelda().equalsIgnoreCase(cel)) {
                    sw = 1;
                    r.mostrarDatos();
                    System.out.println("------------*-----------");
                }
            }
            if (sw == 0) {
                System.out.println("Error al buscar el Nro. de Celda");
            }
        } else {
            System.out.println("NO SE TIENE RECLUSOS REGISTRADOS");
        }
    }

    public void buscarReclusoPorDelito() {
        String del;
        int sw = 0;
        if (!listaRecluso.isEmpty()) {
            System.out.println("Digite El Delito del Recluso");
            del = leer.nextLine();
            for (Recluso r : listaRecluso) {
                if (r.getDelito().equalsIgnoreCase(del)) {
                    sw = 1;
                    r.mostrarDatos();
                    System.out.println("------------*-----------");
                }
            }
            if (sw == 0) {
                System.out.println("Delito inexistente");
            }
        } else {
            System.out.println("NO SE TIENE RECLUSOS REGISTRADOS");
        }
    }

    public void pagoSueldo() {
        String ci;
        int sw = 0;
        double bono = 0, total = 0;
        //si el administrativo trabaja en turno recibe un bono del 20%
        if (!listaAdmin.isEmpty()) {
            System.out.println("Digite el CI del Adm.");
            ci = leer.nextLine();
            for (Administrativo a : listaAdmin) {
                if (a.getCi().equalsIgnoreCase(ci)) {
                    sw = 1;
                    if (a.getTurno().equalsIgnoreCase("noche")) {
                        bono = a.getSueldo() * 0.20;
                        total = a.getSueldo() + bono;

                    }
                    System.out.println("Administrativo: " + a.getNombre());
                    System.out.println("Tipo: " + a.getTipo());
                    System.out.println("Turno: " + a.getTurno());
                    System.out.println("Sueldo Base: " + a.getSueldo());

                    if (bono > 0) {
                        System.out.println("Bono Extra por turno noche: " + bono);
                    } else {
                        System.out.println("Sin Bono Extra");
                    }
                    if (total > 0) {
                        System.out.println("Sueldo Total: " + total);
                    } else {
                        System.out.println("Sueldo Total: " + a.getSueldo());
                    }
                }

            }
            if (sw == 0) {
                System.out.println("CI NO ENCONTRADO");
            }
        } else {
            System.out.println("NO SE TIENE ADMI. REGISTRADOS");
        }
    }

    public void despedir() {
        String ci;
        int sw = 0;
        if (!listaAdmin.isEmpty()) {
            System.out.println("Digite Nro. de CI del Adm. que quiere despedir");
            ci = leer.nextLine();
            for (Administrativo a : listaAdmin) {
                if (a.getCi().equalsIgnoreCase(ci)) {
                    sw = 1;
                    System.out.println("Estas Seguro de que quieres Despedir a " + a.getNombre() + " SI/NO");
                    String res = leer.nextLine();
                    if (res.equalsIgnoreCase("SI")) {
                        listaAdmin.remove(a);
                        System.out.println("Adm. Despedido");
                        break;
                    } else {
                        System.out.println("Operacion Cancelada");
                    }
                }
            }
            if (sw == 0) {
                System.out.println("Adm. No encontrado");
            }
        } else {
            System.out.println("NO SE TIENE ADM. REGISTRADOS");
        }
    }

    public void buscarVisitasPorFecha() {
        String feh;
        int sw = 0;
        if (!listaVisita.isEmpty()) {
            System.out.println("Digite la fecha dd/mm/aaaa");
            feh = leer.nextLine();
            System.out.println("LISTA DE VISITAS REGISTRADAS PARA EL " + feh + ":");
            for (Visita v : listaVisita) {
                if (v.getFecha().equalsIgnoreCase(feh)) {
                    sw = 1;
                    v.mostrarDatos();
                    System.out.println("-----------*----------");
                }
            }
            if (sw == 0) {
                System.out.println("NO SE TIENE VISISTAS REGISTRADAS PARA LA FECHA " + feh);
            }
        } else {
            System.out.println("NO HAY VISISTAS REGISTRADAS");
        }
    }

    public void verificacion() {
        String ci, ciRe;
        int sw = 0, swr = 0;
        String resp;
        if (!listaVisita.isEmpty()) {
            System.out.println("Digite El Nro. de CI del Visitante que quiere verificar");
            ci = leer.nextLine();
            for (Visita v : listaVisita) {
                if (v.getCi().equalsIgnoreCase(ci)) {
                    sw = 1;
                    System.out.println("Porfavor ingrese el Nro. de CI del recluso para la verificacion");
                    ciRe = leer.nextLine();
                    for (Recluso r : listaRecluso) {
                        if (r.getNombre().equalsIgnoreCase(v.getRecluso()) && r.getCi().equalsIgnoreCase(ciRe)) {
                            swr = 1;
                            v.setVerificacion("APROBADO");
                        }
                    }
                    if (swr == 0) {
                        System.out.println("Recluso que quiere visitar no encontrado");
                        v.setVerificacion("RECHAZADO");
                    } else {
                        System.out.println("Verificacion exitosa, puede realizar la visita");
                    }
                }
            }
            if (sw == 0) {
                System.out.println("CI DEL VISITANTE NO ENCONTRADO");
            }

        } else {
            System.out.println("NO HAY VISISTAS REGISTRADAS");
        }
    }

    public void visitarRecluso() {
        String ci;
        int sw = 0;
        if (!listaVisita.isEmpty()) {
            System.out.println("Ingrese Nro. de CI del visitante");
            ci = leer.nextLine();
            for (Visita v : listaVisita) {
                if (v.getCi().equalsIgnoreCase(ci)) {
                    sw = 1;
                    if (v.getVerificacion().equalsIgnoreCase("APROBADO")) {
                        System.out.println("===============================");
                        System.out.println("Visita realizada con EXITO!");
                        System.out.println("Nombre Visitante: " + v.getNombre());
                        System.out.println("Recluso visitado: " + v.getRecluso());
                        System.out.println("Parentesco: " + v.getParentesco());
                        System.out.println("Fecha: " + v.getFecha());
                        System.out.println("===============================");
                        v.setEstado("DENTRO");
                        break;
                    } else {
                        if (v.getVerificacion().equalsIgnoreCase("PENDIENTE")) {
                            System.out.println("PORFAVOR REALICE LA VERIFICACION!");
                        } else {
                            System.out.println("Su visita Fue rechazada anteriormente en la prueba de verificacion");
                            System.out.println("Se le eliminara de la lista, si quiere volver a intentarlo registrese nuevamente");
                            listaVisita.remove(v);
                            break;
                        }
                    }
                }
            }
        } else {
            System.out.println("NO HAY VISISTAS REGISTRADAS");
        }
    }

    public void cambiarCelda() {
        int sw = 0;
        String celda, res;
        if (!listaRecluso.isEmpty()) {
            //lectura de datos 
            System.out.println("Digite el numero de celda actual ");
            celda = leer.nextLine();

            for (Recluso a : listaRecluso) {
                if (a.getNroCelda().equals(celda)) {
                    sw = 1;
                    System.out.println("Esta seguro de cambiar de celda S/N?");
                    res = leer.nextLine();
                    if (res.equalsIgnoreCase("S")) {
                        System.out.println("Digite el nuevo numero de celda");
                        a.setNroCelda(leer.nextLine());
                        System.out.println("se realizo el cambio ");

                    } else {
                        System.out.println("Operacion cancelada");
                    }
                }
            }
            if (sw == 0) {
                System.out.println(" no se encontro los datos buscados");
            }
        } else {
            System.out.println("no se tiene celdas registrados ");
        }
    }

    public void cambiarTurno() {
        int sw = 0;
        String turno, res;
        if (!listaAdmin.isEmpty()) {
            //lectura de datos 
            System.out.println("Digite su turno dia/tarde/noche");
            turno = leer.nextLine();

            for (Administrativo a : listaAdmin) {
                if (a.getTurno().equals(turno)) {
                    sw = 1;
                    System.out.println("Esta seguro de cambiar de turno S/N?");
                    res = leer.nextLine();
                    if (res.equalsIgnoreCase("S")) {
                        System.out.println("Digite su nuevo turno dia/tarde/noche");
                        a.setTurno(leer.nextLine());
                        System.out.println("se realizo el cambio ");

                    } else {
                        System.out.println("Operacion cancelada");
                    }
                }
            }
            if (sw == 0) {
                System.out.println(" no se encontro los datos buscados");
            }
        } else {
            System.out.println("no se tiene turnos registrados ");
        }
    }

    public void registrarSalida() {
        String ci;
        int sw = 0;

        if (!listaVisita.isEmpty()) {

            System.out.println("Ingrese Nro. de CI del visitante");
            ci = leer.nextLine();

            for (Visita v : listaVisita) {

                if (v.getCi().equalsIgnoreCase(ci)) {
                    sw = 1;

                    if (v.getEstado().equalsIgnoreCase("DENTRO")) {

                        System.out.println("Registrando salida...");

                        String fechaActual = LocalDate.now()
                                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                        v.setFechaSa(fechaActual);
                        v.setEstado("SALIO");

                        System.out.println("Salida registrada correctamente");
                    } else {
                        System.out.println("El visitante no se encuentra dentro");
                    }

                    break;
                }
            }

            if (sw == 0) {
                System.out.println("Visitante no encontrado");
            }

        } else {
            System.out.println("NO HAY VISITAS REGISTRADAS");
        }
    }

}
