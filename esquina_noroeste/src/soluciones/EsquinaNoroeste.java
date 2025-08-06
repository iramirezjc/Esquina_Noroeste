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
    private int menorCosto = Integer.MAX_VALUE;
    private int[][] solucionInicial;
    private int[] nuevasOfertas;
    private int[] nuevasDemandas;
    private String solucion;
  
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
            
            variables += "X" + (i + 1) + (j + 1) + " = " + asignar + "\n";
            if (copiaOfertas[i] == 0) i++;
            else if (copiaDemandas[j] == 0) j++;
        }
        if (costo < obtenerMenorCosto()) {
            asignarMenorCosto(costo);
            variableSolucion(variables);
            asignarMatrizSolucion(cantidades, ofertas.length, demandas.length);
            asignarNuevasOfertas(ofertas);
            asignarNuevasDemandas(demandas);
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
    public void asignarMatrizSolucion(int[][] matriz, int filas, int columnas) {
        solucionInicial = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            System.arraycopy(matriz[i], 0, solucionInicial[i], 0, matriz[i].length);
        }
    }
    public void asignarNuevasOfertas(int[] lista) {
        nuevasOfertas = new int[lista.length];
        System.arraycopy(lista, 0, nuevasOfertas, 0, lista.length);
    }
    public void asignarNuevasDemandas(int[] lista) {
        nuevasDemandas = new int[lista.length];
        System.arraycopy(lista, 0, nuevasDemandas, 0, lista.length);
    }
    public void mostrarMatrizSolucion() {
        for (int i = 0; i < nuevasOfertas.length; i++) {
            for (int j = 0; j < nuevasDemandas.length; j++) {
                if (solucionInicial[i][j] < 10)
                    System.out.print(" " + solucionInicial[i][j] + " ");
                else
                    System.out.print(solucionInicial[i][j] + " ");
            }
            System.out.println(" " + nuevasOfertas[i]);
        }
        for (int demandas: nuevasDemandas) {
            if (demandas < 10)
                System.out.print(" " + demandas + " ");
            else
                System.out.print(demandas + " ");
        }
        System.out.println();
    }
}
