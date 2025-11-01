package aula3;
import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Idade do nadador?");
        int idade = entrada.nextInt();
        entrada.close();

        nadador_class(idade);
    }

    public static void nadador_class(int idade){
        if (idade >= 5 && idade <= 7){
            System.out.println("Infantil A");
        } else if (idade >= 8 && idade <= 10){
            System.out.println("Infantil B");
        } else if (idade >= 11 && idade <= 13){
            System.out.println("Juvenil A");
        } else if (idade >= 14 && idade <= 17){
            System.out.println("Juvenil B");
        } else System.out.println("Sênior");
    }
}
