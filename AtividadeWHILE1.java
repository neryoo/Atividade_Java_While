/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewhile1;

/**
 *
 * @author sabri
 */
import java.util.Scanner;
public class AtividadeWHILE1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
       
        double soma = 0;
        int contador = 0;
        
        
        System.out.print("Quantos alunos tem na sala?");
        int alunos = scanner.nextInt();
        
        while(contador < alunos) {
            System.out.print("Informe a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
            contador++;
        }
        double media = soma / alunos;
        
        System.out.print("A média da sala é: " + media);
        
        scanner.close();
    }
}
