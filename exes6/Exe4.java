package exes6;
import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int controle = 1;

        while (controle == 1){
            System.out.println("[1] Sim\n[2] Não\nVer tabuada?");
            controle = entrada.nextInt();

            if (controle == 1){
                System.out.println("Qual número? (1 - 11)");
                int x = entrada.nextInt();

                if (x < 1 || x > 11){
                    System.out.println("Somente números de 1 a 11! Tente novamente...");
                } else{
                    tabuada(x);
                }
            } else System.out.println("Saindo...");
        }

        entrada.close();
    }

    public static void tabuada(int n){
        for (int i = 0; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
    }
}
