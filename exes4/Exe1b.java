package exes4;

import java.util.Scanner;

public class Exe1b {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		int i = 1;
		double s = 0;
		
		for (double n = entrada.nextDouble(); i <= n - 1 && n <= 2 + n; i++, n--) {
			s += i/n;
			System.out.println(s);
		}

		entrada.close();
	}
}
