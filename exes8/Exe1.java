package exes8;

public class Exe1 {
    public static void main(String[] args) {
        String[] nomes = { "Maria", "João", "Pedro", "Pamela", "Ana", "Joana", "Cristina", "Angelo", "Ricardo",
                "Leticia", "Roberto", "Rafaela", "Pietro", "José", "Antonio", "Paulo", "Marcelo", "Marcos", "Guilherme",
                "Joaquim" };

        int[] idades = { 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 43, 38, 65, 67, 51, 28, 81, 60, 49, 32 };

        int media_idades = media_idades(idades);

        System.out.println("Média de idades: " + media_idades);

        System.out.print("Pessoas com idades acima da média: ");

        for (int i = 0; i < nomes.length; i++) {
            if (idades[i] > media_idades) {
                System.out.printf("%s ", nomes[i]);
            }
        }

    }
    
    public static int media_idades(int[] idades) {
        int soma = 0;
        for (int i = 0; i < idades.length; i++) {
            soma += idades[i];
        }
        return soma / idades.length;
    }
}
