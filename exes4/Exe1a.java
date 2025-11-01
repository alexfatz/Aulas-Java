package exes4;
import java.util.Scanner;

public class Exe1a {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		int n = entrada.nextInt();
		double y = 0;
		
		for (double i = 1; i <= n; i++) {
			y += 1/i;
			System.out.println(y);
		}

		entrada.close();
	}
}
