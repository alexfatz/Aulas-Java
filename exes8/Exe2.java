package exes8;
import aula5.Exe1; // metodo maior indice

import java.util.Scanner;


public class Exe2 {
    public static void main(String[] args) {
        String[] eleitores = { "Maria", "João", "Pedro", "Pamela", "Marcio" };
        int[] votos = coleta_votos(10);
        System.out.printf("Maria: %d\nJoão: %d\nPedro: %d\nPamela: %d\nMarcio: %d\n", votos[0], votos[1], votos[2],
                votos[3], votos[4]);
        
        int maior_indice = Exe1.maior_indice(votos);
        System.out.println("Vencedor: " + eleitores[maior_indice]);
    }
    
    public static int[] coleta_votos(int participantes) {
        int[] votos = new int[participantes];
        int nulos = 0;
        int brancos = 0;
        int quant_votos = 0;
        Scanner entrada = new Scanner(System.in);

        while (quant_votos < participantes) {
            System.out.println("[0] Maria\n[1] João\n[2] Pedro\n[3] Pamela\n[4] Marcio\n[5] Branco");
            int voto = entrada.nextInt();

            if (voto < 0 || voto > 5) {
                nulos++;
                quant_votos++;
            } else if (voto == 5) {
                brancos++;
                quant_votos++;
            } else {
                votos[voto]++;
                quant_votos++;
            }
        }
        entrada.close();

        System.out.println("Votos brancos: " + brancos);
        System.out.println("Votos nulos: " + nulos);

        return votos;
    }
}
