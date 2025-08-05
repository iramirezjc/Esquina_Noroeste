/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import modelo.ModeloTransporte;
import soluciones.EsquinaNoroeste;
import soluciones.Permutacion;

/**
 *
 * @author Ignacio
 */
public class Main {
    
    public static void main(String[] args) {
        ModeloTransporte mt = new ModeloTransporte();
        EsquinaNoroeste en = new EsquinaNoroeste();
        Permutacion p = new Permutacion(en);
        System.out.println("Ingrese la cantidad de ofertas:");
        mt.setTamanio();
        mt.inicializarOfertas();
        mt.asignarOfertas();
        System.out.println("Ingrese la cantidad de demandas:");
        mt.setTamanio();
        mt.inicializarDemandas();
        mt.asignarDemandas();
        System.out.println("Ingrese los precios de ofertas y demandas:");
        mt.inicializarCostos();
        mt.asignarCostos();
        p.permutaciones(mt.obtenerCostos(), mt.obtenerOfertas(), mt.obtenerDemandas());
        System.out.println("Mejor Asociado: " + en.obtenerMenorCosto());
        System.out.print(en.verVariableSolucion());
        System.out.println("Matriz Solucion");
        en.mostrarMatrizSolucion();
    }
}
