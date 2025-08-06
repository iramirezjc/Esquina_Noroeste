/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import modelo.ModeloTransporte;
import soluciones.EsquinaNoroeste;
import soluciones.Permutacion;

/**
 *
 * @author Ignacio
 */
public class Main {
    
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para comenzar presione \"s\" o \"f\" para salir");
        String input = scanner.nextLine().trim();  // Lee la línea completa y quita espacios
        char control = input.isEmpty() ? ' ' : input.charAt(0);  // Toma el primer carácter

        while (control != 'f') {
            switch (control) {
                case 's':
                    ModeloTransporte mt = new ModeloTransporte();
                    EsquinaNoroeste en = new EsquinaNoroeste();
                    Permutacion p = new Permutacion(en);
                    System.out.print("Ingrese la cantidad de ofertas: ");
                    mt.setTamanio();
                    mt.inicializarOfertas();
                    mt.asignarOfertas();
                    System.out.print("Ingrese la cantidad de demandas: ");
                    mt.setTamanio();
                    mt.inicializarDemandas();
                    mt.asignarDemandas();
                    System.out.println("Ingrese los costos asociados a ofertas");
                    mt.inicializarCostos();
                    mt.asignarCostos();
                    p.permutaciones(mt.obtenerCostos(), mt.obtenerOfertas(), mt.obtenerDemandas());
                    System.out.println("Mejor Asociado: " + en.obtenerMenorCosto());
                    System.out.print(en.verVariableSolucion());
                    System.out.println("Matriz Solucion");
                    en.mostrarMatrizSolucion();
                    break;
                case 'f':
                    System.out.println("Programa terminado...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("Quiere resolver un nuevo Modelo? (s:si / f:fin)");
            input = scanner.nextLine().trim();  // Lee la línea completa y quita espacios
            control = input.isEmpty() ? ' ' : input.charAt(0);  // Toma el primer carácter
        }
        System.out.println("Programa terminado...");
        scanner.close();
    }
}