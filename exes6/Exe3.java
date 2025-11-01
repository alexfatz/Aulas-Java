package exes6;
import java.util.Scanner;
import utils.Fibonacci;

public class Exe3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int x = entrada.nextInt();
        entrada.close();

        System.out.printf("O nnésimo termo é: %d", Fibonacci.fibonacci(x));
    }
}
