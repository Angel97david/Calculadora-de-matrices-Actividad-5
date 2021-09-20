/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraactividad;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class CalculadoraDeMatrices {
    
       void determinate (int fil){
        
         Scanner scan = new Scanner(System.in);
        int n =fil;
        //int n = scan.nextInt();
        int matrizA[][] = new int[n][n];
        
         System.out.println("Digite los valores");
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 System.out.println("matA[" + i + "][" + j + "]\t");
                 matrizA[i][j] = scan.nextInt();
               
             }
         }
         System.out.println("La determinate es :\t " + Matrices.determinanteMatriz(matrizA,n));       
         System.out.println("");
       
       //llenar segunda matriz
       int matrizB[][] = new int[n][n];
        
         System.out.println("Digite los valores");
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 System.out.println("matB[" + i + "][" + j + "]\t");
                 matrizB[i][j] = scan.nextInt();
               
            }
        }
         scan.close();
         System.out.println("La determinate es :\t " + Matrices.determinanteMatriz2(matrizB,n));
       
            System.out.println("");
            
           //sumar matrices
        int matrizC[][] = new int[n][n];
        Matrices m = new Matrices();
        m.suma(matrizA, matrizB, n,matrizC);
        m.resta(matrizA, matrizB, n, matrizC);
    } 
}
   
    

