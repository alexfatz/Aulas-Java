package exes2;

import java.util.Scanner;


public class Exe1 {
    public static void main(String[] args) {
        Scanner entrada_ano_nascimento = new Scanner(System.in);
		System.out.println("Qual seu ano de nascimento?");
		int ano_nascimento = entrada_ano_nascimento.nextInt();

		entrada_ano_nascimento.close();
		
		if (2025 - ano_nascimento < 18) {
			System.out.println("Infelizmente você não pode votar.");
			
		}else System.out.println("Você já pode votar.");
    }
}
