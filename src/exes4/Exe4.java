package exes4;
import java.util.Scanner;

public class Exe4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe seu saldo:");
		double saldo = entrada.nextDouble();
		
		int controle = 0;
		
		while (controle == 0) {
			System.out.println("[1] Depositar\n[2] Sacar\n[3] Sair\nInforme a operação:");
			int x = entrada.nextInt();
			double y;
			
			if (x == 1) {
				System.out.println("Quanto deseja depositar?");
				y = entrada.nextDouble();
				saldo += y;
				System.out.printf("R$%.2f depositados.\n", y);
			} else if (x == 2) {
				System.out.println("Quanto deseja sacar?");
				y = entrada.nextDouble();
				saldo -= y;
				System.out.printf("R$%.2f sacados.\n", y);
			} else {
				controle = 1;
			}
			
			System.out.printf("Saldo atual: R$%.2f\n", saldo);
		}
		
		if (saldo > 0) {
			System.out.println("CONTA REFERENCIAL");
		} else if (saldo < 0) {
			System.out.println("CONTA ESTOURADA");
		} else {
			System.out.println("CONTA ZERADA");
		}
		

		entrada.close();
	}
}
