/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainTest;

import modelo.ModeloTransporte;
import soluciones.EsquinaNoroeste;
import soluciones.Permutacion;

/**
 *
 * @author Ignacio
 */
public class MainTest {
    
    public static void main(String[] args) {        
        /**
         * Set 1
         */
        EsquinaNoroeste en0 = new EsquinaNoroeste();
        Permutacion p0 = new Permutacion(en0);
        int[] silos = {15, 25, 10};
        int[] molinos = {5, 15, 15, 15};
        int[][] sunRay = {
                            {10,  2, 20, 11},
                            {12,  7,  9, 20},
                            { 4, 14, 16, 18}
                        };
        System.out.println("Matriz SunRay");
        p0.permutaciones(sunRay, silos, molinos);
        System.out.println("Mejor Costo Asociado: " + en0.obtenerMenorCosto());
        System.out.print(en0.verVariableSolucion());
        System.out.println("Matriz Solucion");
        en0.mostrarMatrizSolucion();
        
        /**
         * Set 2
         */
        EsquinaNoroeste en1 = new EsquinaNoroeste();
        Permutacion p1 = new Permutacion(en1);
        int[] ofertas = {50, 60, 50, 50};
        int[] demandas = {30, 20, 70, 30, 60};
        int[][] costos = {
                            {16, 16, 13, 22, 17},
                            {14, 14, 13, 19, 15},
                            {19, 19, 20, 23, 0},
                            { 0,  0,  0,  0, 0}
                        };
        System.out.println("Metro Water District");
        p1.permutaciones(costos, ofertas, demandas);
        System.out.println("Mejor Costo Asociado: " + en1.obtenerMenorCosto());
        System.out.print(en1.verVariableSolucion());
        System.out.println("Matriz Solucion");
        en1.mostrarMatrizSolucion();
        /**
         * set 3
         */
        EsquinaNoroeste esn = new EsquinaNoroeste();
        Permutacion per = new Permutacion(esn);
        int[] ofertas2 = {510, 475, 390, 225};
        int[] demandas2 = {600, 500, 300, 200};
        int[][] costos2 = {
                            {25, 18, 21, 23},
                            {19, 23, 22, 26},
                            {22, 25, 26, 17},
                            {24, 21, 20, 22}
                        };
        System.out.println("Tercer Problema");
        per.permutaciones(costos2, ofertas2, demandas2);
        System.out.println("Mejor Costo Asociado: " + esn.obtenerMenorCosto());
        System.out.print(esn.verVariableSolucion());
        System.out.println("Matriz Solucion");
        esn.mostrarMatrizSolucion();
    }
}
