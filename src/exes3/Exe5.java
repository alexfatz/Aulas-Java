package exes3;
import java.util.Scanner;

public class Exe5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe seu saldo médio:");
		double saldo_m = entrada.nextDouble();
		double credito;
		
		if (saldo_m < 200) {
			credito = 0;
		} else if (saldo_m < 400) {
			credito = 0.20;
		} else if (saldo_m < 600) {
			credito = 0.30;
		} else credito = 0.40;
		
		System.out.printf("Crédito disponível: R$%.2f\n", saldo_m * credito);

		entrada.close();
	}
}
