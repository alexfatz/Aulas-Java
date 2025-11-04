package aula5;

public class Exe6_7 {
    public static void main(String[] args) {
        double[] media_alunos = { 6.5, 8.0, 7.0, 5.0, 9.0, 4.0, 6.0, 7.0, 8.0, 9.0, 4.8, 5.7, 8.0, 6.5, 7.0 };

        System.out.printf("Média dos %d alunos: %.1f \nAprovados: %d\n", media_alunos.length, media(media_alunos), aprovados(media_alunos));
    }
    
    public static double media(double[] notas) {
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        return media / notas.length;
    }

    public static int aprovados(double[] notas) {
        int aprovados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 6) {
                aprovados++;
            }
        }
        return aprovados;
    }
}
