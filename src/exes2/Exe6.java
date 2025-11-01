package exes2;

import java.util.Scanner;


public class Exe6 {
    public static void main(String[] args) {
        Scanner entrada_peso_ideal = new Scanner(System.in);
        System.out.println("Qual sua altura?");
        float altura = entrada_peso_ideal.nextFloat();
        System.out.println("Qual seu sexo?\n1 - Masculino\n2 - Feminino");
        int sexo = entrada_peso_ideal.nextInt();

        entrada_peso_ideal.close();
        
        double peso_ideal;
        
        if (sexo == 1) {
            peso_ideal = (72.7 * altura) - 58;
        }else peso_ideal = (62.1 * altura) - 44.7;
        
        System.out.printf("Seu peso ideal é: %.1f \n", peso_ideal);
    }
}
