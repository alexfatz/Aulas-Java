package exes6;
import java.util.Scanner;


public class Exe1 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int x = entrada.nextInt();
        System.out.println("Digite outro número:");
        int y = entrada.nextInt();
        entrada.close();

        System.out.printf("MMC: %d", mmc(x, y));

    }

    public static int mmc(int x, int y) {
		for (int i = 2; i <= x && i <= y; i ++) {
			if (x % i == 0 && y % i == 0) {
				return i;
			}
		}
        return 1;
    }
}
