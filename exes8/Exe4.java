package exes8;
import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int razao = entrada.nextInt();
        entrada.close();

        int[] vetor = progressao_aritmetica(razao, 10);
        System.out.print("Progressão aritmética: ");
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static int[] progressao_aritmetica(int razao, int inicio) {
        int[] pa = new int[20]; // tamanho 20

        for (int i = 0; i < pa.length; i++) {
            pa[i] = (i + 1) * razao;
        }

        return pa;
    }
}
