package exes1;
import java.util.Scanner;


public class Exe4 {
    public static void main(String[] args) {
        Scanner entrada_salarios = new Scanner(System.in);
        System.out.println("Informe o valor do salário mínimo:");
        double valor_salario_minimo = entrada_salarios.nextDouble();
        System.out.println("Informe o valor do seu salário:");
        double valor_salario_pessoal = entrada_salarios.nextDouble();
        entrada_salarios.close();
        double valor_proporcional = valor_salario_pessoal / valor_salario_minimo;
        System.out.printf("Seu salário proporcional ao salário mínimo é: %.1f%% \n", valor_proporcional);
    }
}
