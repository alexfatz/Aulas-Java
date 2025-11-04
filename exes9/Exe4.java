package exes9;

import java.util.Scanner;
import static exes8.Exe4.progressao_aritmetica;


public class Exe4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num1 = entrada.nextInt();
        System.out.println("Digite outro número:");
        int num2 = entrada.nextInt();
        entrada.close();

        int razao = num2 - num1;
        System.out.println("Razão: " + razao);
        
        int[] vetor = progressao_aritmetica(razao, num2);
        System.out.print("Progressão aritmética: ");
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
