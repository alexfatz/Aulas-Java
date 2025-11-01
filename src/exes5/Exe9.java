package exes5;
import java.util.Scanner;


public class Exe9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		int x = entrada.nextInt();
		
		for (int i = x; i > 0; i--) {
			System.out.printf("%d %% %d = %d\n", x, i, x/i);
		}

		entrada.close();
	}
}
