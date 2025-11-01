package exes7;
import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = entrada.nextLine();
        System.out.println("Digite um caracter:");
        String caracter = entrada.nextLine();
        entrada.close();
        quant_caracter(frase, caracter);
    }

    public static void quant_caracter(String palavra, String caracter){
        int quant = 0;
        for (int i = 0; i < palavra.length(); i++){
            if (palavra.charAt(i) == caracter.charAt(0)) quant++;
        }
        System.out.println("Quantidade de " + caracter + ": " + quant);
    }
}
