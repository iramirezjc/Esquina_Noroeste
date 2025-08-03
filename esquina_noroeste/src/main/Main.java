/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import modelo.ModeloTransporte;
import soluciones.EsquinaNoroeste;

/**
 *
 * @author Ignacio
 */
public class Main {
    
    public static void main(String[] args) {
        ModeloTransporte mt = new ModeloTransporte();
        EsquinaNoroeste en = new EsquinaNoroeste();
        
        System.out.println("Ingrese la cantidad de ofertas:");
        mt.setTamanio();
        mt.inicializarOfertas();
        mt.asignarOfertas();
        //mt.mostrarOfertas();
        System.out.println("Ingrese la cantidad de demandas:");
        mt.setTamanio();
        mt.inicializarDemandas();
        mt.asignarDemandas();
        //mt.mostrarDemandas();
        System.out.println("Ingrese los precios de ofertas y demandas:");
        mt.inicializarCostos();
        mt.asignarCostos();
        //mt.mostrarCostos();
        
        en.ruta(mt.obtenerCostos(), mt.obtenerOfertas(), mt.obtenerDemandas());
        System.out.println("Costo Inicial Asociado: " + en.obtenerCostoAsociado());
    }
}
