package exes4;
import java.util.Scanner;


public class Exe5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		int digitados = 0;
		int maior = 0;
		int menor = 99999;
		
		int quant_pares = 0;
		int soma_pares = 0;
		
		int controle = 0;
		
		while (controle == 0) {
			System.out.println("Informe um número ou -1 para sair:");
			int y = entrada.nextInt();
			
			if (y > 0) {
				soma += y;
				digitados ++;
				
				if (y > maior) maior = y;
				if (y < menor) menor = y;
				
				if (y % 2 == 0) quant_pares ++; soma_pares += y;
				
			} else if (y == -1) {
				controle = 1;
			} else System.out.println("Somente positivos!");
		}
		
		System.out.printf("Soma é: %d\n", soma);
		System.out.printf("Quantidade: %d\n", digitados);
		System.out.printf("Média: %d\n", soma/digitados);
		System.out.printf("Maior: %d\n", maior);
		System.out.printf("Menor: %d\n", menor);
		System.out.printf("Média pares: %d\n", soma_pares/quant_pares);

		entrada.close();
	}
}
