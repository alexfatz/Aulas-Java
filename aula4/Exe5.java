package aula4;
import java.util.Scanner;


public class Exe5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String palavra = entrada.nextLine();
        entrada.close();
        sem_primeira_e_ultima_palavra(palavra);
    }


    public static void sem_primeira_e_ultima_palavra(String palavra){
        int primeiro_espaco = palavra.indexOf(" ");
        int ultimo_espaco = palavra.lastIndexOf(" ");

        String nova_palavra = palavra.substring(primeiro_espaco + 1, ultimo_espaco);
        System.out.println(nova_palavra);
    }
}
