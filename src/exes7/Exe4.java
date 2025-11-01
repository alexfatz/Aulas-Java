package exes7;
import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = entrada.nextLine();
        entrada.close();
        substituir_zero_por_um(frase);
    }

    public static void substituir_zero_por_um(String frase){
        System.out.println(frase.replace("0", "1"));
    }
}
