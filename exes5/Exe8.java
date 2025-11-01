package exes5;
import java.util.Scanner;

public class Exe8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		int x = entrada.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", x, i, x*i);
		}

		entrada.close();
	}
}
