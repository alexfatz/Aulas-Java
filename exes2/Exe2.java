package exes2;

import java.util.Scanner;


public class Exe2 {
    public static void main(String[] args) {
        Scanner entrada_divisiveis = new Scanner(System.in);
		System.out.println("Informe um número:");
		int divisor1 = entrada_divisiveis.nextInt();
		System.out.println("Informe outro número:");
		int divisor2 = entrada_divisiveis.nextInt();

		entrada_divisiveis.close();
		
		if (divisor1 == 0 || divisor2 == 0) {
			System.out.println("0 é inválido");
		}else {
			if (divisor1 % divisor2 == 0) {
				System.out.println("É divisível");
			}else {
				System.out.println("Não é divisível");
			}
		}
    }
}
