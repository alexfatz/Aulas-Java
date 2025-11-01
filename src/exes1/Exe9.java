package exes1;

import java.util.Scanner;


public class Exe9 {
    public static void main(String[] args) {
        Scanner entrada_locadora = new Scanner(System.in);
		System.out.println("Informe a quantidade de fitas da locadora:");
		int fitas_total = entrada_locadora.nextInt();
		System.out.println("Valor de aluguel das fitas:");
		double valor_aluguel_fita = entrada_locadora.nextDouble();
		entrada_locadora.close();
		double faturamento_mensal = (fitas_total / 3) * valor_aluguel_fita;
		double faturamento_anual = faturamento_mensal * 12;
		double multa_atraso = valor_aluguel_fita + (valor_aluguel_fita * 0.10);
		double multas_mensais = (faturamento_mensal * 0.10) * 0.10;
		double etapa1_rep = fitas_total - (fitas_total * 0.02);
		double reposicao = etapa1_rep + (fitas_total * 0.10);
		System.out.printf("- Faturamento anual: R$%.2f \n", faturamento_anual);
		System.out.printf("- Multa por atraso: R$%.2f \n", multa_atraso);
		System.out.printf("- Valor mensal de multas: R$%.2f \n", multas_mensais);
		System.out.printf("- Valor total da reposição final do ano: %.0f fitas \n", reposicao);
    }
}
