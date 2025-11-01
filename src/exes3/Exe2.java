package exes3;

import java.util.Scanner;

public class Exe2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro cateto:");
		int cateto1 = entrada.nextInt();
		System.out.println("Informe o segundo cateto:");
		int cateto2 = entrada.nextInt();
		System.out.println("Informe o hipotenusa:");
		int hipotenusa = entrada.nextInt();
		
		if (cateto1 + cateto2 < hipotenusa) {
			System.out.println("Não é um triângulo...");
		} else if (cateto1 + hipotenusa < cateto2) {
			System.out.println("Não é um triângulo...");
		} else if (cateto2 + hipotenusa < cateto1) {
			System.out.println("Não é um triângulo...");
		} else {
			System.out.println("É um triângulo...");
			
			if (cateto1 == cateto2 && cateto2 == hipotenusa) {
				System.out.println("equilátero!");
			} else if (cateto1 == cateto2 || cateto1 == hipotenusa || cateto2 == hipotenusa) {
				System.out.println("isósceles!");
			} else if (cateto1 != cateto2 && cateto1 != hipotenusa && cateto2 != hipotenusa) {
				System.out.println("escaleno!");
			} else System.out.println("Não identificado...");
		}

		entrada.close();
	}
}
