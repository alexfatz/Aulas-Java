package exes9;
import java.util.Scanner;
import aula5.Exe1; // metodo maior indice


public class Exe2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[50];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número:");
            vetor[i] = entrada.nextInt();
        }
        entrada.close();

        int maior_indice = Exe1.maior_indice(vetor);
        System.out.println("Maior valor: " + vetor[maior_indice]);
    }
}
