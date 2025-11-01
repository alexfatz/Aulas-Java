package exes3;
import java.util.Scanner;


public class Exe7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("(DATA 1) Informe dia:");
		int dia1 = entrada.nextInt();
		System.out.println("(DATA 1) Informe mês:");
		int mes1 = entrada.nextInt();
		System.out.println("(DATA 1) Informe ano:");
		int ano1 = entrada.nextInt();
		System.out.println("(DATA 2) Informe dia:");
		int dia2 = entrada.nextInt();
		System.out.println("(DATA 2) Informe mês:");
		int mes2 = entrada.nextInt();
		System.out.println("(DATA 2) Informe ano:");
		int ano2 = entrada.nextInt();
		
		int dia3 = 0;
		int mes3 = 0;
		int ano3 = 0;
		
		if (ano2 > ano1) {
			dia3 = dia2;
			mes3 = mes2;
			ano3 = ano2;
		} else if (ano1 > ano2) {
			dia3 = dia1;
			mes3 = mes1;
			ano3 = ano1;
		}
		
		System.out.printf("Data recente: %d/%d/%d", dia3, mes3, ano3);

		entrada.close();
	}
}
