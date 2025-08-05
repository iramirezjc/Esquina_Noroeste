/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soluciones;

/**
 *
 * @author Ignacio
 */
public class EsquinaNoroeste {
    private int[][] solucionInicial;
    private String solucion;
    private int menorCosto = Integer.MAX_VALUE;
  
    public void ruta(int[][] cantidades, int[]ofertas, int[] demandas) {
        int[] copiaOfertas = ofertas.clone();
        int[] copiaDemandas = demandas.clone();
        String variables = "";
        int i = 0, j = 0, costo = 0;
        
        while (i < copiaOfertas.length && j < copiaDemandas.length) {
            int asignar = Math.min(copiaOfertas[i], copiaDemandas[j]);
            
            copiaOfertas[i] -= asignar;
            copiaDemandas[j] -= asignar;
            costo += (cantidades[i][j] * asignar);
            
            variables += "X" + i + j + " = " + asignar + "\n";
            if (copiaOfertas[i] == 0 && i < copiaOfertas.length) i++;
            else if (copiaDemandas[j] == 0 && j < copiaDemandas.length) j++;
        }
        if (costo < obtenerMenorCosto()) {
            asignarMenorCosto(costo);
            variableSolucion(variables);
            
            solucionInicial = new int[ofertas.length][demandas.length];
            solucionInicial = cantidades.clone();
        }
    }
    public void asignarMenorCosto(int costo) {
        menorCosto = costo;
    }
    public int obtenerMenorCosto() {
        return menorCosto;
    }
    public void variableSolucion(String result) {
        solucion = result;
    }
    public String verVariableSolucion() {
        return solucion;
    }
    public void mostrarMatrizSolucion() {
        for (int valores[]: solucionInicial) {
            for (int valor: valores) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
