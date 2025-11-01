package aula2;

import java.util.Scanner;


public class Exe1 {
    public static void main(String[] args) {
        Scanner entrada_notas = new Scanner(System.in);
		System.out.println("Nota 1:");
		int nota1 = entrada_notas.nextInt();
		System.out.println("Nota 2:");
		int nota2 = entrada_notas.nextInt();
		System.out.println("Nota 3:");
		int nota3 = entrada_notas.nextInt();
		System.out.println("Nota 4:");
		int nota4 = entrada_notas.nextInt();
		entrada_notas.close();
		
		float media_notas = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("Sua média foi de: %.1f\n", media_notas);	
		if (media_notas >= 7.0) {
			System.out.println("Passou de ano!");
		}else {
			System.out.println("Reprovou de ano.");
		}
    }
}
