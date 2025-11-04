package aula5;

import java.util.Scanner;
import utils.Fibonacci;


public class Exe4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = entrada.nextInt();
        entrada.close();

        if (n < 0) {
            System.out.println("Número negativo.");
        } else {
            int[] vetor = Fibonacci.fibonacci_vetor(n);
            System.out.print("Fibonacci: ");
            
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
        }
    }
}