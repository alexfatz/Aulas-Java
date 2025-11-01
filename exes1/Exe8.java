package exes1;
import java.util.Scanner;


public class Exe8 {
    public static void main(String[] args) {
        Scanner entrada_saque = new Scanner(System.in);
		System.out.println("Informe o valor a ser sacado:");
		int valor_saque = entrada_saque.nextInt();
		entrada_saque.close();
		int notas50;
		int notas20;
		int notas10;
		int notas5;
		int notas2;
		int notas1;
		
		if (valor_saque >= 50) {
			notas50 = valor_saque / 50;
			valor_saque = valor_saque % 50;
			System.out.printf("- %d notas de 50 \n", notas50);
		}

		if (valor_saque >= 20) {
			notas20 = valor_saque / 20;
			valor_saque = valor_saque % 20;
			System.out.printf("- %d notas de 20 \n", notas20);
		}
		
		if (valor_saque >= 10) {
			notas10 = valor_saque / 10;
			valor_saque = valor_saque % 10;
			System.out.printf("- %d notas de 10 \n", notas10);
		}
		
		if (valor_saque >= 5) {
			notas5 = valor_saque / 5;
			valor_saque = valor_saque % 5;
			System.out.printf("- %d notas de 5 \n", notas5);
		}
		
		if (valor_saque >= 2) {
			notas2 = valor_saque / 2;
			valor_saque = valor_saque % 2;
			System.out.printf("- %d notas de 2 \n", notas2);
		}
		
		if (valor_saque >= 1) {
			notas1 = valor_saque / 1;
			System.out.printf("- %d notas de 1 \n", notas1);
		}
    }   
}
