package exes1;

import java.util.Scanner;


public class Exe10 {
    public static void main(String[] args) {
        Scanner entrada_horas_atividade = new Scanner(System.in);
		System.out.println("Informe a hora inicial:");
		int hora_inicial = entrada_horas_atividade.nextInt();
		System.out.println("Informe o minuto inicial:");
		int minuto_inicial = entrada_horas_atividade.nextInt();
		System.out.println("Informe a hora final:");
		int hora_final = entrada_horas_atividade.nextInt();
		System.out.println("Informe o minuto final:");
		int minuto_final = entrada_horas_atividade.nextInt();
		entrada_horas_atividade.close();
		int segundos_inicial = (hora_inicial * 3600) + (minuto_inicial * 60);
		int segundos_final = (hora_final * 3600) + (minuto_final * 60);
		int horas_atividade = (segundos_final - segundos_inicial) / 3600;
		int minutos_atividade = ((segundos_final - segundos_inicial) % 3600) / 60;
		System.out.printf("Você participou da atividade por %d horas e %d minutos.", horas_atividade, minutos_atividade);
    }
}
