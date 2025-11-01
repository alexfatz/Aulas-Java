package exes1;
import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner entrada_centigrados = new Scanner(System.in);
        System.out.println("Informe em centígrados e receba em fahrenheit:");
        float centigrados = entrada_centigrados.nextFloat();
        entrada_centigrados.close();
        float fahrenheit = ((9 * centigrados) + 160) / 5;
        System.out.printf("Centígrados -> Fahrenheit: %.1f \n", fahrenheit);
    }
}