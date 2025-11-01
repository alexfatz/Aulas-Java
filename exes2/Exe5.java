package exes2;

import java.util.Scanner;


public class Exe5 {
    public static void main(String[] args) {
        Scanner entrada_credito = new Scanner(System.in);
		System.out.println("Qual o valor do item?");
		double valor_item = entrada_credito.nextDouble();
		System.out.println("Em quantas vezes deseja dividir?");
		int quant_prestacao = entrada_credito.nextInt();
		System.out.println("Qual seu salário?");
		double salario = entrada_credito.nextDouble();
		entrada_credito.close();
		
		double valormax_permitido_prestacao = salario * 0.30;
		double valor_item_credito = (valor_item + (valor_item * 0.10));
		double valor_prestacao = valor_item_credito / quant_prestacao;
		
		if (valor_prestacao > valormax_permitido_prestacao) {
			System.out.println("Compra excede o valor permitido.");
		}else System.out.printf("Compra permitida no valor de %.2f divido em %d vezes. \n", valor_item_credito, quant_prestacao);
    }
}
