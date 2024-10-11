/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewhile2;

/**
 *
 * @author sabri
 */

import java.util.Scanner;

public class AtividadeWHILE2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("INforme um número inteiro: ");
        int numero = scanner.nextInt();
        
        int contador = 0;
        
        while(contador < numero) {
            contador ++;
            System.out.println("Os números de 1 até " + numero + ": " + contador);
            
            
        }
        
        scanner.close();
    }
}
