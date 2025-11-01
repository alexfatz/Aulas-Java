package exes3;
import java.util.Scanner;


public class Exe6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe sua altura:");
		double altura = entrada.nextDouble();
		System.out.println("Informe seu peso:");
		double peso = entrada.nextDouble();
		String tipo;
		
		if (altura < 1.30) {
			if (peso < 60) {
				tipo = "A";
			} else if (peso < 85) {
				tipo = "B";
			} else tipo = "C";
		} 

		else if ( altura < 1.70) {
			if (peso < 60) {
				tipo = "D";
			} else if (peso < 85) {
				tipo = "E";
			} else tipo = "F";
		} 

		else {
			if (peso < 60) {
				tipo = "G";
			} else if (peso < 85) {
				tipo = "H";
			} else tipo = "I";
		}

		System.out.printf("Seu tipo: %s", tipo);

		entrada.close();
	}
}
