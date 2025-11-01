package aula1;

import java.util.Scanner;


public class Exe2 {
    public static void main(String[] args) {
        Scanner entrada_idade = new Scanner(System.in);
		System.out.println("Qual sua idade?");
		int idade = entrada_idade.nextInt();
		entrada_idade.close();
		System.out.println("Você vivou por " + (idade * 360) + " dias");
    }
}
