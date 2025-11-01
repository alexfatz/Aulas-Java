package aula3;
import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        int idade = entrada.nextInt();
        voto(idade);
        entrada.close();
    }

    public static void voto(int idade){
        if (idade < 16){
            System.out.println("Não é permitido votar.");
        } else if (idade < 18 || idade > 65){
            System.out.println("Voto não obrigatório.");
        } else {
            System.out.println("Voto obrigatório.");
        }
    }
}
