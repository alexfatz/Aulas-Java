package exes3;
import java.util.Scanner;


public class Exe1 {
	public static void main(String[] args) {
		Scanner inteiro_entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		int inteiro = inteiro_entrada.nextInt();
		
		if (inteiro < 0) {
			System.out.println("Número negativo.");
		}
		
		if (inteiro % 2 == 0) {
			System.out.println("Par.");
		} else System.out.println("Impar.");

		inteiro_entrada.close();
	}
}
