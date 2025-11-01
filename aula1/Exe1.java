package aula1;

import java.util.Scanner;


public class Exe1 {
    public static void main(String[] args) {
        Scanner entrada_nome = new Scanner(System.in);
		System.out.println("Olá! Qual seu nome?");
		String nome = entrada_nome.nextLine();
		entrada_nome.close();
		System.out.println("Prazer " + nome + "!");
		System.out.println("Exemplo de operadores:");
		int numero1 = 10, numero2 = 20;
		System.out.println(numero1 + numero2);
    }
}
