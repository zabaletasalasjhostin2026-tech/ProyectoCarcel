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
public class PrincipalPersona {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        OperacionesPersona obj=new OperacionesPersona();
        int opc; boolean continuar=true;
        //objetos polimorficos
        Persona rec=new Recluso();
        Persona adm=new Administrativo();
        Persona vis=new Visita();
        do{
            System.out.println(" --MENU DE OPCIONES-- ");
            System.out.println("1. Registrar Reclusos");
            System.out.println("2. Registrar Administrativos");
            System.out.println("3. Registrar Visitas");
            System.out.println("4. Mostrar Lista de Reclusos");
            System.out.println("5. Mostrar Lista de Administrativos");
            System.out.println("6. Mostrar Lista de Visitas");
            System.out.println("7. Buscar Recluso por Nro. de Celda");
            System.out.println("8. Buscar Recluso por Delito cometido");
            System.out.println("9. Mostrar Boleta de Pago de Adm.");
            System.out.println("10. Despedir Administrativo");
            System.out.println("11. Mostrar lista de Visitantes por fecha");
            System.out.println("12. Realizar Verificacion");
            System.out.println("13. Visitar Recluso");
            System.out.println("14. SALIR");
            System.out.println("Digite una Opcion");
            opc=leer.nextInt();
            switch(opc){
                case 1:
                    obj.registrarPersona(rec);
                    break;
                case 2:
                    obj.registrarPersona(adm);
                    break;
                case 3:
                    obj.registrarPersona(vis);
                    break;
                case 4:
                    obj.mostrarPersonas(rec);
                    break;
                case 5:
                    obj.mostrarPersonas(adm);
                    break;
                case 6:
                    obj.mostrarPersonas(vis);
                    break;
                case 7:
                    obj.buscarReclusoPorCelda();
                    break;
                case 8:
                    obj.buscarReclusoPorDelito();
                    break;
                case 9:
                    obj.pagoSueldo();
                    break;
                case 10:
                    obj.despedir();
                    break;
                case 11:
                    obj.buscarVisitasPorFecha();
                    break;
                case 12:
                    obj.verificacion();
                    break;
                case 13:
                    obj.visitarRecluso();
                    break;
                default:
                    continuar=false;
                    break;
            }
        }while(continuar);
    }
}
