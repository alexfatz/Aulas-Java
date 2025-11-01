package exes5;
import java.util.Scanner;


public class Exe10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		int x = entrada.nextInt();
		System.out.println("Digite outro número:");
		int y = entrada.nextInt();
		int z = 0;
		
		while (z != 6) {
			System.out.println("[1] Somar\n[2] Subtrair\n[3] Multiplicar\n[4] Dividir\n[5] Trocar valores\n[6] Sair\nQual o operação deseja fazer?");
			z = entrada.nextInt();
			
			if (z == 1) {
				System.out.printf("Soma: %d\n", x + y);
				
			} else if (z == 2) {
				System.out.printf("Subtração: %d\n", x - y);
				
			} else if (z == 3) {
				System.out.printf("Multiplicação: %d\n", x * y);
				
			} else if (z == 4) {
				
				if (y == 0) {
					System.out.println("Divisão inválida.");
				} else System.out.printf("Divisão: %d\n", x / y);
				
			} else if (z == 5) {
				System.out.println("Digite um número:");
				x = entrada.nextInt();
				System.out.println("Digite outro número:");
				y = entrada.nextInt();
			} else z = 6;
			
		}
		
		entrada.close();
		System.out.println("Saindo...");
	}
}
