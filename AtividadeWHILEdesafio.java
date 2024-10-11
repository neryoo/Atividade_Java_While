/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewhiledesafio;

/**
 *
 * @author sabri
 */
import java.util.Scanner;
public class AtividadeWHILEdesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;
        int N;
        int numeroMaior1 = Integer.MIN_VALUE;
        int numeroMaior2 = Integer.MIN_VALUE;
        
        while(contador <10) {
            System.out.print("Informe o " + (contador + 1) + "º número: ");
            N = scanner.nextInt();
            
            if (N > numeroMaior1) {
                numeroMaior2 = numeroMaior1;
                numeroMaior1 = N;
            } else if (N > numeroMaior2) {
                numeroMaior2 = N;
            }
                contador ++;
        }
            System.out.println("Dentre os números digitados os dois maiores números são: " + numeroMaior1 + " e " + numeroMaior2);
        scanner.close();
    }
}
