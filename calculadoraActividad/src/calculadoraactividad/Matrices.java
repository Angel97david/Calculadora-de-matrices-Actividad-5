/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraactividad;

/**
 *
 * @author DELL
 */
public class Matrices {
   
     void suma(int matrizA[][],int matrizB[][],int n,int matrizC[][]){
         System.out.println("La suma de las matrices es ");
         for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];      
            }
            for (int j = 0; j <matrizC.length; j++) {
             System.out.print("[ "+matrizC[i][j] + " ] " );
           }
        }
         System.out.println("");
    }
    void resta(int matrizA[][],int matrizB[][],int n,int matrizC[][]){
        System.out.println("La resta de las matrices es ");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                matrizC[i][j] = matrizA[i][j] - matrizB[i][j];      
            }
            for (int j = 0; j <matrizC.length; j++) {
             System.out.print("[ "+matrizC[i][j] + " ] " );
           }
        }
        System.out.println("");
    }
    
    static void cofactor(int matrizA[][],int temp[][],int p,int q, int n){
        int i=0,j=0;
        for (int fila = 0;fila<n;fila++) {
            for (int columna = 0; columna < n; columna++) {
                if (fila != p && columna != q) {
                    temp[i][j++] = matrizA[fila][columna];
                    if (j == n - 1) {
                        j=0;
                        i++;
                    }
                }
                
            }
        }
    }
    static  int determinanteMatriz(int matrizA[][],int n){
        int determinante = 0 ;
        if (n == 1) {
            return matrizA[0][0];
        }
        int temp[][] = new int [n][n];
        int multiplicador1 = 1;
        for (int f = 0; f < n; f++) {
            cofactor(matrizA,temp,0,f,n);
            determinante += multiplicador1 * matrizA[0][f] * determinanteMatriz(temp,n-1);
            multiplicador1 = multiplicador1;
        }
        return determinante;
    }
  
      static void cofactor2(int matrizB[][],int temp[][],int p,int q, int z){
        int k=0,l=0;
        for (int fila = 0;fila<z;fila++) {
            for (int columna = 0; columna < z; columna++) {
                if (fila != p && columna != q) {
                    temp[k][l++] = matrizB[fila][columna];
                    if (l == z - 1) {
                        l=0;
                        k++;
                    }
                }
                
            }
        }
    }
    static  int determinanteMatriz2(int matrizB[][],int z){
        int determinante2 = 0 ;
        if (z == 1) {
            return matrizB[0][0];
        }
        int temp[][] = new int [z][z];
        int multiplicador2 = 1;
        for (int f = 0; f < z; f++) {
            cofactor(matrizB,temp,0,f,z);
            determinante2 += multiplicador2 * matrizB[0][f] * determinanteMatriz2(temp,z-1);
            multiplicador2 = multiplicador2;
        }
        return determinante2;
    }
}
