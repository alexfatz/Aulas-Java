package exes3;
import java.util.Scanner;


public class Exe9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("[1] Bilhete unitário\n[2] Bilhete duplo\n[3] Bilhete de 10 viagens\nInforme o tipo de bilhete:");
		int tipo_i = entrada.nextInt();
		double valor = 0;
		System.out.println("Informe a quantidade:");
		int quant = entrada.nextInt();
		double total = valor*quant;
		double troco = 0;
		
		if (tipo_i == 1) {
			valor = 1.30;
		} else if (tipo_i == 2) {
			valor = 2.60;
		} else valor = 12;
		
		if (total < 5) {
			troco = 5 - total;
		} else if (total < 20) {
			troco = 20 - total;
		} else if (total < 50) {
			troco = 50 - total;
		} else if (total < 100) {
			troco = 100 - total;
		}
		
		System.out.printf("Você comprou %d ingressos!\nSeu troco: R$%.2f\n", quant, troco);

		entrada.close();
	}
}
