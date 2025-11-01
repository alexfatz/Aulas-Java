package exes5;

import java.util.Scanner;

public class Exe6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		int x = entrada.nextInt();
		System.out.println("Digite outro número:");
		int y = entrada.nextInt();
		
		for (int i = x; i < y; i++) {
			if (i % 2 == 0) {
				int fatorial = 1;
				for (int z = 1; z <= i; z++) {
					fatorial *= z;
				}
				System.out.printf("Fatorial de %d: %d\n", i, fatorial);	
			}
		}

		entrada.close();
	}
}
