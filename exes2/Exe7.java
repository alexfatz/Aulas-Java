package exes2;

import java.util.Scanner;


public class Exe7 {
    public static void main(String[] args) {
        // 3 -> perimetro triangulo -> a + b + c
        // 4 -> area quadrado -> lado * lado
        // 5 -> pentagono

        Scanner entrada_poligono = new Scanner(System.in);
        System.out.println("Quantos lados tem?\n(Válidos: 3, 4 e 5)");
        int numero_lados = entrada_poligono.nextInt();
        entrada_poligono.close();
        
        if (numero_lados < 3 || numero_lados > 5) {
            System.out.println("Valor inválido.");
        }
        
        String nome_poligono;

        if (numero_lados == 3) {
            nome_poligono = "TRIÂNGULO";
            System.out.printf("O perímetro do %s é: %d \n", nome_poligono, numero_lados * 3);
        } else if (numero_lados == 4) {
            nome_poligono = "QUADRADO";
            System.out.printf("A área do %s é: %d", nome_poligono, numero_lados * numero_lados);
        } else {
            nome_poligono = "PENTÁGONO";
            System.out.printf("Você escolheu o polígono: %s \n", nome_poligono);
        }
    }
}
