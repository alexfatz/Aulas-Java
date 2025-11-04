package exes9;
import static exes6.Exe2.is_primo;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[20];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número:");
            int num = entrada.nextInt();
            if (!is_primo(num)) {
                System.out.printf("%d não é primo.\n", num);
            } else vetor[i] = num;
        }
        entrada.close();

        System.out.print("Vetor de primos: "); // PROBLEMA -> números não primos se tornaram 0
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
