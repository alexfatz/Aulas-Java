package aula3;
import java.util.Scanner;

public class Exe1{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos serão registrados?");
        int quant_alunos = entrada.nextInt();
        entrada.nextLine();

        for (int i = 1; i <= quant_alunos; i++){
            System.out.println("Nome do aluno");
            String nome = entrada.nextLine();
            System.out.println("Média:");
            float media = entrada.nextFloat();
            entrada.nextLine();
            media(nome, media);
        }

        entrada.close();
    }

    public static void media(String nome, float media){
        if (media < 4) {
            System.out.printf("Aluno %s está reprovado. (Média: %.1f)\n", nome, media);
        } else if (media < 7){
            System.out.printf("Aluno %s está de recuperação... (Média: %.1f)\n", nome, media);
        } else System.out.printf("Aluno %s aprovado! (Média: %.1f)\n", nome, media);
    }
}
