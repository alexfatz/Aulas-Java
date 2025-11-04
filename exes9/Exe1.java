package exes9;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[20];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número:");
            vetor[i] = entrada.nextInt();
        }
        entrada.close();

        int[] novo_vetor = organizando_vetor(vetor);
        System.out.print("Vetor organizado: ");
        for (int i = 0; i < novo_vetor.length; i++) {
            System.out.print(novo_vetor[i] + " ");
        }
    }

    public static int[] organizando_vetor(int[] vetor) {
        int[] novo_vetor = new int[vetor.length];

        int indice_par = 0;
        int indice_impar = vetor.length - 1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                novo_vetor[indice_par] = vetor[i];
                indice_par++;
            } else {
                novo_vetor[indice_impar] = vetor[i];
                indice_impar--;
            }
        }

        return novo_vetor;
    }
}
