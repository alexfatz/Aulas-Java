package aula4;
import java.util.Scanner;


public class Exe1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = entrada.nextLine();
        entrada.close();
        palavra_vertical(palavra);
    }


    public static void palavra_vertical(String palavra){
        for (int i = 1; i <= palavra.length(); i++){
            System.out.println(palavra.charAt(i - 1));
        }
    }
}
