package exes2;

import java.util.Scanner;


public class Exe10 {
    public static void main(String[] args) {
        Scanner entrada_ano_nascimento = new Scanner(System.in);
        System.out.println("Qual seu ano de nascimento?");
		int ano_nascimento = entrada_ano_nascimento.nextInt();
		entrada_ano_nascimento.close();
        int idade = 2025 - ano_nascimento;

		String categoria_natacao = "";
		int caso = 0;
		if (idade >= 5 && idade <= 7) {
			caso = 1;
		}else if(idade >= 8 && idade <= 10) {
			caso = 2;
		}else if(idade >= 11 && idade <= 13) {
			caso = 3;
		}else if(idade >= 14 && idade <= 17) {
			caso = 4;
		}
		
		switch (caso) {
		case 1: categoria_natacao = "Infantil A"; break;
		case 2: categoria_natacao = "Infantil B"; break;
		case 3: categoria_natacao = "Juvenil A"; break;
		case 4: categoria_natacao = "Juvenil B"; break;
		default: categoria_natacao = "Sênior"; break;
		}

		System.out.println("Sua categoria: " + categoria_natacao);
    }
}
