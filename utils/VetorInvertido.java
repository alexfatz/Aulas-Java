package utils;

public class VetorInvertido {
    public static int[] vetor_inverso(int[] vetor) {
        int[] novo_vetor = new int[vetor.length];

        for (int i = vetor.length - 1; i >= 0; i--) {
            novo_vetor[vetor.length - 1 - i] = vetor[i];
        }

        return novo_vetor;
    }
}
