package aula5;

public class Exe2 {
    public static void main(String[] args) {
        int[] vetor1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] vetor2 = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        int[] vetor_somado = soma_vetores(vetor1, vetor2);
        System.out.print("Vetor com indices somados: ");

        for (int i = 0; i < vetor_somado.length; i++) {
            System.out.print(vetor_somado[i] + " ");
        }
    }

    public static int[] soma_vetores(int[] vetor1, int[] vetor2) {
        int[] novo_vetor = new int[10];
        for (int i = 0; i < vetor1.length; i++) {
            novo_vetor[i] = vetor1[i] + vetor2[i];
        }
        return novo_vetor;
    }
}
