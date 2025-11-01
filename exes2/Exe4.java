package exes2;

import java.util.Scanner;


public class Exe4 {
    public static void main(String[] args) {
        Scanner entrada_compra_macas = new Scanner(System.in);
        System.out.println("Quantas maças deseja comprar?");
        int quantidade_macas = entrada_compra_macas.nextInt();
        double preco_maca;
        entrada_compra_macas.close();
        
        if (quantidade_macas < 12) {
            preco_maca = 0.30;
        }else preco_maca = 0.25;
        System.out.printf("A compra de %d maças ficará R$%.2f reais. \n", quantidade_macas, preco_maca * quantidade_macas);
    }
}
