package exes3;
import java.util.Scanner;

public class Exe3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe seu nível\n[1]\n[2]\n[3]\n");
		int nivel = entrada.nextInt();
		System.out.println("Horas trabalhadas?");
		int horas = entrada.nextInt();
		int valor;
		
		if (nivel == 1) {
			valor = 12;
		} else if (nivel == 2) {
			valor = 17;
		} else valor = 25;
		
		int salario = horas * valor;
		
		System.out.printf("Salário: R$%d,00", salario);

		entrada.close();
	}
}
