package exes7;
import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = entrada.nextLine();
        entrada.close();
        tras_frente(frase);
    }

    public static void tras_frente(String frase) {
        for (int i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
    }
}
