package aula3;
import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro cateto:");
        int cateto1 = entrada.nextInt();
        System.out.println("Informe o segundo cateto:");
        int cateto2 = entrada.nextInt();
        System.out.println("Informe o hipotenusa:");
        int hipotenusa = entrada.nextInt();
        entrada.close();

        boolean e_triangulo = triangulo(cateto1, cateto2, hipotenusa);

        if (e_triangulo) {
            System.out.printf("É um triângulo... %s\n", tipo_triangulo(cateto1, cateto2, hipotenusa));;
        } else System.out.println("Não é um triângulo...");

    }

    public static boolean triangulo(int cateto1, int cateto2, int hipotenusa){
        if (cateto1 + cateto2 < hipotenusa) {
            return false;
        } else if (cateto1 + hipotenusa < cateto2) {
            return false;
        } else if (cateto2 + hipotenusa < cateto1) {
            return false;
        } else return true;

    }

    public static String tipo_triangulo(int cateto1, int cateto2, int hipotenusa){
        if (cateto1 == cateto2 && cateto2 == hipotenusa) {
            return "equilátero!";
        } else if (cateto1 == cateto2 || cateto1 == hipotenusa || cateto2 == hipotenusa) {
            return "isósceles!";
        } else if (cateto1 != cateto2 && cateto1 != hipotenusa && cateto2 != hipotenusa) {
            return "escaleno!";
        } else return "Não identificado...";
    }

}