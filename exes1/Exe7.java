package exes1;
import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner entrada_pa = new Scanner(System.in);
		System.out.println("Informe 2 números e receba sua progressão aritimética:");
		double pa_num1 = entrada_pa.nextDouble();
		double pa_num2 = entrada_pa.nextDouble();
		entrada_pa.close();
		System.out.printf("A PA de %.1f e %.1f é: %.1f \n", pa_num1, pa_num2, pa_num2 - pa_num1);
    }
}