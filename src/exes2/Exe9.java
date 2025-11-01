package exes2;

import java.util.Scanner;


public class Exe9 {
    public static void main(String[] args) {
        Scanner entrada_idades_HM = new Scanner(System.in);
        System.out.println("Idade primeiro homem:");
        int idade_homem1 = entrada_idades_HM.nextInt();
        System.out.println("Idade segundo homem:");
        int idade_homem2 = entrada_idades_HM.nextInt();
        System.out.println("Idade primeira mulher:");
        int idade_mulher1 = entrada_idades_HM.nextInt();
        System.out.println("Idade segunda mulher:");
        int idade_mulher2 = entrada_idades_HM.nextInt();
        entrada_idades_HM.close();
        
        if (idade_homem1 == idade_homem2 || idade_mulher1 == idade_mulher2) {
            System.out.println("Idades se conflitam.");
        }else {
            int homem_velho;
            int homem_novo;
            if (idade_homem1 > idade_homem2) {
                homem_velho = idade_homem1;
                homem_novo = idade_homem2;
            }else {
                homem_velho = idade_homem2;
                homem_novo = idade_homem1;
            }
            
            int mulher_velha;
            int mulher_nova;
            if (idade_mulher1 > idade_mulher2) {
                mulher_velha = idade_mulher1;
                mulher_nova = idade_mulher2;
            }else {
                mulher_velha = idade_mulher2;
                mulher_nova = idade_mulher1;
            }
            
            System.out.printf("Homem mais velho + Mulher mais nova: %d \nHomem mais novo x Mulher mais velha: %d \n", homem_velho + mulher_nova, homem_novo * mulher_velha);
        }
    }
}
