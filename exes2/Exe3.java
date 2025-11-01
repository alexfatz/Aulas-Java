package exes2;

import java.util.Scanner;


public class Exe3 {
    public static void main(String[] args) {
        Scanner entrada_ano_nascimento = new Scanner(System.in);
		System.out.println("Qual seu ano de nascimento?");
		int ano_nascimento = entrada_ano_nascimento.nextInt();
		entrada_ano_nascimento.close();
        int idade_para_voto = 2025 - ano_nascimento;
		
		if (idade_para_voto < 16){
			System.out.println("Não é permitido votar.");
		}else if (idade_para_voto < 18 || idade_para_voto > 65) {
			System.out.println("Voto não obrigatório.");
		}else System.out.println("Voto obrigatório");
    }
}
