package exes4;
import java.util.Scanner;

public class Exe2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		int x = entrada.nextInt();
		int controle = 0;
		int anterior = 0;
		int atual = 0;
		int prox = 1;
		
		while (controle == 0) {
			System.out.println(prox);
			anterior = atual;
			atual = prox;
			prox = anterior + prox;
			
			if (x == prox) {
				System.out.println("Está!");
				controle = 1;
			} else if (prox > x) {
				System.out.println("Não está...");
				controle = 1;
			}
		}

		entrada.close();
	}
}
