package aula5;

public class Exe1 {
    public static void main(String[] args) {
        int[] meu_vetor = { 1, 10, 3, 5, 6, 7, 8, 9, 2, 4 };
        int indice_maior_valor = maior_indice(meu_vetor);
        System.out.println("Maior valor: " + meu_vetor[indice_maior_valor]);
    }

    public static int maior_indice(int[] vetor) {
        int indice_maior_valor = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > vetor[indice_maior_valor]) {
                indice_maior_valor = i;
            }
        }

        return indice_maior_valor;
    }
}
