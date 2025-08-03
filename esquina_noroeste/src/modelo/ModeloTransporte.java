/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class ModeloTransporte {
    Scanner sc;
    private int[] ofertas;
    private int[] demandas;
    private int[][] costos;
    private int tamanio;
    
    public ModeloTransporte() {
        sc = new Scanner(System.in);
    }
    public void setTamanio() { 
        tamanio = sc.nextInt(); 
    }
    public int getTamanio() { 
        return tamanio; 
    }
    public void inicializarOfertas() { 
        ofertas = new int[getTamanio()]; 
    }
    public void asignarOfertas() {
        for (int i = 0; i < getTamanio(); i++)
            ofertas[i] = sc.nextInt();
    }
    public void inicializarDemandas() { 
        demandas = new int[getTamanio()]; 
    }
    public void asignarDemandas() {
        for (int i = 0; i < getTamanio(); i++)
            demandas[i] = sc.nextInt();
    }
    public void inicializarCostos() { 
        costos = new int[getTamanioOfertas()][getTamanioDemandas()]; 
    }
    public void asignarCostos() {
        for (int i = 0; i < getTamanioOfertas(); i++)
            for(int j = 0; j < getTamanioDemandas(); j++)
                costos[i][j] = sc.nextInt();
    }
    public int[] obtenerOfertas() { return ofertas; }
    public int[] obtenerDemandas() { return demandas; }
    public int[][] obtenerCostos() { return costos; }
    public int getTamanioOfertas() { return ofertas.length; }
    public int getTamanioDemandas() { return demandas.length; }
    /*public void mostrarOfertas() {
        for (int valor: ofertas)
            System.out.print(valor);
    }
    public void mostrarDemandas() {
        for (int valor: demandas)
            System.out.print(valor);
    }
    public void mostrarCostos() {
        for (int valores[]: costos) {
            for (int valor: valores) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
    
    */
}
