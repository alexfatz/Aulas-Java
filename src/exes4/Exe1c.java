package exes4;
import java.util.Scanner;

public class Exe1c {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        double n = entrada.nextDouble();
        double s = 1;

        for (double i = 2; i <= n; i++) {
            if (i % 2 != 0) {
                s += 1 / i;
            } else {
                s -= 1 / i;
            }

            System.out.println(s);
        }

        entrada.close();
	}
}
