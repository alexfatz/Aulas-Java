package exes3;

import java.util.Scanner;

public class Exe4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe seu salário atual:");
		double salario = entrada.nextDouble();
		System.out.println("Informe seu cargo:\n[101] Gerente\n [102] Engenheiro\n [103] Técnico\n [100] Não listado...\n");
		int cargo = entrada.nextInt();
		double porcentagem;
		
		if (cargo == 101) {
			porcentagem = 0.10;
		} else if (cargo == 102) {
			porcentagem = 0.20;
		} else if (cargo == 103) {
			porcentagem = 0.30;
		} else porcentagem = 0.40;
		
		System.out.printf("Seu novo salário: R$%.2f\n", salario + (salario * porcentagem));

		entrada.close();
	}
}
