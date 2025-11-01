package aula4;
import java.util.Scanner;


public class Exe2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = entrada.nextLine();
        entrada.close();
        palavra_vertical(palavra);
    }


    public static void palavra_vertical(String palavra){
        String nova_palavra = "";
        for (int i = 1; i <= palavra.length(); i++){
            nova_palavra += palavra.charAt(i - 1);
            System.out.println(nova_palavra);
        }
    }
}
