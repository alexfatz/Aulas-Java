package exes1;
import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner entrada_notas_pesos = new Scanner(System.in);
		System.out.println("Informe abaixo\nNota 01:");
		double nota1 = entrada_notas_pesos.nextDouble();
		System.out.println("Peso da nota 01:");
		double peso1 = entrada_notas_pesos.nextDouble();
		System.out.println("Nota 02:");
		double nota2 = entrada_notas_pesos.nextDouble();
		System.out.println("Peso da nota 02:");
		double peso2 = entrada_notas_pesos.nextDouble();
		System.out.println("Nota 03:");
		double nota3 = entrada_notas_pesos.nextDouble();
		System.out.println("Peso da nota 03:");
		double peso3 = entrada_notas_pesos.nextDouble();
		entrada_notas_pesos.close();
		double preparativo = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
		double media_ponderada = preparativo / (peso1 + peso2 + peso3);
		System.out.printf("Média: %.1f \n", media_ponderada);
    }
}
