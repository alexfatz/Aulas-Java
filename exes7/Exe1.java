package exes7;
import java.util.Scanner;


public class Exe1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um nome:");
        String nome = entrada.nextLine();
        entrada.close();
        nome_comeca_a(nome);
    }


    public static void nome_comeca_a(String nome){
        nome = nome.toLowerCase();
        String primeira_letra = nome.substring(0, 1);
        if (primeira_letra.contains(primeira_letra)){
            System.out.println("Nome: " + nome);
        } else System.out.println("Nome inválido.");
    }
}
