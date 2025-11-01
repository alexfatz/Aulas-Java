package exes3;
import java.util.Scanner;


public class Exe8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = entrada.nextInt();
		int parte1 = numero / 100;
		int parte2 = numero % 100;
		
		int parte3 = parte1 + parte2;
		
		System.out.println(parte3 * parte3);

		entrada.close();
	}
}
