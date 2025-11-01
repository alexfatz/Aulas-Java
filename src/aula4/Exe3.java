package aula4;
import java.util.Scanner;


public class Exe3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = entrada.nextLine();
        entrada.close();
        palavra_quant_a(palavra);
    }


    public static void palavra_quant_a(String palavra){
        int quant_a = 0;
        for (int i = 1; i <= palavra.length(); i++){
            if (palavra.charAt(i - 1) == 'a' || palavra.charAt(i - 1) == 'A'){
                quant_a ++;
            }
        }

        System.out.printf("Quantidade de A's: %d\n", quant_a);
    }
}
