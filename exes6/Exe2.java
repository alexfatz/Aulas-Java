package exes6;
import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        int x = entrada.nextInt();
        entrada.close();

        int soma = soma_primos(x);
        System.out.printf("A soma dos primos de 1 a %d é: %d\n", x, soma);
        boolean eh_primo = is_primo(x);
        System.out.printf("%d é primo? %b\n", x, eh_primo);
    }

    public static boolean is_primo(int n){
        if (n <= 1) return false;

        for (int i = 2; i < n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int soma_primos(int n){
        int soma = 0;

        for (int i = 2; i <= n; i++){
            if (is_primo(i)) soma += i;
        }

        return soma;
    }
}
