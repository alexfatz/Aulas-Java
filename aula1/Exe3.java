package aula1;

import java.util.Scanner;


public class Exe3 {
    public static void main(String[] args) {
        Scanner entrada_centigrados = new Scanner(System.in);
		System.out.println("Informe a temperatura em centígrados:");
		float temperatura = entrada_centigrados.nextFloat();
		entrada_centigrados.close();
	    System.out.println("Fahrenheit: " + (((9 * temperatura) + 160) / 5) + "F");
    }
}
