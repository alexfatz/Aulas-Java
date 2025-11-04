package aula5;

import java.util.Scanner;


public class Exe5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = entrada.nextInt();
        entrada.close();

        int[] vetor = { 1, 10, 3, 5, 6, 7, 8, 9, 2, 4, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
                27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        
        int contador = contador_numero_no_vetor(vetor, numero);
        System.out.printf("O número %d aparece %d vezes.", numero, contador);
    }

    public static int contador_numero_no_vetor(int[] vetor, int numero) {
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                contador++;
            }
        }
        return contador;
    }
}