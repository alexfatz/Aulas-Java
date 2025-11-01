package exes7;
import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = entrada.nextLine();
        entrada.close();
        
        contador_palavras(frase);
    }

    public static void contador_palavras(String frase) {
        int contador = 1;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador ++;
            }
        }

        System.out.println("Quantidade de palavras: " + contador);
    }
}
