package aula2;

import java.util.Scanner;


public class Exe4 {
    public static void main(String[] args) {
        Scanner ano_numero = new Scanner(System.in);
		System.out.println("Digite o número do mês:");
		int numero_mes = ano_numero.nextInt();
		ano_numero.close();
		
		String nome_mes;

		switch (numero_mes) {
		    case 1: nome_mes = "Janeiro"; break;
		    case 2: nome_mes = "Fevereiro"; break;
		    case 3: nome_mes = "Março"; break;
		    case 4: nome_mes = "Abril"; break;
		    case 5: nome_mes = "Maio"; break;
		    case 6: nome_mes = "Junho"; break;
		    case 7: nome_mes = "Julho"; break;
		    case 8: nome_mes = "Agosto"; break;
		    case 9: nome_mes = "Setembro"; break;
		    case 10: nome_mes = "Outubro"; break;
		    case 11: nome_mes = "Novembro"; break;
		    case 12: nome_mes = "Dezembro"; break;
		    default: nome_mes = "Um mês ai..."; break;
		}

		System.out.printf("Mês escolhido: %s", nome_mes);
    }
}
