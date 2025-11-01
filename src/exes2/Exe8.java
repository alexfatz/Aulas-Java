package exes2;

import java.util.Scanner;


public class Exe8 {
    public static void main(String[] args) {
        Scanner entrada_menu_numeros = new Scanner(System.in);
        System.out.println("Digite um número:");
        int menu_num1 = entrada_menu_numeros.nextInt();
        System.out.println("Digite outro número:");
        int menu_num2 = entrada_menu_numeros.nextInt();
        System.out.println("Como operar?\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        int menu_num_escolha = entrada_menu_numeros.nextInt();
        String escolha_menu = "";
        double resultado_escolha = 0;
        entrada_menu_numeros.close();
        
        if (menu_num_escolha == 1) {
            escolha_menu = "Soma";
            resultado_escolha = menu_num1 + menu_num2;

        }else if(menu_num_escolha == 2) {
            escolha_menu = "Subtração";
            resultado_escolha = menu_num1 - menu_num2;
            
        }else if (menu_num_escolha == 3) {
            escolha_menu = "Multiplicação";
            resultado_escolha = menu_num1 * menu_num2;
            
        }else if (menu_num_escolha == 4) {
            escolha_menu = "Divisão";
            resultado_escolha = menu_num1 / menu_num2;
        }
        System.out.printf("A %s de %d e %d é: %.1f \n", escolha_menu, menu_num1, menu_num2, resultado_escolha);
    }
}
