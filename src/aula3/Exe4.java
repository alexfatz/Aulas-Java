package aula3;
import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do primeiro cateto:");
        int cateto1 = entrada.nextInt();
        System.out.println("Informe o valor do segundo cateto:");
        int cateto2 = entrada.nextInt();
        System.out.println("Informe o valor da hipotenusa:");
        int hipotenusa = entrada.nextInt();

        entrada.close();
        triangulo(cateto1, cateto2, hipotenusa);
    }

    public static void triangulo(int cateto1, int cateto2, int hipotenusa){
        if (cateto1 + cateto2 < hipotenusa) {
            System.out.println("Não é um triângulo...");
        } else if (cateto1 + hipotenusa < cateto2) {
            System.out.println("Não é um triângulo...");
        } else if (cateto2 + hipotenusa < cateto1) {
            System.out.println("Não é um triângulo...");
        } else System.out.println("É um triângulo...");

        if (cateto1 == cateto2 && cateto2 == hipotenusa) {
            System.out.println("equilátero!");
        } else if (cateto1 == cateto2 || cateto1 == hipotenusa || cateto2 == hipotenusa) {
            System.out.println("isósceles!");
        } else if (cateto1 != cateto2 && cateto1 != hipotenusa && cateto2 != hipotenusa) {
            System.out.println("escaleno!");
        } else System.out.println("Não identificado...");
    }
}
