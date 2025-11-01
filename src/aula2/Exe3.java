package aula2;

import java.util.Scanner;


public class Exe3 {
    public static void main(String[] args) {
        Scanner entrada_ano_casamento = new Scanner(System.in);
		System.out.println("Quantos anos de casamento?");
		int anos_casamento = entrada_ano_casamento.nextInt();
		entrada_ano_casamento.close();
		
		if (anos_casamento == 1) {
			System.out.println("Bodas de papel");
		} else if (anos_casamento == 10) {
			System.out.println("Bodas de estanho");
		} else if (anos_casamento == 20) {
			System.out.println("Bodas de porcelana");
		} else if (anos_casamento == 30) {
			System.out.println("Bodas de pérola");
		} else if (anos_casamento == 40) {
			System.out.println("Bodas de esmeralda");
		} else if (anos_casamento == 50) {
			System.out.println("Bodas de ouro");
		} else {
			System.out.println("Não sei informar.");
		}

        System.out.println("-------------------");
		
		System.out.println("EXEMPLO SWITCH");
		switch(anos_casamento) {
		case 1: System.out.println("Bodas de papel"); break;
		case 10: System.out.println("Bodas de estanho"); break;
		case 20: System.out.println("Bodas de porcelana"); break;
		case 30: System.out.println("Bodas de pérola"); break;
		case 40: System.out.println("Bodas de esmeralda"); break;
		case 50: System.out.println("Bodas de ouro"); break;
		default: System.out.println("Não sei informar."); break;
		}
    }
}
