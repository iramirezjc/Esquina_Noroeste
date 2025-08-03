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
    private int costoAsociado;
  
    public EsquinaNoroeste() {
        costoAsociado = 0;
    }
    public void ruta(int[][] cantidades, int[]ofertas, int[] demandas) {
        int i = 0;
        int j = 0;
        int costo = 0;
        
        while (i < ofertas.length && j < demandas.length) {
            int asignar = Math.min(ofertas[i], demandas[j]);
            
            ofertas[i] -= asignar;
            demandas[j] -= asignar;
            costo += (cantidades[i][j] * asignar);
            System.out.println("X" + i + j + " = " + asignar);
            
            if (ofertas[i] == 0 && i < ofertas.length) i++;
            else if (demandas[j] == 0 && j < demandas.length) j++;
        }
        asignarCostoAsociado(costo);
    }
    public void asignarCostoAsociado(int resultado) {
        costoAsociado = resultado;
    }
    public int obtenerCostoAsociado() {
        return costoAsociado;
    }
}
