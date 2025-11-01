package exes6;
import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		double n = entrada.nextDouble();
        entrada.close();

        System.out.println("---------------------------------------");
        a(n);
        System.out.println("---------------------------------------");
        b(n);
        System.out.println("---------------------------------------");
        c(n);
    }


    public static void a(double n){
        double y = 0;
		
		for (double i = 1; i <= n; i++) {
			y += 1/i;
			System.out.println(y);
		}
    }

    public static void b(double n){
        double s = 0;

        for (int i = 1; i <= n - 1 && n <= 2 + n; i++, n--) {
			s += i/n;
			System.out.println(s);
		}
    }

    public static void c(double n){
        double s = 1;

        for (double i = 2; i <= n; i++) {
            if (i % 2 != 0) {
                s += 1 / i;
            } else {
                s -= 1 / i;
            }

            System.out.println(s);
        }
    }
}
