package exes5;
import java.util.Scanner;


public class Exe7 {
	public static void main(String[] args) {
		System.out.println("Digite um número:");
		Scanner entrada = new Scanner(System.in);
		int x = entrada.nextInt();
		System.out.println("Digite outro número:");
		int y = entrada.nextInt();
		int trava = 0;
		int contador;
		
		if (x > y) {
			contador = x - 1;
		} else if (y < x) {
			contador = y - 1;
		} else contador = x - 1;
		
		while (trava == 0) {
			if (x % contador == 0 && y % contador == 0) {
				trava ++;
				System.out.println("MDC: " + contador);
			}
			contador --;
		}
		
		entrada.close();
	}
}
