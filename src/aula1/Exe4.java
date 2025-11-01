package aula1;

import java.util.Scanner;


public class Exe4 {
    public static void main(String[] args) {
        Scanner entrada_horas = new Scanner(System.in);
        System.out.println("Informe a hora, minuto e segundo atual: (formato 24h)");
        float hora = entrada_horas.nextFloat();
        float minuto = entrada_horas.nextFloat();
        float segundo = entrada_horas.nextFloat();
        entrada_horas.close();
        
        float hora_segundos = hora * 3600;
        float minuto_segundos = minuto * 60;
        
        float segundos_total = hora_segundos + minuto_segundos + segundo;
        
        System.out.printf("Agora são %.0f horas, %.0f minutos e %.0f segundos.\n", hora, minuto, segundos_total);
    }
}
