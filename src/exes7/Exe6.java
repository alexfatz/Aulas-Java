package exes7;
import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = entrada.nextLine();
        System.out.println("Digite um caracter:");
        String char1 = entrada.nextLine();
        System.out.println("Digite outro caracter:");
        String char2 = entrada.nextLine();
        entrada.close();
        troca_caracter(frase, char1, char2);
    }

    public static void troca_caracter(String frase, String char1, String char2) {
        System.out.println(frase.replace(char1, char2));
    }
}
