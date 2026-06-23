/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import carcelConsola.Administrativo;
import carcelConsola.OperacionesPersona;
import carcelConsola.Recluso;
import carcelConsola.Visita;
import java.util.List;

/**
 *
 * @author yo
 */

//este controlador sirve para tener las listas de cada recluso, admin, y visitante para agarrar mas facil
public class ControladorSistema {
    public static OperacionesPersona operaciones = new OperacionesPersona();

    public static List<Recluso> getListaRecluso() {
    return operaciones.getListaRecluso();
    }
    
    public static List<Administrativo> getListaAdministrativos() {
    return operaciones.getListaAdmin();
    }
    
    public static List<Visita> getListaVisitas() {
    return operaciones.getListaVisita();
    }
    
}

