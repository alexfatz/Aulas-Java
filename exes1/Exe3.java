package exes1;
import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner entrada_valor_restaurante = new Scanner(System.in);
		System.out.println("Valor da comanda:");
		double valor_comanda = entrada_valor_restaurante.nextDouble();
		entrada_valor_restaurante.close();
		double valor_comanda_total = valor_comanda + (valor_comanda * 0.10);
		System.out.printf("Valor total a pagar: R$%.2f \n", valor_comanda_total);
    }
}