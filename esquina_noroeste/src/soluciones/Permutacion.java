/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soluciones;

import java.util.Arrays;

/**
 *
 * @author Ignacio
 */
public class Permutacion {
    EsquinaNoroeste en;
    
    public Permutacion(EsquinaNoroeste en) {
        this.en = en;
    }
    public void permutaciones(int[][] matriz, int[] filas, int[] columnas) {
        int fila = filas.length;
        
        permutar_filas(matriz, fila, filas, columnas);
    }
    /**
    public void permutacion_heap(int[] lista, int n) {
        int temp = 0;
        if (n == 1) {
            System.out.println(Arrays.toString(lista));
        } else {
            for (int i = 0; i < n; i++) {
                permutacion_heap(lista, n-1);
                
                if (n % 2 == 0) {
                    temp = lista[i];
                    lista[i] = lista[n - 1];
                    lista[n-1] = temp;
                } else {
                    temp = lista[0];
                    lista[0] = lista[n -1];
                    lista[n-1] = temp;
                }
            }
        }
    }*/
    public void permutar_filas(int[][] matriz, int n, int[] filas, int[] columnas) {
        int columna = columnas.length;
        int[] temp = matriz[0];
        
        if (n == 1) {
            permutar_columnas(matriz, columna, filas, columnas);
        } else {
            for (int i = 0; i < n; i++) {
                permutar_filas(matriz, n-1, filas, columnas);
                
                if (n % 2 == 0) {
                    temp = matriz[i];
                    matriz[i] = matriz[n-1];
                    matriz[n-1] = temp;
                    
                    intercabiar_valores_lista(filas, i, n-1);
                } else {
                    temp = matriz[0];
                    matriz[0] = matriz[n-1];
                    matriz[n-1] = temp;
                    
                    intercabiar_valores_lista(filas, 0, n-1);
                }
            }
        }
    }
    public void permutar_columnas(int[][] matriz, int n, int[] filas, int[] columnas) {
        int temp = matriz[0][0];
        
        if (n == 1) {
            en.ruta(matriz, filas, columnas);
        } else {
            for (int j = 0; j < n; j++) {
                permutar_columnas(matriz, n-1, filas, columnas);
                
                if (n % 2 == 0) {
                    for (int i = 0; i < matriz.length; i++) {
                        temp = matriz[i][j];
                        matriz[i][j] = matriz[i][n-1];
                        matriz[i][n-1] = temp;
                    }
                    intercabiar_valores_lista(columnas, j, n-1);
                } else {
                    for (int i = 0; i < matriz.length; i++) {
                        temp = matriz[i][0];
                        matriz[i][0] = matriz[i][n-1];
                        matriz[i][n-1] = temp;
                    }
                    intercabiar_valores_lista(columnas, 0, n-1);
                }
            }
        }
    }
    private void intercabiar_valores_lista(int[] lista, int i, int j) {
        int temp = lista[i];
        lista[i] = lista[j];
        lista[j] = temp;
    }
}
