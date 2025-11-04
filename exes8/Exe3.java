package exes8;

import java.util.Arrays;

public class Exe3 {
    public static void main(String[] args) {
        int[] vetor = { 1, 10, 3, 5, 6, 7, 8, 9, 2, 4, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
                27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };

        int[] vetor_sorted = vetor_ordem_crescente(vetor);

        System.out.print("Vetor em ordem crescente: ");
        for (int i = 0; i < vetor_sorted.length; i++) {
            System.out.print(vetor_sorted[i] + " ");
        }
    }
    
    public static int[] vetor_ordem_crescente(int[] vetor) {
        Arrays.sort(vetor);
        return vetor;
    }
}
