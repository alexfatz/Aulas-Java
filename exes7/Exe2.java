package exes7;
import java.util.Scanner;


public class Exe2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase de números:");
        String frase = entrada.nextLine();
        entrada.close();
        contador_uns(frase);
    }

    public static void contador_uns(String palavra){
        int contador = 0;
        for (int i = 1; i <= palavra.length(); i++){
           char letra = palavra.charAt(i - 1);

           if (letra == '1') contador++;
        }

        System.out.println("1's: " + contador);
    }
}
