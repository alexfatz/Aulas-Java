package aula4;
import java.util.Scanner;


public class Exe4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = entrada.nextLine();
        System.out.println("Digite uma substring:");
        String substring = entrada.nextLine();
        entrada.close();
        palavra_menos_substring(palavra, substring);
    }


    public static void palavra_menos_substring(String palavra, String substring){
        String antes = palavra.substring(0, palavra.indexOf(substring));
        String depois = palavra.substring(palavra.indexOf(substring) + substring.length());
        System.out.println(antes + depois);
    }
}
